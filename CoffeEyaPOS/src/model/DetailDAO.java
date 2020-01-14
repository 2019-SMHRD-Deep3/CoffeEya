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
 * Detail에 관련된 DB연동 역할
 */
public class DetailDAO {
	/**
	 * 필요한 변수 선언
	 */

	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;

	/**
	 * 로드와 연결하는 생성자 작성
	 */
	public DetailDAO() {

		try {

			// 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"hr", "hr");

			System.out.println("연결되었습니다");

		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 로드 실패");
		} catch (SQLException e) {
			System.out.println(e + "=> 연결 실패");
		}
	}

	/**
	 * db 닫기 기능하는 메소드 작성
	 */
	// 닫기
	public void dbClose() { // null이 아니면 사용한것으로 인식하여 닫아준다.

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
	}// dbClose 끝

	/**
	 * Detail의 모든 레코드를 가져와서 모델에 저장한다. 저장된 모델을 다시 ArrayList에 저장한후 ArrayList 리턴하는
	 * 메소드 작성
	 */
	public ArrayList<Detail> getDetail() {
		ArrayList<Detail> list = new ArrayList<Detail>();
		// 실행
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from detail order by de_num");

			while (rs.next()) {
				int de_num = rs.getInt(1);
				int or_num = rs.getInt(2);
				int pro_num = rs.getInt(3);
				int de_amount = rs.getInt(4);

				// 값을 모델에 저장한다.
				Detail de = new Detail();
				de.setDe_num(de_num);
				de.setOr_num(or_num);
				de.setPro_num(pro_num);
				de.setDe_amount(de_amount);

				// ArrayList에 모델추가한다.
				list.add(de);

			} // while끝

		} catch (SQLException e) {
			System.out.println(e + "=> getDetail Fail");
		} finally {
			dbClose();
		}

		return list;

	}
}
