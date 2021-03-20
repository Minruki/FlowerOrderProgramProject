package FlowerOrderProgramProject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FlowerOrderProgramProject.dao.customer_informationDao;
import FlowerOrderProgramProject.util.JdbcUtil;
import jdbcFlowerProject.dto.customer_information;

public class customer_informationDaoImpl implements customer_informationDao {
	private static final customer_informationDaoImpl instance = new customer_informationDaoImpl();

	public static customer_informationDaoImpl getInstance() {
		return instance;
	}

	private customer_informationDaoImpl() {

	}

	@Override
	public List<customer_information> selectcustomer_informationByAll() {
		String sql = "select id, member_name, phone_number, cumulative_amount, membership_title from customer_information";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<customer_information> list = new ArrayList<>();
				do {
					list.add(getcustomer_information(rs));
				} while (rs.next());
				System.out.println(list.size());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private customer_information getcustomer_information(ResultSet rs) throws SQLException {
		String id = rs.getString("id");
		String member_name = rs.getString("member_name");
		String phone_number = rs.getString("phone_number");
		int cumulative_amount = rs.getInt("cumulative_amount");
		String membership_title = rs.getString("membership_title");

		return new customer_information(id, member_name, phone_number, cumulative_amount, membership_title);
	}

	@Override
	public customer_information selectcustomer_informationByNo(customer_information customer_information) {
		String sql = "select id, member_name, phone_number from customer_information cus where id = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, customer_information.getId());

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getcustomer_information(rs);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insertcustomer_information(customer_information customer_information) {
		String sql = "insert into customer_information values(?, ?, ?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, customer_information.getId());
			pstmt.setString(2, customer_information.getMember_name());
			pstmt.setString(3, customer_information.getPhone_number());
			pstmt.setInt(4, customer_information.getCumulative_amount());
			pstmt.setString(5, customer_information.getMembership_title());
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updatecustomer_information(customer_information customer_information) {
		String sql = "update customer_information set id = ?, member_name = ?, phone_number = ?, cumulative_amount = ?, membership_title = ? ";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, customer_information.getId());
			pstmt.setString(2, customer_information.getMember_name());
			pstmt.setString(3, customer_information.getPhone_number());
			pstmt.setInt(4, customer_information.getCumulative_amount());
			pstmt.setString(5, customer_information.getMembership_title());
			System.out.println(pstmt);
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int deletecustomer_information(int customer_information) {
		String sql = "delete from customer_information where cumulative_amount = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, cumulative_amount());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int cumulative_amount() {
		// TODO Auto-generated method stub
		return 0;
	}


}
