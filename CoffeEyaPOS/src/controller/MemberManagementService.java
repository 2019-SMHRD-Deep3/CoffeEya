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

	public ArrayList<Member> memberLookup(String loginId) {
		return dao.selectAll(loginId);
	}
	
	public boolean memberDelete(Member m) {
		int rows = dao.delete(m);
		if (rows == 0)
			return false;
		else
			return true;
	}
	
	public Member memberSelect(Member m) {
		Member selectUser = dao.selectId(m);
		return selectUser;
	}
	
	public boolean memberModify(Member m) {
		int rows = dao.update(m);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
	
}
