package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderingDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public int insert(Ordering o) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO ORDERING VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, o.getOR_NUM());
			psmt.setString(2, o.getOR_DATE());
			psmt.setString(3, o.getOR_PAY());
			psmt.setInt(4, o.getOR_SUM());
			psmt.setString(5, o.getMEM_ID());

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

	public Ordering getInfoOrdering(Detail d) {
		Ordering infoOrdering = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM ORDERING WHERE OR_NUM= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, d.getOR_NUM());

			rs = psmt.executeQuery();

			if (rs.next()) {
				int OR_NUM = rs.getInt("OR_NUM");
				String OR_DATE = rs.getString("OR_DATE");
				String OR_PAY = rs.getString("OR_PAY");
				int OR_SUM = rs.getInt("OR_SUM");
				String MEM_ID = rs.getString("MEM_ID");

				infoOrdering = new Ordering(OR_NUM, OR_DATE, OR_PAY, OR_SUM, MEM_ID);
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
		return infoOrdering;
	}

	public ArrayList<Ordering> selectAll() {
		ArrayList<Ordering> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM ORDERING";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int OR_NUM = rs.getInt("OR_NUM");
				int OR_SUM = rs.getInt("OR_SUM");

				list.add(new Ordering(OR_NUM, OR_SUM));
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
