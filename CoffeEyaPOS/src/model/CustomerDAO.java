package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public int insert(Customer c) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO CUSTOMER VALUES (?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c.getCUS_NUMBER());
			psmt.setString(2, c.getCUS_NAME());
			psmt.setString(3, c.getCUS_PHONE());
			psmt.setString(4, c.getCUS_SEX());
			psmt.setString(5, c.getCUS_BIRTHDAY());
			psmt.setInt(6, 0);

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

	public Customer selectOne(Customer c) {
		Customer customerOne = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM CUSTOMER WHERE CUS_NUMBER = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c.getCUS_NUMBER());
			rs = psmt.executeQuery();

			if (rs.next()) {
				String CUS_NUMBER = rs.getString("CUS_NUMBER");
				String CUS_NAME = rs.getString("CUS_NAME");
				String CUS_PHONE = rs.getString("CUS_PHONE");
				String CUS_SEX = rs.getString("CUS_SEX");
				String CUS_BIRTHDAY = rs.getString("CUS_BIRTHDAY");
				int CUS_POINT = rs.getInt("CUS_POINT");

				customerOne = new Customer(CUS_NUMBER, CUS_NAME, CUS_PHONE, CUS_SEX, CUS_BIRTHDAY, CUS_POINT);
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
		return customerOne;
	}

	public ArrayList<Customer> selectAll() {
		ArrayList<Customer> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM CUSTOMER";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String CUS_NUMBER = rs.getString("CUS_NUMBER");
				String CUS_NAME = rs.getString("CUS_NAME");
				String CUS_PHONE = rs.getString("CUS_PHONE");
				String CUS_SEX = rs.getString("CUS_SEX");
				String CUS_BIRTHDAY = rs.getString("CUS_BIRTHDAY");
				int CUS_POINT = rs.getInt("CUS_POINT");

				list.add(new Customer(CUS_NUMBER, CUS_NAME, CUS_PHONE, CUS_SEX, CUS_BIRTHDAY, CUS_POINT));
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

	public int delete(Customer c) {
		int rows = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		PreparedStatement psmt = null;

		try { // try ~ catch ~ finally -> 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "DELETE FROM CUSTOMER WHERE CUS_NUMBER = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c.getCUS_NUMBER());

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
	
	public Customer selectCNumber (Customer c) {
		Customer selectCustomer = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM CUSTOMER WHERE CUS_NUMBER = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c.getCUS_NUMBER());
			rs = psmt.executeQuery();

			if (rs.next()) {
				String CUS_NUMBER = rs.getString("CUS_NUMBER");
				String CUS_NAME = rs.getString("CUS_NAME");
				String CUS_PHONE = rs.getString("CUS_PHONE");
				String CUS_SEX = rs.getString("CUS_SEX");
				String CUS_BIRTHDAY = rs.getString("CUS_BIRTHDAY");
				int CUS_POINT = rs.getInt("CUS_POINT");

				selectCustomer = new Customer(CUS_NUMBER, CUS_NAME, CUS_PHONE, CUS_SEX, CUS_BIRTHDAY, CUS_POINT);
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
		return selectCustomer;
	}

	public int update(Customer c) {
		int rows = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		PreparedStatement psmt = null;

		try { // try ~ catch ~ finally -> 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver driver = new OracleDrivedr(); 객체를 직접 생성하기
																// 위해 코드를 작성하면 오라클 이외의 다른 제품을 사용할때 다 변경해야하는 수고로움이 있다.
			conn = DriverManager.getConnection(url, user, password);
			String sql = "UPDATE Customer SET CUS_NAME = ?, CUS_PHONE = ?, CUS_SEX = ?,  CUS_BIRTHDAY = ?,CUS_POINT = ?,where CUS_NUMBER = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c.getCUS_NUMBER());
			psmt.setString(2, c.getCUS_NAME());
			psmt.setString(3, c.getCUS_PHONE());
			psmt.setString(4, c.getCUS_SEX());
			psmt.setString(5, c.getCUS_BIRTHDAY());
			psmt.setInt(6, c.getCUS_POINT());

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

}
