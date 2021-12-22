package com.project.main;

import java.util.Random;
import java.util.Scanner;

public class Form {
	private static Scanner scan;
	private static String[] str;
	
	static {
		scan = new Scanner(System.in);
		str = new String[10];
	}
	
	public String[] getStr() {
		for(int i=0; i<10; i++) {
			str[i] = "\t\t\t\t\t\t";
		}
		
		return str;
	}
	
	public String mask(String str) {
		String tmp = "";
		for(int i=0; i<str.length(); i++) {
			tmp += "*";
		}
		return tmp;
	}
	
	public void print(String[] str) {
		for(int i=0; i<10; i++) {
			System.out.println(str[i]);
		}
	}
	
	public void getMenu() {
		System.out.println("\n\n\n--------------------------------------------------------------------------------------------------------------------------");
		System.out.println("  B. 뒤로 가기 | X. 종료하기");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
	}
	
	public String input() {
		System.out.print("  👉 ");
		return scan.nextLine();
	}
	
	public void getLogo() {
		System.out.println(""
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⢸⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢀⣠⣤⣤⣶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣶⡄⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢀⣴⣄⠀⣰⣶⣶⣴⣶⡄⢠⣿⣿⠀⠀⢶⣶⣶⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣀⣤⣶⣶⣿⣿⣿⣶⡄ ⣸⣿⡇⠀⠀ ⠀⣠⣾⣿⣷⣄⠀⠀⠀⠀⠀⠰⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⣾⣿⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⣾⣿⣇⣠⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⣨⣿⡟⠁⠀⠀⠀⠀⠀  ⠀⣀⣄⡀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⢠⣿⡿⠁⠀⠀⣠⣾⣿⠟⢻⣿⣿⠀⠀⠀⠀⠀⠀⠀⠙⠉⢀⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣠⣾⣿⣦⠀⠀ ⢰⣿⡿⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⢹⣿⣿⢩⣿⡟⠀⠀⠀⣠⣾⡟⠁⠀⠀⠀⠀⠀  ⠀⢀⣼⣿⣿⠃⠘⠿⠿⠟⠋⢁⣾⣿⣿⠏⠀⢸⣿⠃⠀⠀⠀⠸⣿⣿⣷⣶⣾⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣧⣴⣶⣿⣿⡆⠀⠀ ⣠⣾⣿⣿⡿⠛⠀⠀ ⣼⣿⠇ ⣀⣀⡄⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣿⣿⣏⣤⣿⡿⠃⠠⣿⣿⡿⠋⠀⠀⠀⠸⠿⠿⢿⣿⣿⡗⠀⠀ ⠀⣠⠟⢹⣿⡟⠀⠀⠀⠀⠀⢀⣾⣿⡿⠃⠀⠀⠀⢸⣇⡀⠀⠀⢀⡀⠀⣀⣀⣠⣤⣤⣤⣤⣄⡀⠀⠀⢀⣤⣾⣿⣿⣿⣿⠋⠉⠉⠁⠀ ⢀⣼⣿⣿⣿⡋⠀⠀⠀⠀ ⢰⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠸⢿⠿⠿⠋⠀⠀ ⠀⠈⣉⣀⣀⣀⡀⠀⠀⠀⢠⣾⣿⠟⠀⠀⢀⣼⠃ ⢀⣿⣿⠁⠀⠀⠀⣾⣿⠟⢁⣠⣤⣴⣶⣿⣿⡿⠂⠀⢿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠟⠁⠀⢠⣿⣿⠟⢋⣿⣿⡇⣀⣀⢀ ⠀⣰⣿⣿⠿⢿⣿⣿⣿⣦⡀⠀ ⣸⣿⡿⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⢀⣀⣤⣶⣶⣿⣿⣿⠟⠛⠛⠉⠀⢀⣴⣿⣿⣁⣠⣤⣶⣿⠃⠀ ⣼⣿⡇⠀⠀⠀⢸⡿⠋⠀⠈⠻⢿⣿⣿⡿⢋⣤⡀⠀ ⠀⠉⠉  ⣠⣤⡀⠀⠀⠀⠀⠀⠀⠀⠉⠀⣠⣾⣿⣿⠿⠿⣿⣿⡇⠿⠟⠁⠀⠀ ⠀ ⠉⠛⠛⠃ ⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⢺⣿⣿⣿⡿⠟⠛⠋⠉⣿⣿⡇⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⠿⠀  ⢰⣿⡏⠀⠀⠀⠀  ⠀⠀⠀⢠⣿⣿⢋⣴⣿⡿⠃⠀  ⠀ ⢀⣴⣿⠟⠀⠀ ⢀⣀⣠⣤⠂⠀⠀⢿⠟⠋⠁ ⠀⣸⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀ ⢸⣿⣿⠀⠀⠀⠈⠻⠿⠿⠛⠋⠉⠁⠀⠀⠀   ⠿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⣿⣿⡿⠋⣀⣀⡄ ⣠⣾⣿⣯⣤⣶⣶⣾⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀ ⣰⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀    ⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢸⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⢀⣿⣿⣿⣿⣿⣿⠿⠛⠁ ⠘⠿⠿⠿⠿⠟⠛⠛⠛⠙⠉⠉⠀⠀⠀⠀⠀⠀⠀ ⢰⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀ ⠀⠀ ⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀ ⠀ ⠈⠿⠛⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"
				+ "");
	}
	
	public void getAscii() {
		System.out.print("\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣄⠀⠀⠀⠀⠀⢀⠀⠀⠀⣴⣿⡟⠀⠀⠀⣿⣷⠀⠀⡀⠀⢠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⢠⣤⣄⢻⣿⡆⢀⣠⡄⠀⢸⣷⡄⢼⡿⠟⠀⠀⠀⠀⠹⣿⢠⣾⠇⠀⢼⣿⠀⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣆⠀⠙⢿⡇⠻⢣⣾⣿⠃⠀⠈⠻⢇⢠⣶⣿⡿⠂⠰⣷⡄⡆⠛⠉⢸⣷⡘⣿⣸⣿⠃⠀⠀⠀⢠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⡄⠀⠀⠻⠿⢀⣄⠻⣿⣷⡌⠟⠁⢠⣦⠀⢰⠃⠈⠉⠁⠰⣶⣄⡛⠃⡇⣠⣾⢀⡙⠁⢠⠉⢀⣠⡤⠀⢰⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⠃⠸⣿⣷⣼⣼⣟⣠⡄⢀⣀⢳⡀⠸⣿⢢⡿⠀⣠⣶⠀⠀⠈⠛⠷⠀⡷⠿⠃⣼⣿⠀⣿⢠⣿⣿⣥⡀⢸⡿⠁⣀⡄⠀⢰⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣦⣌⠋⢀⣄⠈⠉⢉⣷⣿⡿⠃⠙⠛⠋⠻⣦⡉⢼⣇⢸⣿⠏⠀⠰⣶⣶⣶⡄⢻⣄⠀⢿⡟⢰⡇⢈⣉⠉⠉⠀⢈⢡⣾⡿⠃⠀⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⡄⠀⢀⠀⢉⣻⣏⢸⣸⢏⣶⡀⣸⠋⠉⠀⠀⣀⠀⣠⣤⣌⡻⣿⣿⠈⠁⠀⡀⠀⣼⡿⠟⠀⣴⣽⣷⡌⢡⡿⢘⣛⡁⢰⣷⡄⢸⠘⠉⠀⡀⠀⠘⠟⢀⣴⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⢰⣿⡇⠙⠛⠋⠀⢷⡈⣿⣇⣿⠀⣰⡄⣾⣿⠀⠉⠛⠛⠋⢸⣿⡆⣠⣾⡟⣠⣶⠀⠹⣿⣾⡛⢸⣿⡿⣷⣿⠟⢁⡀⠛⠿⡼⠀⠀⠀⢿⣷⡄⡇⣾⠟⠁⠀⢠⣴⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⠷⢪⡋⠀⢀⣤⡆⠀⠈⢷⣌⢸⣿⢸⣿⡇⣛⣥⣤⠀⠀⣀⠀⢈⣿⡇⢿⣋⠀⠉⣥⣤⣤⡈⠉⣡⣾⢟⣥⣍⡀⠀⠸⣿⡆⡼⠱⣿⠿⠋⣨⡙⠛⡇⢀⣤⡄⢠⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⠀⠀⣠⣄⢱⡀⣾⣿⠇⠻⣿⣮⡻⣿⣿⣜⠛⣼⣿⠿⠋⠀⢸⣿⡆⢸⣿⠇⠻⠿⠿⠂⣈⣛⠛⣫⣾⢟⣡⣬⠛⣛⡛⢸⡧⣨⣟⣥⣶⠂⠀⠀⠹⢿⣾⢁⣾⡿⠁⠀⢁⣴⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣦⡈⠛⢀⣴⡘⢿⣷⣷⠙⠁⠀⠀⣤⣶⣶⡾⠛⠿⣿⣶⣤⣤⣀⠀⠘⠿⠇⣾⣿⠀⣠⡄⠀⠈⠛⢛⣿⣿⣥⣼⣿⠁⠀⣿⡇⣨⠟⠁⠻⠿⠷⠀⢀⣶⡆⠀⢸⡌⠉⢀⣄⠀⢸⣿⡇⣠⣶⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⠀⣾⡿⢁⠀⠈⣿⠀⣴⣿⠂⠉⠉⠁⠀⣀⠀⢀⣬⣭⣝⠻⢿⣷⣦⣾⣿⡏⣼⡿⠃⢠⣄⢠⣿⠏⠿⠟⠋⡁⠺⣶⢽⣿⣫⣾⠏⢀⣾⡆⢠⣿⡿⣡⣶⠸⣷⠀⣿⡿⠀⢘⣟⠾⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⠘⠁⢸⣷⣸⡿⠸⢟⡁⠀⠀⣤⠀⢰⣿⠂⢠⣿⣿⠟⠀⠀⠙⢿⣿⣿⣷⠉⢰⣦⣿⢿⣿⢏⣴⡶⠂⠘⢿⣷⡄⣿⡇⠋⣡⡄⠈⣿⢇⡨⢋⣀⣉⢁⣀⢻⣧⣛⣵⡾⢋⣀⣀⣀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢉⣉⠀⠀⠙⢮⣋⣿⢁⣾⣿⠇⠀⠸⣿⣷⠈⠋⢀⠀⠀⠀⠀⢰⣶⡀⠀⠙⣿⣿⣦⡘⣿⡇⣼⡿⢀⣥⣴⡦⠀⠀⠉⠁⣿⣷⢸⣿⣷⣿⡴⠋⠾⠿⠿⠋⠈⠻⢷⣿⡿⣫⣔⠻⠿⠿⠟⠁⢠⣾⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠘⣿⡆⣀⡀⠀⢻⣿⡜⣛⠁⢠⣦⣄⡙⠟⠀⣾⣿⠀⣶⣶⣤⡘⢿⣷⠠⣶⣾⠙⢿⣿⣦⡀⣿⡇⣾⡿⠛⠁⠻⣿⣿⡆⢻⣿⣯⣫⡾⣯⣶⡾⠂⣴⣆⣾⣇⣴⡿⣋⣨⣭⣁⠀⢰⣷⠀⡀⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⣮⡁⣿⡇⢠⣄⢹⣿⠛⠛⢂⠙⠻⠿⠸⡞⠿⠃⠀⠀⠙⠛⢛⣀⠹⠶⠶⣦⣄⡀⠙⢿⣿⣿⣇⠰⣶⣶⡦⠀⢀⣴⣶⠆⢹⣿⠟⠁⠈⠛⠛⠀⢿⣿⢨⣾⡟⠑⠿⠟⠛⢱⣿⠸⣯⠞⠳⣿⣿⣷⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣷⣦⣄⠀⣬⡙⠛⠇⣙⣃⣈⣻⢷⢻⡇⣴⣿⠆⢠⣤⣀⣿⡀⠀⣠⡄⠀⣴⣿⠏⢀⣴⣿⡿⠉⠻⣶⣄⢻⣿⣿⡄⠀⣠⣴⠀⠈⠉⣧⢠⣿⡏⣠⣾⣿⠟⠸⣿⡌⢩⣿⡟⢀⣤⡀⣾⡇⣘⢵⣫⠿⠷⠖⣠⡄⠀⣀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣦⠻⡷⠀⣷⡄⠈⠉⠙⠻⣿⣿⡿⠛⠀⠈⠛⠿⢻⣧⢸⡿⠃⠀⢛⣁⡀⠈⠉⣡⣴⣶⣶⣮⣿⣧⣻⣿⣷⢾⣿⣧⠰⣶⣦⣿⣿⣿⢐⣛⣋⠁⢠⣴⣬⣳⣿⣟⣤⡾⢿⣿⣟⣿⣋⣛⣡⡄⠀⣾⣿⠁⣼⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣶⡆⠑⢦⣻⠇⠀⢠⣄⢰⡿⠙⢿⣦⡀⢰⣶⡀⢸⣿⠰⠶⠶⠆⢈⣻⡷⡤⠾⠋⢁⣾⠟⠛⠻⣿⣿⣿⣿⡆⢀⣠⡄⠈⠙⠋⣿⣿⠈⠻⠿⠷⢠⣶⢠⣿⡿⣽⣿⣦⠀⠈⣿⡿⠿⠋⣿⡇⠘⠟⣡⡄⢀⣴⣶⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠉⠀⠀⣄⡙⢦⠀⢿⡿⣨⣤⡆⠀⠻⣷⡸⣿⡇⣿⡿⠀⠀⠠⣾⡿⠟⡁⠰⠿⠷⠾⣡⡀⠀⠀⠘⣿⣿⣿⡇⡿⠟⠁⠹⠿⠦⣿⣿⡄⢠⣶⠀⢘⣽⣿⡟⠁⠉⠉⠀⣤⡄⣿⡇⣾⣇⣩⣮⡤⣾⡿⣁⠺⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣀⡀⢿⣷⠈⢳⡈⢹⡿⠟⢵⣶⣦⣻⣿⡌⠀⣿⡇⢠⣿⡆⠀⣰⣿⡿⠀⣴⣿⠇⠹⣿⣦⠀⠀⣿⣿⣿⡇⢀⣴⣷⢰⡿⢏⣿⣿⡇⢿⣏⣴⣿⣿⣫⡄⣶⡿⢀⣀⣻⣿⣿⣴⣿⣛⡓⢻⣖⠛⠩⣶⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⠿⠿⠀⠩⢄⡀⣷⠀⠀⠀⠀⠿⠿⠃⠹⢿⣦⣿⣿⣌⡛⠁⠀⣿⡿⠁⠘⠟⠃⠀⣀⠀⢉⣦⢠⣿⣿⣿⠇⣿⣿⠃⢀⣴⣿⣿⣿⣵⣾⣿⣿⣿⣽⣿⣭⣯⣥⣬⣽⣿⢿⣛⡁⠈⠻⠿⠏⠻⠗⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣶⡶⣠⣴⣶⠙⢿⣇⠀⠸⣷⣦⡀⢰⣷⡀⠙⠛⠿⢿⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⣿⣷⡼⡿⣿⣿⣿⡿⠀⣉⣥⣾⣿⣿⣿⣿⠿⠟⠋⢁⣤⢠⣬⣉⣿⣯⣍⠉⠁⢸⡏⠻⠿⠦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢸⣿⠟⠃⠀⠀⠻⣦⣀⡙⠿⠧⠘⢿⢁⣀⣤⣶⡿⠛⢋⡉⣍⡉⠛⠻⢿⣿⣶⣌⠻⢃⣼⣿⣿⣿⣷⣿⣿⣿⡿⠟⠛⣍⡀⠀⠀⠀⢸⡿⠀⢻⣿⣿⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠿⣿⣙⠿⠿⣷⣾⠿⠿⠟⠋⣵⡿⣰⣿⡇⠻⣿⡄⠀⠀⠉⠻⣿⣷⣾⣿⣿⣿⣿⣿⡿⠟⠉⠀⠀⠀⠻⣿⣆⠀⠀⠀⠀⠀⠀⠉⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡿⠏⢀⣴⣿⠀⠀⠀⠀⠀⠁⠀⢿⠟⠁⠀⠈⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢤⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣻⣿⣿⣿⣿⣿⣿⣝⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠒⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣶⣿⠟⣵⣯⣽⣿⣿⣿⣿⣿⣿⣯⣿⢢⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⡾⠿⠟⠛⢋⣛⡵⠛⣋⢟⣾⣿⠙⣿⣿⣿⣿⣿⣿⣿⢿⣿⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⠀⠀⠀⠀⠀⠘⠋⠉⣭⡥⠙⣄⣴⣻⠿⠶⣿⣿⡾⣿⣿⣿⣿⣿⣭⡥⣿⣿⣿⣷⣿⣿⠲⣾⣿⣶⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⣗⠲⡒⢤⠋⣿⣿⣿⣿⠟⠉⣁⢤⣿⣿⣠⠔⠀⠀⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⢿⣿⣿⢿⣿⡿⠷⠶⢶⣤⣤⣀⣀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠟⠝⠳⢧⣀⣤⣤⣺⣥⣤⣤⣤⠌⠉⢁⣂⢠⣞⣁⣸⡿⠞⠁⠀⠀⠀⣿⣿⣤⣤⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣷⣿⣀⠋⠻⢿⣿⣦⣴⣤⠤⠄⠤⣄⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣤⠌⠭⢭⣽⣤⠌⠭⢭⣽⠉⣾⣷⣿⣿⣿⡛⠭⡵⠖⣖⣾⣿⣿⡿⢿⣿⣿⠀⠀⠀⠈⠓⣿⣧⣀⣴⠚⠙⣿⣂⠔⣿⢹⣿⣿⡟⣿⣿⣿⣿⣿⣿⠈⢿⣓⠾⠽⠍⠉⡓⠙⠲⣮⣀⣤⣀⣀⣂⣀⣀\r\n"
				+ "⠀⠀⠀⠀⠀⡀⠀⠀⠐⠀⠒⣒⣤⣤⣤⠿⠿⠟⣻⠟⠛⢉⣽⠟⠉⠄⠀⠀⢀⣀⣤⣼⣾⣿⣿⣿⡿⠋⠀⣿⣿⣿⣄⠀⠀⠀⢤⡶⡞⠓⢽⣆⠂⣿⠈⣿⡴⣿⣿⣿⣿⣿⣿⣿⣿⣀⠈⠀⠉⠳⣷⢶⣤⣺⣥⣤⣤⣤⠌⠭⢭⣽⠉⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠐⠈⢒⡠⠖⠚⠛⠡⠈⠉⠀⠀⠀⡚⠀⢀⡤⠚⠙⠁⣀⣀⣴⣶⠿⠛⠛⠙⠛⠉⢸⡀⠀⣆⣠⣿⣿⣿⣿⡗⢄⠀⠘⢄⠑⠆⠀⠈⣣⣿⣣⡞⢋⣿⣿⢞⣿⠏⣿⡝⢶⣄⡀⣠⠴ ⠚⣫⣞⡿⠏⣿⣗⠲⡒⠱⢤⣈⢙⢿⡛⠐⢶⣶⠠⢠⠀\r\n"
				+ "⠀⠀⠀⠀⡀⠞⠡⠄⠠⠀⢀⣀⠀⠀⣀⣀⣀⣁⣠⣋⣭⠤⠶⢺⡿⠋⠑⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⡽⠏⠠⢻⣇⢹⡿⠶⣄⣀⢀⡈⠁⠂⡠⠤⣴⡟⣿⣿⣿⣿⣤⡾⣿⠰⠆⠚⠞⡏⠻⣄⠀⡈⠁⠀ ⣠⡾⠛⠉⣙⣾⠟⠝⠳⢧⣀⠀⠳⣄⡹⠓⠢⠀⠄⠀\r\n"
				+ "⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠀⠀⠀⠀⠀⠏⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⡾⠛⠇⠀⠀⠀⢻⣿⡃⠉⠈⠙⢿⣷⣶⡄⠀⠀⣿⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣋⡤⢴⣻⣟⠍⠀⠈⠁⣀⡴⢛⡿⠋⠀⠀⠀⠀⠉⠙⠲⣮⣷⣦⣀⣀⠀⠀⢀⣀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠐⠂⠈⠁⠁⠀⣾⠀⠀⠀⢀⢀⠴⣺⠟⣷⣄⠀⡀⠠⠔⠛⠃⠀⢻⣷⣿⣿⡋⣿⣿⣿⣿⣋⠂⠈⠁⠁⡀⣀⡮⠀⠻⡒⠋⣡⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠼⠹⣄⠀⠐⠉⢀⠘⡥⠄⢽⡟⠿⣅⠀⠀⠀⠀⣠⣿⣿⣿⡝⣿⣿⣿⣿⣿⣍⡳⢤⡂⠛⠊⠁⠁⠸⣄⡼⢷⡟⠺⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠐⠀⠁⠀⠀⠘⠣⡀⠨⠀⠀⠀⠀⡾⠀⠀⠈⠁⢀⣴⣿⣿⣿⣿⣿⡝⣿⢠⠃⢹⢯⡛⠓⠦⠀⠀⠀⠀⠀⠈⠑⡘⠀⠈⢿⡲⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⠀⠀⣀⡾⠁⠀⢀⣠⣶⣿⡝⣿⠟⣿⣿⣽⠳⢦⣀⠀⠀⠙⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⠠⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⡀⠀⡠⠄⠡⠄⠶⠛⠉⠁⢀⣽⢿⣿⣿⠟⣿⣿⡏⠈⠙⠦⠬⣹⣤⡀⠈⢳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⢟⣿⣿⣿⣿⡝⡏⠁⠀ ⠀⠀⠀⠀⠀⠈⠻⠂⠂⢿⠄⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢀⡝⣿⣿⣿⣿⡝⣿⠘⠂⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⡠⢀⠞⣿⣿⣿⣷⠲⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀  ⣴⣿⣿⣿⣿⣷⡝⣮⣦⣀⣀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⣸⣿⣿⣿⣓⠾⣿ ⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⢳⡠⠻⣿⣿⡝⣿⢿⠄⢀⠀⠂⠐⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⡾⡇⡋⠀⠀⠲⣓⣿⣿⣿⡋ ⠉⠒⠠⠠⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠈⡇    ⠀⠀⠀⠀⠈⡇⣿⣿⣿⡳ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠜         ⠀⠀⠠⠜⠙⣿⣿⢳ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀           ⠻⣿⡾⡾⣤ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀ ⠀             ⠜⢿⣿⡉⡄ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀             ⠀⠀⣠⠼⣿⣿⣿⣶⣮⢠ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀        ⠀⠂ ⠀⠁    ⣿⣿⡝⠙⠲⣄ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀                  ⡲⣿⣿⢳ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀                 ⢞⣿⣟ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                    ⣹⣿⣷⠳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀             .⣿⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀                   ⢯⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                        ⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
//			scan.nextLine();
	}


}
