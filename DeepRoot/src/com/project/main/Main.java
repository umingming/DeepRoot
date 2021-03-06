package com.project.main;

import java.io.*;
import java.util.*;

import com.project.data.*;
import com.project.data.QuotationDTO;

public class Main {
	private static Form form;
	private static Login login;

	private static Scanner scan;
	private static Random rnd;
	private static ArrayList<QuotationDTO> list;
	
	private static boolean flag;
	private static String sel;
	private static String[] str;
	
	static {
		scan = new Scanner(System.in);
		form = new Form();
		login = new Login();
		rnd = new Random();
	}
	
	public static void main(String[] args) {
		try {
			if(!flag) form.getAscii();
			flag = false;
			
			while(true) {
				menu();
				
				if(sel.equals("1")) {
					System.out.println("\r\n\r\n\r\n[계정 입력]\r\n\r\n\r\n");
					login.login();
				}else if(sel.equals("2")){	
					
				}else if(sel.equals("3")){	

				}else if(sel.equalsIgnoreCase("X")){
					System.exit(0);
				}else {
					
				}
				
				System.out.println("\r\n\r\n");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
	
	private static void getQuotation() throws Exception {
		String seq = rnd.nextInt(10) + 1 + "";
		
		list = new QuotationDAO().load();
		list.stream()
			.filter(q -> q.getSeq().equals(seq))
			.forEach(q -> {
				str[1] = String.format("%70s", q.getContent());
				str[2] = String.format("%80s-%s-", "", q.getName());
			});
	}

	private static void menu() throws Exception {
		str = form.getStr();
		form.getLogo();

		scan.nextLine();
		getQuotation();
		
		str[6] += "\t1. 시작하기";
		str[7] += "\t2. 회원 가입";
		str[8] += "\t3. 계정 찾기";
		
		form.print(str);
		form.getMenu();
		sel = form.input();
		System.out.println();
	}
}
