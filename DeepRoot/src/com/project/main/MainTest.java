package com.project.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.project.data.QuotationDAO;
import com.project.data.QuotationDTO;
import com.project.user.User;

public class MainTest {
	private static Login login;
	private static ArrayList<QuotationDTO> list;
	private static Scanner scan;
	
	static {
		scan = new Scanner(System.in);
		login = new Login();
	}
	
	public static void main(String[] args) throws Exception {
//		String tmp = "ㅇㅇㅇ시대의 대표적인 유적으로 부여 송국리 유적, 여주 흔암리 유적이 있다.";
//		System.out.println(tmp.lastIndexOf("ㅇ"));
//		System.out.println(tmp.charAt(tmp.indexOf("ㅇ")));
//		String answer = "청동기";
//		int index = tmp.indexOf("ㅇ");
//		for (int i=index; i<index+answer.length(); i++) {
//			tmp = tmp.replace(tmp.charAt(i), answer.charAt(i));
//			System.out.println(tmp);
//		}
//		String blank = "";
//		for (int i=0; i<answer.length(); i++) {
//			blank += "ㅇ";
//		}
//			tmp = tmp.replace(blank, answer);
//			System.out.println(tmp);
//		
		
		new User("umingming").main();
		
	}
	
	static void before() {
		System.out.println(""
				+ "⠀⠀⠀⢰⣶⣶⠀⢶⣿⣶⠀⣾⣿⡆⠀⠀⠀⢀⣤⣤⣤⣤⣤⣤⡄⠀⢸⣿⣿⠃⠀⠀⠀⠀⠀⠀⣶⣶⠶⠶⣶⣾⣷⠄⠀⣿⣿⣿⠀⠀⠀⠀⢀⣴⣾⡿⠛⠛⠻⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⡶⠒⠒⠒⠒⠺⣿⣿⡆⠀⠀⠀⠀⠀ ⣤⣤⣄⠀⠀ ⠀⣿⣿⡿⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⣿⣿⠶⢾⣿⣿⠶⣿⣿⡇⠀⠀⠀⠈⠛⠀⠀⠈⣿⣿⡇⠀⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⣾⣿⡿⠀⠀ ⣿⣿⣿⠀⠀⠀⠀⢺⣿⣿⡀⠀⠀⠀⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠁⠀⠀⠀⠀⢀⣿⣿⠃⠀⠀⠀⠀⠀⠀⣿⣿⡿⠁⠀ ⠀⣿⣿⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀ ⣿⣿⣀⣸⣿⣿⣀⣿⣿⡇⠀⠀⠀ ⣤⣤⣤⣤⣿⣿⠇ ⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⠟⠁⠀⠀  ⣿⣿⣿⠀⠀⠀⠀⠀⠈⠛⠿⠶⠶⠾⠛⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠋⢀⣀⡀⠀⠀⠀⢠⣿⣿⣿⠁⠀ ⠀⣿⣿⣧⣀⣀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉ ⠀⠀⠀  ⣿⣿⡇⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⠀⠀⠀⠙⠿⠟⠉⠀⠀⠀⠀⠀  ⠛⠛⠋⠀⠀⢶⣶⡦⠤⠤⠤⠤⠤⠤⠤⠤⠶⠾⠷⠀⠀⠀⠀⠈⠿⠛⠉⠉⠉⢹⣿⣿⠉⠉⠉⠉⠉⠁⢠⣿⣿⣿⣿⣷⣦ ⠀⣿⣿⡏⠉⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠿⠟⠛⠛⠛⣿⣿⣿⠛⠛⠛⠛⠛⠀ ⠀⣿⣿⣧⣤⣤⣤⣶⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⠶⠶⠶⠶⠶⠶⠶⠿⠿⠀⠀ ⠀⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣶⣶⠶⠾⠿⠿⢶⣿⣿⡆⠀⠀⠀⢴⣿⡿⠋⢠⣿⣿⠏ ⠀ ⣿⣿⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣶⣷⠀⢰⣾⣷⠀⠀⠀⠀⠀ ⠀⠙⠿⣷⣶⣤⣤⣴⣶⣶⣶⡄⠀⠀⠀⠀⠀  ⠀⠀⠈⠁⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⠀⠀⠉⠀⠀⠀⠉⠀⠀⠀  ⣿⣿⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀ ⠀⠻⠿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠘⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⢶⣶⠿⠿⠧⠼⠿⠿⠶⠷⠀⠀⠀ ⠀⠀⠀⠈⠙⠛⠿⠿⠟⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀  ⠛⠛⠃⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "");
	}
	static void ascii() {
		System.out.println(""
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⢰⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢀⣠⣤⣤⣶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣶⡄⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢀⣴⣄⠀⣰⣶⣶⣴⣶⡄⢠⣿⣿⠀⠀⢶⣶⣶⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣀⣤⣶⣶⣿⣿⣿⣶⡄ ⣸⣿⡇⠀⠀ ⠀⣠⣾⣿⣷⣄⠀⠀⠀⠀⠀⠰⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⣾⣿⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⣾⣿⣇⣠⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⣨⣿⡟⠁⠀⠀⠀⠀⠀  ⠀⣀⣄⡀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⢠⣿⡿⠁⠀⠀⣠⣾⣿⠟⢻⣿⣿⠀⠀⠀⠀⠀⠀⠀⠙⠉⢀⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣠⣾⣿⣦⠀⠀ ⢰⣿⡿⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⢹⣿⣿⢩⣿⡟⠀⠀⠀⣠⣾⡟⠁⠀⠀⠀⠀⠀  ⠀⢀⣼⣿⣿⠃⠘⠿⠿⠟⠋⢁⣾⣿⣿⠏⠀⢸⣿⠃⠀⠀⠀⠸⣿⣿⣷⣶⣾⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣧⣴⣶⣿⣿⡆⠀⠀ ⣠⣾⣿⣿⡿⠛⠀⠀ ⣼⣿⠇ ⣀⣀⡄⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣿⣿⣏⣤⣿⡿⠃⠠⣿⣿⡿⠋⠀⠀⠀⠸⠿⠿⢿⣿⣿⡗⠀⠀ ⠀⣠⠟⢹⣿⡟⠀⠀⠀⠀⠀⢀⣾⣿⡿⠃⠀⠀⠀⢸⣇⡀⠀⠀⢀⡀⠀⣀⣀⣠⣤⣤⣤⣤⣄⡀⠀⠀⢀⣤⣾⣿⣿⣿⣿⠋⠉⠉⠁⠀ ⢀⣼⣿⣿⣿⡋⠀⠀⠀⠀ ⢰⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠸⢿⠿⠿⠋⠀⠀ ⠀⠈⣉⣀⣀⣀⡀⠀⠀⠀⢠⣾⣿⠟⠀⠀⢀⣼⠃⢀⣿⣿⠁⠀⠀⠀⠀⣾⣿⠟⢁⣠⣤⣴⣶⣿⣿⡿⠂⠀⢿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠟⠁⠀⢠⣿⣿⠟⢋⣿⣿⡇⢀⡀⠀⠀⠀⣰⣿⣿⠿⢿⣿⣿⣿⣦⡀⠀ ⣸⣿⡿⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⢀⣀⣤⣶⣶⣿⣿⣿⠟⠛⠛⠉⠀⢀⣴⣿⣿⣁⣠⣤⣶⣿⠃⠀⣼⣿⡇⠀⠀⠀⠀⢸⡿⠋⠀⠈⠻⢿⣿⣿⡿⢋⣤⡀⠀ ⠀⠉⠉⣠⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⣠⣾⣿⣿⠿⠿⣿⣿⡇⠿⠟⠁⠀⠀⠀⠉⠛⠛⠃⠀  ⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⢺⣿⣿⣿⡿⠟⠛⠋⠉⣿⣿⡇⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⠿⠀⢰⣿⡏⠀⠀⠀⠀⠀  ⠀⠀⠀⢠⣿⣿⢋⣴⣿⡿⠃⠀ ⠀⢀⣴⣿⠟⠀⠀⠀⠀⢀⣀⣠⣤⠂⠀⠀⢿⠟⠋⠁ ⠀⣸⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀ ⢸⣿⣿⠀⠀⠀⠀⠈⠻⠿⠿⠛⠋⠉⠁⠀⠀⠀ ⠿⠃⠀ ⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⣿⣿⡿⠋⣀⣀⡄⣠⣾⣿⣯⣤⣶⣶⣾⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀ ⣰⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢸⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⢀⣿⣿⣿⣿⣿⣿⠿⠛⠁ ⠘⠿⠿⠿⠿⠟⠛⠛⠛⠙⠉⠉⠀⠀⠀⠀⠀⠀⠀  ⢰⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀  ⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀ ⠀ ⠈⠿⠛⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "");
	}
}
