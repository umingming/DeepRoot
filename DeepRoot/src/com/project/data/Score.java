package com.project.data;

public class Score {
	private String user;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	private int num6;
	private int num7;
	private int num8;
	
	public Score() {
		this("",0,0,0,0,0,0,0,0);
	}
	
	public Score(String user, int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8) {
		this.user = user;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		this.num7 = num7;
		this.num8 = num8;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum3() {
		return num3;
	}
	
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public int getNum4() {
		return num4;
	}
	
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	
	public int getNum5() {
		return num5;
	}
	
	public void setNum5(int num5) {
		this.num5 = num5;
	}
	
	public int getNum6() {
		return num6;
	}
	
	public void setNum6(int num6) {
		this.num6 = num6;
	}
	
	public int getNum7() {
		return num7;
	}
	
	public void setNum7(int num7) {
		this.num7 = num7;
	}
	
	public int getNum8() {
		return num8;
	}
	
	public void setNum8(int num8) {
		this.num8 = num8;
	}

	@Override
	public String toString() {
		return "[user=" + user + ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4
				+ ", num5=" + num5 + ", num6=" + num6 + ", num7=" + num7 + ", num8=" + num8 + "]";
	}
	
}
