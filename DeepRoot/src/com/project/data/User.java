package com.project.data;

public class User {
	private String seq;
	private String name;
	private String id;
	private String pw;
	private String ssn;
	private String tel;
	private String school;
	
	public User() {
		this("","","","","","","");
	}
	
	public User(String seq, String name, String id, String pw, String ssn, String tel, String school) {
		this.seq = seq;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ssn = ssn;
		this.tel = tel;
		this.school = school;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "[seq=" + seq + ", name=" + name + ", id=" + id + ", pw=" + pw + ", ssn=" + ssn + ", tel=" + tel
				+ ", school=" + school + "]";
	}

}
