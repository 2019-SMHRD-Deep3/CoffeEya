package model;

public class Product {
	
	private String MEM_NAME;
	private int MEM_NUM;
	private int MEM_PRICE;
	
	public Product(String MEM_NAME, int MEM_NUM, int MEM_PRICE) {
		super();
		this.MEM_NAME = MEM_NAME;
		this.MEM_NUM = MEM_NUM;
		this.MEM_PRICE = MEM_PRICE;
	}

	public String getMEM_NAME() {
		return MEM_NAME;
	}

	public int getMEM_NUM() {
		return MEM_NUM;
	}

	public int getMEM_PRICE() {
		return MEM_PRICE;
	}

	public void setMEM_NAME(String MEM_NAME) {
		this.MEM_NAME = MEM_NAME;
	}

	public void setMEM_NUM(int MEM_NUM) {
		this.MEM_NUM = MEM_NUM;
	}

	public void setMEM_PRICE(int MEM_PRICE) {
		this.MEM_PRICE = MEM_PRICE;
	}

	
}
