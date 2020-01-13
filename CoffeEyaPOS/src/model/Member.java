package model;

public class Member {

	private String id;
	private String pw;
	private int birthday;
	private int hot_ice;

	public Member(String id, String pw, int birthday, int hot_ice) {
		this.id = id;
		this.pw = pw;
		this.birthday = birthday;
		this.hot_ice = hot_ice;
	}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public int getBirthday() {
		return birthday;
	}

	public int getHot_ice() {
		return hot_ice;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public void setHot_ice(int hot_ice) {
		this.hot_ice = hot_ice;
	}

}
