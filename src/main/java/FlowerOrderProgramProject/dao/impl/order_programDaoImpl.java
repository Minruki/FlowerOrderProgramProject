package FlowerOrderProgramProject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import FlowerOrderProgramProject.dao.order_programDao;
import FlowerOrderProgramProject.util.JdbcUtil;
import jdbcFlowerProject.dto.order_program;

public class order_programDaoImpl implements order_programDao {
	private static final order_programDaoImpl instance = new order_programDaoImpl();
	
	public static order_programDaoImpl getInstance() {
		return instance;
	}
	private order_programDaoImpl() {
		
	}
	
	
	@Override
	public List<order_program> selectorder_programByAll() {
		String sql = "select ono, order_number, order_date, id, flower_code, order_count, choice, sale_price";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<order_program> list = new ArrayList<>();
				do {
					list.add(getorder_program(rs));
				} while(rs.next());
				System.out.println(list.size());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private order_program getorder_program(ResultSet rs) throws SQLException {
		int ono = rs.getInt("ono");
		String order_number = rs.getString("order_number");
		java.sql.Date order_date = rs.getDate("order_date");
		String id = rs.getString("id");
		String flower_code = rs.getString("flower_code");
		int order_count = rs.getInt("order_count");
		String choice = rs.getString("choice");
		int sale_price = rs.getInt("sale_price");
		
		return new order_program(ono, order_number, order_date, id, flower_code, order_count, choice, sale_price);
	}
	
	@Override
	public order_program selectorder_programByNo(order_program order_program) {
		String sql = "select ono, order_number, order_date, id, flower_code, order_count, choice, sale_price from order_program ord where ono = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, order_program.getOno());
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getorder_program(rs);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertorder_program(order_program order_program) {
		String sql = "insert into order_program values(?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, order_program.getOno());
			pstmt.setString(2, order_program.getOrder_number());
			pstmt.setDate(3, order_program.getOrder_date());
			pstmt.setString(4, order_program.getId());
			pstmt.setString(5, order_program.getFlower_code());;
			pstmt.setInt(6, order_program.getOrder_count());
			pstmt.setString(7, order_program.getChoice());
			pstmt.setInt(8, order_program.getSale_price());
			
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}


	
	
	
	@Override
	public int updateorder_program(order_program order_program) {
		String sql = "update order_program set ono = ?, order_number = ?, order_date = ?, id = ?, flower_code = ?, order_count = ?, choice = ?, sale_price = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
		pstmt.setInt(1, order_program.getOno());
		pstmt.setString(2, order_program.getOrder_number());
		pstmt.setDate(3, order_program.getOrder_date());
		pstmt.setString(4, order_program.getId());
		pstmt.setString(5, order_program.getFlower_code());;
		pstmt.setInt(6, order_program.getOrder_count());
		pstmt.setString(7, order_program.getChoice());
		pstmt.setInt(8, order_program.getSale_price());
		System.out.println(pstmt);
		return pstmt.executeUpdate();

	} catch (SQLException e) {

		e.printStackTrace();
	}

		return 0;
	}

	@Override
	public int deleteorder_program(order_program ono) {
		String sql = "delete from order_program where ono = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, ono());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	private int ono() {
		// TODO Auto-generated method stub
		return 0;
	}

}
