package model;

public class Customer {
	private int CUS_NUMBER;;
	private String CUS_NAME;
	private String CUS_PHONE;
	private String CUS_SEX;
	private String CUS_BIRTHDAY;
	private int CUS_POINT;

	public Customer(int CUS_NUMBER, String CUS_NAME, String CUS_PHONE, String CUS_SEX, String CUS_BIRTHDAY) {
		this.CUS_NUMBER = CUS_NUMBER;
		this.CUS_NAME = CUS_NAME;
		this.CUS_PHONE = CUS_PHONE;
		this.CUS_SEX = CUS_SEX;
		this.CUS_BIRTHDAY = CUS_BIRTHDAY;
		CUS_POINT = 0;
	}

	public Customer(int CUS_NUMBER, String CUS_NAME, String CUS_PHONE, String CUS_SEX, String CUS_BIRTHDAY,
			int CUS_POINT) {
		this.CUS_NUMBER = CUS_NUMBER;
		this.CUS_NAME = CUS_NAME;
		this.CUS_PHONE = CUS_PHONE;
		this.CUS_SEX = CUS_SEX;
		this.CUS_BIRTHDAY = CUS_BIRTHDAY;
		this.CUS_POINT = CUS_POINT;
	}

	public Customer(int infoId) {
		CUS_NUMBER = infoId;
	}

	public int getCUS_NUMBER() {
		return CUS_NUMBER;
	}

	public void setCUS_NUMBER(int CUS_NUMBER) {
		this.CUS_NUMBER = CUS_NUMBER;
	}

	public String getCUS_NAME() {
		return CUS_NAME;
	}

	public void setCUS_NAME(String CUS_NAME) {
		this.CUS_NAME = CUS_NAME;
	}

	public String getCUS_PHONE() {
		return CUS_PHONE;
	}

	public void setCUS_PHONE(String CUS_PHONE) {
		this.CUS_PHONE = CUS_PHONE;
	}

	public String getCUS_SEX() {
		return CUS_SEX;
	}

	public void setCUS_SEX(String CUS_SEX) {
		this.CUS_SEX = CUS_SEX;
	}

	public String getCUS_BIRTHDAY() {
		return CUS_BIRTHDAY;
	}

	public void setCUS_BIRTHDAY(String CUS_BIRTHDAY) {
		this.CUS_BIRTHDAY = CUS_BIRTHDAY;
	}

	public int getCUS_POINT() {
		return CUS_POINT;
	}

	public void setCUS_POINT(int CUS_POINT) {
		this.CUS_POINT = CUS_POINT;
	}

}
