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
	
	public ArrayList<Product> productPickup() {
		
		return dao.selectOne();
	}

	public ArrayList<Product> productLookup() {

		return dao.selectAll();
	}
	
	public boolean productDelete(Product p) {
		int rows = dao.delete(p);
		if (rows == 0)
			return false;
		else
			return true;
	}
	
//	public Product productSelect(Product p) {
//		Product selectProduct = dao.selectNum(p);
//		return selectProduct;
//	}
	
	public boolean productModify(Product p) {
		int rows = dao.update(p);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
	
}
