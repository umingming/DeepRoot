package com.project.data;

public class Category {
	private String seq;
	private String category;
	
	public Category() {
	}

	public Category(String seq, String category) {
		this.seq = seq;
		this.category = category;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "[seq=" + seq + ", category=" + category + "]";
	};

}
