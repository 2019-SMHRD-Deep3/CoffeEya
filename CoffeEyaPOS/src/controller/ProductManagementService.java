package controller;

import java.util.ArrayList;

import model.Member;
import model.Product;
import model.ProductDAO;

public class ProductManagementService {
	
	private ProductDAO dao = new ProductDAO();

	public boolean productJoin(Product p) {
		int rows = dao.insert(p); // 숫자가 넘어오는것
		if (rows == 0)
			return false;
		else
			return true;

	}

	public ArrayList<Product> productLookup() {
		
		return dao.selectOne();
	}
}
