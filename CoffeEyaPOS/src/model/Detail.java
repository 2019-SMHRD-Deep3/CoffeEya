package model;

public class Detail {

	private int DE_NUM;
	private int OR_NUM;
	private int PRO_NUM;
	private int DE_AMOUNT;

	public Detail(int DE_NUM, int OR_NUM, int PRO_NUM, int DE_AMOUNT) {
		this.DE_NUM = DE_NUM;
		this.OR_NUM = OR_NUM;
		this.PRO_NUM = PRO_NUM;
		this.DE_AMOUNT = DE_AMOUNT;
	}

	public Detail() {
	}

	public int getDE_NUM() {
		return DE_NUM;
	}

	public void setDE_NUM(int DE_NUM) {
		this.DE_NUM = DE_NUM;
	}

	public int getOR_NUM() {
		return OR_NUM;
	}

	public void setOR_NUM(int OR_NUM) {
		this.OR_NUM = OR_NUM;
	}

	public int getPRO_NUM() {
		return PRO_NUM;
	}

	public void setPRO_NUM(int PRO_NUM) {
		this.PRO_NUM = PRO_NUM;
	}

	public int getDE_AMOUNT() {
		return DE_AMOUNT;
	}

	public void setDE_AMOUNT(int DE_AMOUNT) {
		this.DE_AMOUNT = DE_AMOUNT;
	}

}
