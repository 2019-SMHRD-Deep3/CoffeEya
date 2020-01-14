package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Detail;

/**
 * Detail�� ���õ� DB���� ����
 */
public class DetailDAO {
	/**
	 * �ʿ��� ���� ����
	 */

	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;

	/**
	 * �ε�� �����ϴ� ������ �ۼ�
	 */
	public DetailDAO() {

		try {

			// �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"hr", "hr");

			System.out.println("����Ǿ����ϴ�");

		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> �ε� ����");
		} catch (SQLException e) {
			System.out.println(e + "=> ���� ����");
		}
	}

	/**
	 * db �ݱ� ����ϴ� �޼ҵ� �ۼ�
	 */
	// �ݱ�
	public void dbClose() { // null�� �ƴϸ� ����Ѱ����� �ν��Ͽ� �ݾ��ش�.

		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (st != null)
				st.close();
		} catch (SQLException e) {
			System.out.println(e + "dbClose fail");
		}
	}// dbClose ��

	/**
	 * Detail�� ��� ���ڵ带 �����ͼ� �𵨿� �����Ѵ�. ����� ���� �ٽ� ArrayList�� �������� ArrayList �����ϴ�
	 * �޼ҵ� �ۼ�
	 */
	public ArrayList<Detail> getDetail() {
		ArrayList<Detail> list = new ArrayList<Detail>();
		// ����
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from detail order by de_num");

			while (rs.next()) {
				int de_num = rs.getInt(1);
				int or_num = rs.getInt(2);
				int pro_num = rs.getInt(3);
				int de_amount = rs.getInt(4);

				// ���� �𵨿� �����Ѵ�.
				Detail de = new Detail();
				de.setDe_num(de_num);
				de.setOr_num(or_num);
				de.setPro_num(pro_num);
				de.setDe_amount(de_amount);

				// ArrayList�� ���߰��Ѵ�.
				list.add(de);

			} // while��

		} catch (SQLException e) {
			System.out.println(e + "=> getDetail Fail");
		} finally {
			dbClose();
		}

		return list;

	}
}
