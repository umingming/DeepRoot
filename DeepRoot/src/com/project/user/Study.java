package com.project.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.UserDTO;
import com.project.main.Form;
import com.project.main.Main;

public class Study {
	private static Form form;
	private static UserDTO user;

	private static String input;
	private static String pw;
	private static String newPw;
	
	private static Scanner scan;
	private static String[] str;
	private static ArrayList<UserDTO> userList;
	
	static {
		scan = new Scanner(System.in);
	}
	
	public void select(UserDTO user) {
		Study.user = user;
		form = new Form();
		
		while(true) {
			form.getLogo();
			
			if(input == null) {
				menu();
			} else if(input.equals("1")) {
				solveQuestion();
			} else if (input.equals("2")) {
				correctAnswer();
			} else if (input.equalsIgnoreCase("B")) {
				break;
			} else if(input.equalsIgnoreCase("X")) {
				System.exit(0);
			}
			
		}
	}
	
	private void correctAnswer() {
		// TODO Auto-generated method stub
		
	}

	private void solveQuestion() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		if (input.equalsIgnoreCase("B")) {
			return;
		} else if(input.equalsIgnoreCase("X")) {
			System.exit(0);
		} else if(pw == null) {
			setPw();
		} else if(isPwRight()) {
			str = form.getStr();
			str[6] += "탈퇴가 정상적으로 처리되었습니다.";
			print();
			form.input();
			new Main().main(null);
		}
		
		
	}

	private void updatePw() {
		if (input.equalsIgnoreCase("B")) {
			return;
		} else if(input.equalsIgnoreCase("X")) {
			System.exit(0);
		} else if(pw == null) {
			setPw();
		} else if(isPwRight()) {
			if(newPw == null) {
				setNewPw();
			} else {
				checkPw();
			}
		} else {
			print();
			input = form.input();
			input = null;
			pw = null;
			newPw = null;
		}
	}
	
	private void checkPw() {
		print();
		pw = form.input();
		str[6] += form.mask(pw);
		
		if(pw.equals(newPw)) {
			user.setPw(newPw);
			str[8] += "정상적으로 변경되었습니다.";
		} else {
			str[8] += "입력이 일치하지 않습니다.";
		}
	}

	private void setPw() {
		str = form.getStr();
		str[3] += "현재 비밀번호: ";
		print();
		pw = form.input();
		
		for(int i=0; i<pw.length(); i++) {
			str[3] += "*";
		}
	}

	private boolean isPwRight() {
		if(pw.equals(user.getPw())) {
			return true;
		} else {
			str[7] += "입력이 일치하지 않습니다.";
			return false;
		}
	}

	private void setNewPw() {
		str[5] += "    비밀번호: ";
		print();
		newPw = form.input();
		
		for(int i=0; i<newPw.length(); i++) {
			str[5] += "*";
		}
		str[6] += "    확    인: ";
	}

	private void checkUpdate() {
		str[7] += "  정상적으로 변경되었습니다.";
		print();
		input = null;
	}
	
	private void print() {
		form.print(str);
		form.getMenu();
	}
	
	private void menu() {
		str = form.getStr();
		getInfo();
		str[6] += "\t1. 비밀번호 변경";
		str[7] += "\t2. 탈퇴하기";
		print();
		input = form.input();
	}

	private void getInfo() {
		str[1] += "    이    름: " + user.getName();
		str[2] += "    생년월일: " + getBirthdate();
		str[3] += "    소    속: " + user.getSchool();
	}

	private String getBirthdate() {
		String year = user.getSsn().substring(0, 2) + "년 ";
		String month = user.getSsn().substring(2, 4) + "월 ";
		String date = user.getSsn().substring(4, 6) + "일 ";
		
		return year + month + date;
	}
}

