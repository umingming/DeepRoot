package com.project.data;

public class Study {
	private String seq;
	private String userSeq;
	private String quesitonSeq;
	private String answer;
	
	public Study() {
		this("","","","");
	}

	public Study(String seq, String userSeq, String quesitonSeq, String answer) {
		this.seq = seq;
		this.userSeq = userSeq;
		this.quesitonSeq = quesitonSeq;
		this.answer = answer;
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

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "[seq=" + seq + ", userSeq=" + userSeq + ", quesitonSeq=" + quesitonSeq + ", answer=" + answer
				+ "]";
	}
	
}
