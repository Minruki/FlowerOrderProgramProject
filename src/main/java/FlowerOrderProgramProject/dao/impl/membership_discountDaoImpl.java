package FlowerOrderProgramProject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FlowerOrderProgramProject.dao.membership_discountDao;
import FlowerOrderProgramProject.util.JdbcUtil;
import jdbcFlowerProject.dto.membership_discount;
import jdbcFlowerProject.dto.order_program;

public class membership_discountDaoImpl implements membership_discountDao {
	private static final membership_discountDaoImpl instance = new membership_discountDaoImpl();

	public static membership_discountDaoImpl getInstance() {
		return instance;

	}

	public membership_discountDaoImpl() {

	}

	@Override
	public List<membership_discount> selectmembership_discountByAll() {
		String sql = "select membership_title, discount_rate from membership_discount";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<membership_discount> list = new ArrayList<>();
				do {
					list.add(getmembership_discount(rs));
				} while (rs.next());
				System.out.println(list.size());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private membership_discount getmembership_discount(ResultSet rs) throws SQLException {
		String membership_title = rs.getString("membership_title");
		String discount_rate = rs.getString("discount_rate");

		return new membership_discount(membership_title, discount_rate);
	}

	@Override
	public membership_discount selectmembership_discountByNo(membership_discount membership_discount) {
		String sql = "select membership_title, discount_rate from membership_discount from membership_discount where membership_title = ? ";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, membership_discount.getMembership_title());
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getmembership_discount(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertmembership_discount(membership_discount membership_discount) {
		String sql = "insert into membership_discount values(?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, membership_discount.getMembership_title());
			pstmt.setString(2, membership_discount.getDiscount_rate());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int updatemembership_discount(membership_discount membership_discount) {
		String sql = "update membership_discount set membership_title = ?, where discount_rate = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, membership_discount.getMembership_title());
			pstmt.setString(2, membership_discount.getDiscount_rate());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deletemembership_discount(String discount_rate) {
		String sql = "delete from membership_discount where discount_rate = ?";
		
		try(Connection con = JdbcUtil.getConnection();
		
			PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, discount_rate());
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

				
		return 0;
	}

	private String discount_rate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<order_program> selectorder_programByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public order_program selectorder_programByNo(order_program order_program) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertorder_program(order_program neworder_program) {
		// TODO Auto-generated method stub
		return 0;
	}

}
