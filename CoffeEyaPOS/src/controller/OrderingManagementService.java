package controller;

import java.util.ArrayList;

import model.Ordering;
import model.OrderingDAO;
import model.Product;

public class OrderingManagementService {

	private OrderingDAO dao = new OrderingDAO();

	public boolean OrderingJoin(Ordering o) {
		int rows = dao.insert(o);
		if (rows == 0)
			return false;
		else
			return true;
	}

	public int OrderingCount() {

		return dao.orderingCount();
	}
	
	public int OrderingSum(String deadLineTime2) {
		return dao.selectOrderingSum(deadLineTime2);
	}
	
	public int OrderingCashSum(String deadLineTime2) {
		return dao.selectOrderingCashSum(deadLineTime2);
	}
	
	public int OrderingCardSum(String deadLineTime2) {
		return dao.selectOrderingCardSum(deadLineTime2);
	}

}
