package FlowerOrderProgramProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jdbcFlowerProject.dto.flower_information;

public class JdbcFlowerProjectMain {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<flower_information> list = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/flowerorderprogram?useSSL=false";
			String user = "user_flower";
			String password = "rootroot";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("con >" + con);
			
			stmt = con.createStatement();
			System.out.println("stmt > " + stmt);
			
			String sql = "select flower_code, flower_name, flower_price from flower_information";
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			System.out.println(list);
			while(rs.next()) {
				list.add(getflower_information(rs));
				
			}
			System.out.println(list);
		} catch(ClassNotFoundException e) {
			System.err.println("JDBC Driver Not Found");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { rs.close();   } catch (SQLException e) {}
			try { stmt.close(); } catch (SQLException e) {}
			try { con.close();  } catch (SQLException e) {}
			 
		}
		System.out.println("flower_information Query 결과는");
		for(flower_information f : list) {
			System.out.println(f);
		}

	}

	private static flower_information getflower_information(ResultSet rs) throws SQLException { 
		String flower_code = rs.getString("flower_code"); 
		String flower_name = rs.getString("flower_name");
		int flower_price = rs.getInt("flower_price");
		
		return new flower_information(flower_code, flower_name, flower_price);
	}

}
