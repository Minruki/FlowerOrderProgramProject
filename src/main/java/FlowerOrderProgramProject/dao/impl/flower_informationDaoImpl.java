package FlowerOrderProgramProject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FlowerOrderProgramProject.dao.flower_informationDao;
import FlowerOrderProgramProject.util.JdbcUtil;
import jdbcFlowerProject.dto.flower_information;

public class flower_informationDaoImpl implements flower_informationDao {

	private static flower_informationDaoImpl instance = new flower_informationDaoImpl();

	public static flower_informationDaoImpl getInstance() {
		if (instance == null) {
			instance = new flower_informationDaoImpl();
		}
		return instance;
	}

	@Override
	public List<flower_information> selectflower_informationByAll() {
		String sql = "select flower_code, flower_name, flower_price from flower_information";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<flower_information> list = new ArrayList<>();
				do {
					list.add(getflower_information(rs));
				} while (rs.next());
				System.out.println(list.size());
				return list;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private flower_information getflower_information(ResultSet rs) throws SQLException {
		String flower_code = rs.getString("flower_code");
		String flower_name = rs.getString("flower_name");
		int flower_price = rs.getInt("flower_price");
		
		return new flower_information(flower_code, flower_name, flower_price);
	}

	@Override 
	public flower_information selectflower_informationByNo(flower_information flower_information) {
		String sql = "select flower_code, flower_name, flower_price flower_information where flower_code = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_code());
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getflower_information(rs);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insertflower_information(flower_information flower_information) {
		String sql = "insert into flower_information values(?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_code());
			pstmt.setString(2, flower_information.getFlower_name());
			pstmt.setInt(3, flower_information.getFlower_price());
			return pstmt.executeUpdate();
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateflower_information(flower_information flower_information) {
		String sql = "update flower_information set flower_code = ?, flower_name = ?, flower_price =?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_code());
			pstmt.setString(2, flower_information.getFlower_name());
			pstmt.setInt(3, flower_information.getFlower_price());
			System.out.println(pstmt);
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int deleteflower_information(flower_information flower_price) {
		String sql = "delete from flower_information where  flower_price";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, flower_price());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int flower_price() {
		
		return 0;
	}

}
