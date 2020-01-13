package model;

public class Member {

	private String id;
	private String pw;
	private String name;
	private String birthday;
	private String sex;
	private String job;
	private String email;
	private String phone;
	private String address;


	public Member(String id, String pw, String name, String birthday, String sex, String job, String email, String phone,
			String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.job = job;
		this.email = email;
		this.phone = phone;
		this.address = address;
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

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getSex() {
		return sex;
	}

	public String getJob() {
		return job;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
