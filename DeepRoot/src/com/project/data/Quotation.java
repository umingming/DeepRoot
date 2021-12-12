package com.project.data;

public class Quotation {
	private String seq;
	private String content;
	private String name;
	
	public Quotation() {
		this("","","");
	}

	public Quotation(String seq, String content, String name) {
		this.seq = seq;
		this.content = content;
		this.name = name;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quotation [seq=" + seq + ", content=" + content + ", name=" + name + "]";
	}
}
