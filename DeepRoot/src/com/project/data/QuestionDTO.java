package com.project.data;

public class QuestionDTO {
	private String seq;
	private String categorySeq;
	private String num;
	private String question;
	private String answer;
	
	public QuestionDTO() {
		this("","","","","");
	}

	public QuestionDTO(String seq, String categorySeq, String num, String question, String answer) {
		this.seq = seq;
		this.categorySeq = categorySeq;
		this.num = num;
		this.question = question;
		this.answer = answer;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getCategorySeq() {
		return categorySeq;
	}

	public void setCategorySeq(String categorySeq) {
		this.categorySeq = categorySeq;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "[seq=" + seq + ", categorySeq=" + categorySeq + ", num=" + num + ", question=" + question
				+ ", answer=" + answer + "]";
	}
	
}
