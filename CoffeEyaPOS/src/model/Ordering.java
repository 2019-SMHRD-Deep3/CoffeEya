package model;

public class Ordering {

	private int OR_NUM;
	private String OR_DATE;
	private String OR_PAY;
	private int OR_SUM;
	private String MEM_ID;

	public Ordering(int OR_NUM, String OR_DATE, String OR_PAY, int OR_SUM, String MEM_ID) {
		this.OR_NUM = OR_NUM;
		this.OR_DATE = OR_DATE;
		this.OR_PAY = OR_PAY;
		this.OR_SUM = OR_SUM;
		this.MEM_ID = MEM_ID;

	}

	public Ordering(int OR_NUM, int OR_SUM) {
		this.OR_NUM = OR_NUM;
		this.OR_SUM = OR_SUM;
	}
	
	public Ordering() {
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
