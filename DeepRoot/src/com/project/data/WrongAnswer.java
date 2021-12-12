package com.project.data;

public class WrongAnswer {
	private String seq;
	private String userSeq;
	private String quesitonSeq;
	private String date;
	
	public WrongAnswer() {
		this("","","","");
	}

	public WrongAnswer(String seq, String userSeq, String quesitonSeq, String date) {
		this.seq = seq;
		this.userSeq = userSeq;
		this.quesitonSeq = quesitonSeq;
		this.date = date;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(String userSeq) {
		this.userSeq = userSeq;
	}

	public String getQuesitonSeq() {
		return quesitonSeq;
	}

	public void setQuesitonSeq(String quesitonSeq) {
		this.quesitonSeq = quesitonSeq;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[seq=" + seq + ", userSeq=" + userSeq + ", quesitonSeq=" + quesitonSeq + ", date=" + date
				+ "]";
	}

}
