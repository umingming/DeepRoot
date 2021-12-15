package com.project.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.project.data.QuotationDAO;
import com.project.data.QuotationDTO;

public class MainTest {
	private static Form form;

	private static Scanner scan;
	private static Random rnd;
	private static ArrayList<QuotationDTO> list;
	
	private static boolean flag;
	private static String sel;
	private static String[] str;
	
	static {
		form = new Form();
		scan = new Scanner(System.in);
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
				
				for(int i=0; i<10; i++) {
					System.out.println(str[i]);
				}
				
				form.getMenu();
				sel = form.select();
				
				if(sel.equals("1")) {
					
				}else if(sel.equals("2")){	
					
				}else if(sel.equals("3")){	

				}else if(sel.equals("X")){
					loop = false;
				}else {
//					str[9] = "\t\t\t\t\t\t입력이 올바르지 않습니다.";
				}
				System.out.println("\r\n\r\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
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
