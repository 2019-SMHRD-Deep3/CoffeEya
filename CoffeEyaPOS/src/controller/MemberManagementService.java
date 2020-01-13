package controller;

import java.util.ArrayList;

import model.Member;
import model.MemberDAO;

public class MemberManagementService {

	private MemberDAO dao = new MemberDAO();

	public boolean memberJoin(Member m) {
		int rows = dao.insert(m); // 숫자가 넘어오는것
		if (rows == 0)
			return false;
		else
			return true;

	}

	public Member memberLogin(Member m) {
		Member loginUser = dao.selectOne(m);
		return loginUser;
	}

	public ArrayList<Member> memberLookup(String id) {
		return dao.selectAll(id);
	}
}
