package model;

public class Ordering {
	
	private String MEM_ID;
	private String OR_DATE;
	private int OR_NUM;
	private String OR_PAY;
	private int OR_SUM;
	
	public Ordering(String MEM_ID, String OR_DATE, int OR_NUM, String OR_PAY, int OR_SUM) {
		this.MEM_ID = MEM_ID;
		this.OR_DATE = OR_DATE;
		this.OR_NUM = OR_NUM;
		this.OR_PAY = OR_PAY;
		this.OR_SUM = OR_SUM;
		
		
		
	}

	public void setMEM_ID(String MEM_ID) {
		this.MEM_ID = MEM_ID;
	}

	public void setOR_DATE(String OR_DATE) {
		this.OR_DATE = OR_DATE;
	}

	public void setOR_NUM(int OR_NUM) {
		this.OR_NUM = OR_NUM;
	}

	public void setOR_PAY(String OR_PAY) {
		this.OR_PAY = OR_PAY;
	}

	public void setOR_SUM(int OR_SUM) {
		this.OR_SUM = OR_SUM;
	}

	public String getMEM_ID() {
		return MEM_ID;
	}

	public String getOR_DATE() {
		return OR_DATE;
	}

	public int getOR_NUM() {
		return OR_NUM;
	}

	public String getOR_PAY() {
		return OR_PAY;
	}

	public int getOR_SUM() {
		return OR_SUM;
	}

}
