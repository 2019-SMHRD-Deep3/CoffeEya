package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DetailDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public int insert(Detail d) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO MEMBER VALUES (?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, d.getDE_NUM());
			psmt.setInt(2, d.getOR_NUM());
			psmt.setInt(3, d.getPRO_NUM());
			psmt.setInt(4, d.getDE_AMOUNT());

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


	public ArrayList<Detail> selectAll() {
		ArrayList<Detail> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM DETAIL";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				// 해당 ID와 PW를 가진 사람이 존재
				int DE_NUM = rs.getInt("DE_NUM");
				int OR_NUM = rs.getInt("OR_NUM");
				int PRO_NUM = rs.getInt("PRO_NUM");
				int DE_AMOUNT = rs.getInt("DE_AMOUNT");

				list.add(new Detail(DE_NUM, OR_NUM, PRO_NUM, DE_AMOUNT));
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

