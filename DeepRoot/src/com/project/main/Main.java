package com.project.main;

import java.io.*;
import java.util.*;

import com.project.data.*;
import com.project.data.QuotationDTO;

public class Main {
	private static Form form;

	private static Random rnd;
	private static ArrayList<QuotationDTO> list;
	
	private static boolean flag;
	private static String sel;
	private static String[] str;
	
	static {
		form = new Form();
		rnd = new Random();
		str = form.getStr();
	}
	
	public static void main(String[] args) {
		try {
			if(!flag) form.getAscii();
			flag = false;
			boolean loop = true;
			
			while(loop) {
				form.getLogo();
				getQuotation();
				menu();
				form.print(str);
				form.getMenu();
				sel = form.input();
				
				if(sel.equals("1")) {
					
				}else if(sel.equals("2")){	
					
				}else if(sel.equals("3")){	

				}else if(sel.equals("X")){
					loop = false;
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
				str[2] = String.format("%70s", q.getContent());
				str[3] = String.format("%80s-%s-", "", q.getName());
			});
	}

	private static void menu() throws Exception {
		str[5] = "\t\t\t\t\t\t\t1. 시작하기";
		str[6] = "\t\t\t\t\t\t\t2. 회원 가입";
		str[7] = "\t\t\t\t\t\t\t3. 계정 찾기";
	}
}
