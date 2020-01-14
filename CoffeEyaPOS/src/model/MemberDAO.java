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
			String sql = "INSERT INTO MEMBER VALUES (?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getMEM_ID());
			psmt.setString(2, m.getMEM_PW());
			psmt.setString(3, m.getMEM_NAME());
			psmt.setString(4, m.getMEM_PERM());

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

	public Member selectOne(Member m) {
		Member loginUser = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM MEMBER WHERE MEM_ID = ? AND MEM_PW =? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getMEM_ID());
			psmt.setString(2, m.getMEM_PW());
			rs = psmt.executeQuery();

			if (rs.next()) {
				// 해당 ID와 PW를 가진 사람이 존재
				String MEM_ID = rs.getString("MEM_ID");
				String MEM_PW = rs.getString("MEM_PW");
				String MEM_NAME = rs.getString("MEM_NAME");
				String MEM_PERM = rs.getString("MEM_PERM");

				loginUser = new Member(MEM_ID, MEM_PW, MEM_NAME, MEM_PERM);
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
		return loginUser;
	}

	public ArrayList<Member> selectAll(String loginId) {
		ArrayList<Member> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM MEMBER WHERE MEM_ID != ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, loginId);
			rs = psmt.executeQuery();

			while (rs.next()) {
				// 해당 ID와 PW를 가진 사람이 존재
				String MEM_ID = rs.getString("MEM_ID");
				String MEM_PW = rs.getString("MEM_PW");
				String MEM_NAME = rs.getString("MEM_NAME");
				String MEM_PERM = rs.getString("MEM_PERM");

				list.add(new Member(MEM_ID, MEM_PW, MEM_NAME, MEM_PERM));
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
