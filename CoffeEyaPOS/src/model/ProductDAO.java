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
			psmt.setInt(1, p.getPRO_NUM());
			psmt.setString(2, p.getPRO_NAME());
			psmt.setInt(3, p.getPRO_PRICE());

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
				String PRO_NAME = rs.getString("PRO_NAME");
				int PRO_PRICE = rs.getInt("PRO_PRICE");

				list.add(new Product(PRO_NAME, PRO_PRICE));
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
	
	public ArrayList<Product> selectAll() {
		ArrayList<Product> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM PRODUCT";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int PRO_NUM = rs.getInt("PRO_NUM");
				String PRO_NAME = rs.getString("PRO_NAME");
				int PRO_PRICE = rs.getInt("PRO_PRICE");

				list.add(new Product(PRO_NUM, PRO_NAME, PRO_PRICE));
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

	public Product getInfoProduct(Detail d) {
		Product infoProduct = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM PRODUCT WHERE PRO_NUM= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, d.getPRO_NUM());
			rs = psmt.executeQuery();

			if (rs.next()) {
				int PRO_NUM = rs.getInt("PRO_NUM");
				String PRO_NAME = rs.getString("PRO_NAME");
				int PRO_PRICE = rs.getInt("PRO_PRICE");

				infoProduct = new Product(PRO_NUM, PRO_NAME, PRO_PRICE);
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
		return infoProduct;
	}
	
	public int delete(Product p) {
		int rows = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try { // try ~ catch ~ finally -> 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "DELETE FROM PRODUCT WHERE PRO_NUM = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, p.getPRO_NUM());
			
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
	
//	public Product selectNum (Product p) {
//		Product selectProduct = null;
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(url, user, password);
//			String sql = "SELECT * FROM Product WHERE PRO_NUM = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, p.getPRO_NUM());
//			rs = psmt.executeQuery();
//
//			if (rs.next()) {
//				// 해당 ID와 PW를 가진 사람이 존재
//				int PRO_NUM = rs.getInt("PRO_NUM");
//				String PRO_NAME = rs.getString("PRO_NAME");
//				int PRO_PRICE = rs.getInt("PRO_PRICE");
//
//				selectProduct = new Product(PRO_NUM, PRO_NAME, PRO_PRICE);
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null) {
//					rs.close();
//				}
//				if (psmt != null) {
//					psmt.close();
//				}
//				if (conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//		return selectProduct;
//	}
	
	public int update(Product p) {
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
			String sql = "UPDATE PRODUCT SET PRO_NAME = ?, PRO_PRICE = ? WHERE PRO_NUM = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, p.getPRO_NAME());
			psmt.setInt(2, p.getPRO_PRICE());
			psmt.setInt(3, p.getPRO_NUM());
			
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
