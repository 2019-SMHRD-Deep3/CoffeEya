package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public int insert(Product p) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO PRODUCT VALUES (?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(2, p.getPRO_NUM());
			psmt.setString(1, p.getPRO_NAME());
			psmt.setInt(3, p.getPRO_PRICE());

			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("SQL문을 확인하세요");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return rows;
	}

	public ArrayList<Product> selectOne() {
		ArrayList<Product> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM PRODUCT WHERE PRO_NUM == ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 1);
			rs = psmt.executeQuery();

			while (rs.next()) {
				// 해당 ID와 PW를 가진 사람이 존재
				String PRO_NAME = rs.getString("PRO_NAME");
				int PRO_PRICE = rs.getInt("PRO_PRICE");

				list.add(new Product(PRO_NAME, PRO_PRICE ));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return list;
	}

}
