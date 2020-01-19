package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VaultCashDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public int insert(VaultCash vaultcash) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO VAULTCASH VALUES (?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vaultcash.getM1());
			psmt.setInt(2, vaultcash.getM2());
			psmt.setInt(3, vaultcash.getM3());
			psmt.setInt(4, vaultcash.getM4());
			psmt.setInt(5, vaultcash.getM5());
			psmt.setInt(6, vaultcash.getM6());
			psmt.setInt(7, vaultcash.getM7());
			psmt.setInt(8, vaultcash.getM8());

			rows = psmt.executeUpdate();

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
	
	public int vaultCashSum() {
		int sum = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM VAULTCASH";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			if (rs.next()) {
				// 해당 ID와 PW를 가진 사람이 존재
				int M1 = rs.getInt("COLUMN1");
				int M2 = rs.getInt("COLUMN2");
				int M3 = rs.getInt("COLUMN3");
				int M4 = rs.getInt("COLUMN4");
				int M5 = rs.getInt("COLUMN5");
				int M6 = rs.getInt("COLUMN6");
				int M7 = rs.getInt("COLUMN7");
				int M8 = rs.getInt("COLUMN8");
				sum = (M1 * 50000) + (M2 * 10000) + (M3 * 5000) + (M4 * 1000) + (M5 * 500) + (M6 * 100) + (M7 *50) + (M8 * 10);
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
		return sum;
	}
	
	public int[] vaultCashData() {
		int[] list = new int[8];
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM VAULTCASH";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			if (rs.next()) {
				// 해당 ID와 PW를 가진 사람이 존재
				int M1 = rs.getInt("COLUMN1");
				int M2 = rs.getInt("COLUMN2");
				int M3 = rs.getInt("COLUMN3");
				int M4 = rs.getInt("COLUMN4");
				int M5 = rs.getInt("COLUMN5");
				int M6 = rs.getInt("COLUMN6");
				int M7 = rs.getInt("COLUMN7");
				int M8 = rs.getInt("COLUMN8");
				
				list[0] = M1;
				list[1] = M2;
				list[2] = M3;
				list[3] = M4;
				list[4] = M5;
				list[5] = M6;
				list[6] = M7;
				list[7] = M8;
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
