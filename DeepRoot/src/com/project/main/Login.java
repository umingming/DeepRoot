package com.project.main;

import java.util.*;

import com.project.data.*;
import com.project.user.*;

public class Login {
	private static Form form;
	private static User user;
	
	private static String id;
	private static String pw;
	
	private static String[] str;
	private static ArrayList<UserDTO> list;
	
	static {
		form = new Form();
	}
	
	public void login() throws Exception {
		str = form.getStr();
		str[3] = "\t\t\t\t\t\t계    정: ";
		str[5] = "\t\t\t\t\t\t비밀번호: ";

		while(true) {
			menu();
			
			if(id == null) {
				setId();
			} else if(pw == null) {
				setPw();
			} else {
				id = form.input();
			}
			
			if(id.equalsIgnoreCase("B")) {
				System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
				break;
			} else if(id.equalsIgnoreCase("X")) {
				System.exit(0);
			} else if(isValid()) {
				System.out.println("\r\n\r\n\r\n[회원]\r\n\r\n\r\n");
				user = new User(id);
				user.main();
			} else if(pw != null && !isValid()) {
				str[8] = "\t\t\t\t\t존재하지 않는 계정입니다. 가입 후 이용해주세요.";
			}
			
			System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		}
	}
	
	private void menu() {
		System.out.println("\r\n\r\n\r\n[계정 입력]\r\n\r\n\r\n");
		form.getLogo();
		form.print(str);
		form.getMenu();
	}

	private boolean isValid() throws Exception {
		list = new UserDAO().load();
		
		if(list.stream().anyMatch(u -> u.getId().equals(id))) {
			if(list.stream().filter(u -> u.getId().equals(id))
					.allMatch(u -> u.getPw().equals(pw))) {
				return true;
			}
		}
		return false;
	}

	private void setPw() throws Exception {
		pw = form.input();
		for(int i=0; i<pw.length(); i++) {
			str[5] += "*";
		}
	}

	public void setId() {
		id = form.input();
		str[3] += id;
	}

}
