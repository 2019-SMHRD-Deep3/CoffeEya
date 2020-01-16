package model;

public class Member {

	private String MEM_ID;
	private String MEM_PW;
	private String MEM_NAME;
	private String MEM_PERM;
	
	public Member() {
		
	}
	
	public Member(String MEM_ID) {
		this.MEM_ID = MEM_ID;
	}

	public Member(String MEM_ID, String MEM_PW, String MEM_NAME, String MEM_PERM) {
		this.MEM_ID = MEM_ID;
		this.MEM_PW = MEM_PW;
		this.MEM_NAME = MEM_NAME;
		this.MEM_PERM = MEM_PERM;
	}
	
	public Member(String MEM_ID, String MEM_PW) {
		this.MEM_ID = MEM_ID;
		this.MEM_PW = MEM_PW;
	}

	public void setMEM_ID(String MEM_ID) {
		this.MEM_ID = MEM_ID;
	}

	public void setMEM_PW(String MEM_PW) {
		this.MEM_PW = MEM_PW;
	}

	public void setMEM_NAME(String MEM_NAME) {
		this.MEM_NAME = MEM_NAME;
	}

	public void setMEM_PERM(String MEM_PERM) {
		this.MEM_PERM = MEM_PERM;
	}

	public String getMEM_ID() {
		return MEM_ID;
	}

	public String getMEM_PW() {
		return MEM_PW;
	}

	public String getMEM_NAME() {
		return MEM_NAME;
	}

	public String getMEM_PERM() {
		return MEM_PERM;
	}

}
