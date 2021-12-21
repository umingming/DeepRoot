package com.project.user;

import java.util.ArrayList;

import com.project.data.*;
import com.project.main.*;

public class AccountManagement {
	private static Form form;
	private static UserDTO user;

	private static String sel;
	
	private static String[] str;
	private static ArrayList<UserDTO> userList;
	
	public void info(UserDTO user) {
		AccountManagement.user = user;
		form = new Form();
		
		while(true) {
			str = form.getStr();
			form.getLogo();
			
			if(sel == null) {
				menu();
			} else if(sel.equals("1")) {
				updateSchool();
			} else if (sel.equals("2")) {
				updatePw();
			} else if (sel.equals("3")) {
				
			} else if (sel.equalsIgnoreCase("B")) {
				break;
			} else if(sel.equalsIgnoreCase("X")) {
				System.exit(0);
			} else {
				checkUpdate();
			}
			
		}
	}

	private void updatePw() {
		// TODO Auto-generated method stub
		
	}

	private void updateSchool() {
		str[5] += "    소    속: ";
		print();
		str[5] += sel;
	}

	private void checkUpdate() {
		str[6] += "정상적으로 변경되었습니다.";
		print();
		sel = null;
	}
	
	private void print() {
		form.print(str);
		form.getMenu();
		sel = form.input();
	}
	
	private void menu() {
		getInfo();
		str[6] += "\t1. 소속 변경";
		str[7] += "\t2. 비밀번호 변경";
		str[8] += "\t3. 탈퇴하기";
		print();
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
