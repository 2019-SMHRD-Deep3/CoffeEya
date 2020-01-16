package controller;

import java.util.ArrayList;

import model.Customer;
import model.CustomerDAO;

public class CustomerManagementService {
	private CustomerDAO dao = new CustomerDAO();

	public boolean customerJoin(Customer c) {
		int rows = dao.insert(c); // 숫자가 넘어오는것
		if (rows == 0)
			return false;
		else
			return true;
	}

	public Customer getInfoCustomer(Customer c) {
		Customer selectCustomer = dao.selectCNumber(c);
		return selectCustomer;
	}

	public ArrayList<Customer> customerLookup() {
		return dao.selectAll();
	}

	public boolean customerDelete(Customer c) {
		int rows = dao.delete(c);
		if (rows == 0)
			return false;
		else
			return true;
	}

	public boolean customerModify(Customer c) {
		int rows = dao.update(c);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}

}
