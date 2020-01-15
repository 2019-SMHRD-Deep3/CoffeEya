package model;

public class Product {

	private int PRO_NUM;
	private String PRO_NAME;
	private int PRO_PRICE;

	public Product(int PRO_NUM) {
		this.PRO_NUM = PRO_NUM;
	}

	public Product(String PRO_NAME, int PRO_PRICE) {

		this.PRO_NAME = PRO_NAME;
		this.PRO_PRICE = PRO_PRICE;
	}

	public Product(int PRO_NUM, String PRO_NAME, int PRO_PRICE) {
		super();
		this.PRO_NUM = PRO_NUM;
		this.PRO_NAME = PRO_NAME;
		this.PRO_PRICE = PRO_PRICE;
	}

	public int getPRO_NUM() {
		return PRO_NUM;
	}

	public String getPRO_NAME() {
		return PRO_NAME;
	}

	public int getPRO_PRICE() {
		return PRO_PRICE;
	}

	public void setPRO_NUM(int PRO_NUM) {
		this.PRO_NUM = PRO_NUM;
	}

	public void setPRO_NAME(String PRO_NAME) {
		this.PRO_NAME = PRO_NAME;
	}

	public void setPRO_PRICE(int PRO_PRICE) {
		this.PRO_PRICE = PRO_PRICE;
	}

}
