package controller;

import java.util.ArrayList;

import model.Detail;
import model.DetailDAO;

public class DetailManagementService {

	private DetailDAO dao = new DetailDAO();

	public boolean detailRegister(Detail d) { // Detail 등록
		int rows = dao.insert(d); // 숫자가 넘어오는것
		if (rows == 0)
			return false;
		else
			return true;

	}


	public ArrayList<Detail> detailLookup() {
		return dao.selectAll();
	}
}
