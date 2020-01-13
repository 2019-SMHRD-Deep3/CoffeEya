package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public int insert(Member m) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getId());
			psmt.setString(2, m.getPw());
			psmt.setString(3, m.getName());
			psmt.setString(4, m.getBirthday());
			psmt.setString(5, m.getSex());
			psmt.setString(6, m.getJob());
			psmt.setString(7, m.getEmail());
			psmt.setString(8, m.getPhone());
			psmt.setString(9, m.getAddress());
			
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

}
