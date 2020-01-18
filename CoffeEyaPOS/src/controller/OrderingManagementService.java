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
	
	public int OrderingSum() {
		return dao.selectOrderingSum();
	}
	
	public int OrderingCashSum() {
		return dao.selectOrderingCashSum();
	}
	
	public int OrderingCardSum() {
		return dao.selectOrderingCardSum();
	}

}
