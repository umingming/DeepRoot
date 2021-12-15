package com.project.main;

import java.util.*;

import com.project.data.*;

public class Login {
	private static Form form;

	private static Scanner scan;
	private static ArrayList<UserDTO> list;
	
	private static String id;
	private static String pw;
	private static String[] str;
	
	static {
		form = new Form();
		scan = new Scanner(System.in);
		
		str = form.getStr();
		str[3] = "\t\t\t\t\t\t계    정: ";
		str[5] = "\t\t\t\t\t\t비밀번호: ";
	}
	
	public void login() throws Exception {
		boolean loop = true;
	
		while(loop) {
			form.getLogo();
			form.print(str);
			form.getMenu();
			
			if(id == null) {
				setId();
			} else if(pw == null) {
				setPw();
			} else {
				if(isVaild()) {
					loop = false;
				} else {
					goMain();
				}
			}
			System.out.println("\r\n\r\n");
		}
	}
	
	private void goMain() {
		str[8] = "\t\t\t\t존재하지 않는 계정입니다. 가입 후 이용해주세요.";
		form.input();
		scan.nextLine();
	}

	private boolean isVaild() throws Exception {
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
