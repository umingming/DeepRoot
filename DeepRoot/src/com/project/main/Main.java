package com.project.main;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ascii();

	}
	
	private static void ascii() {
		
		System.out.println("\r\n"
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
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠘⣿⡆⣀⡀⠀⢻⣿⡜⣛⠁⢠⣦⣄⡙⠟⠀⣾⣿⠀⣶⣶⣤⡘⢿⣷⠠⣶⣾⠙⢿⣿⣦⡀⣿⡇⣾⡿⠛⠁⠻⣿⣿⡆⢻⣿⣯⣫⡾⣯⣶⡾⠂⣴⣆⣾⣇⣴⡿⣋⣨⣭⣁⠀⢰⣷⠀⡀⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
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
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣶⣿⠟⣵⣯⣽⣿⣿⣿⣿⣿⣿⣯⣿⢢⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⡾⠿⠟⠛⢋⣛⡵⠛⣋⢟⣾⣿⠙⣿⣿⣿⣿⣿⣿⣿⢿⣿⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠋⠉⠑⠀⢀⣄⣴⣻⠿⠶⣿⣿⡾⣿⣿⣿⣿⣿⣭⡥⠙⣿⣿⣷⣿⣿⠲⣾⣿⣶⣶⣦⣤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣰⣿⠟⠉⣁⢤⣿⣿⣠⠔⠀⠀⣿⡿⣿⣿⢀⣿⣿⣿⣿⣿⣿⣿⡄⢿⣿⣿⢿⣿⡿⠷⠶⢶⣤⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⣤⣤⣺⣥⣤⣤⣤⠌⠉⢁⣂⢠⣞⣁⣸⡿⠞⠁⠀⠀⠀⣿⣿⣤⣤⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣷⣿⣀⠋⠻⢿⣿⣿⣿⣶⣷⣬⣿⣦⣴⣤⣤⠤⠄⠀⠩⠍⠉⠛⠻⡓⠲⠤⣄⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠠⢉⣀⣐⣤⣾⣷⣿⣿⣿⡛⠭⡵⠖⣖⣾⣿⣿⡿⢿⣿⣿⠀⠀⠀⠈⠓⣿⣧⣀⣴⠚⠙⣿⣂⠀⠔⠊⢹⣿⡟⣿⣿⣿⣿⣿⣿⠠⠄⡀⠀⠈⢿⣓⠾⠽⣿⣿⣿⣿⣿⠿⠷⣶⣶⣶⣤⣤⣀⣀⣂⣀⣀⣀⣀⣀⣀⣀⠀⢀⣀\r\n"
				+ "⠀⠀⠀⠀⠀⡀⠀⠀⠐⠀⠒⣒⣤⣤⣤⠿⠿⠟⣻⠟⠛⢉⣽⠟⠉⠄⠀⠀⢀⣀⣤⣼⣾⣿⣿⣿⡿⠋⠀⣿⣿⣿⣄⠀⠀⠀⢤⡶⡞⠓⢽⣆⠂⠈⡆⠀⢀⡴⣿⣿⣿⣿⣿⣀⠈⠀⠓⠀⠀⠀⠀⠀⠉⠳⣷⢶⣯⣾⣿⣯⠉⠙⢿⠿⣶⣶⣶⠭⢭⣽⣿⣟⣻⠭⣍⡉⠉⠉⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠐⠈⢒⡠⠖⠚⠛⠡⠈⠉⠀⠀⠀⡚⠀⢀⡤⠚⠙⠁⣀⣀⣴⣶⠿⠛⠛⠙⠛⠉⢸⡀⠀⣆⣠⣿⣿⣿⣿⡗⢄⠀⠘⢄⠑⠆⠀⠈⠀⠀⣣⡞⢋⣿⣿⢞⣿⠏⠙⡝⢶⣄⢀⠀⠀⠀⡀⣠⠴⠚⣫⣞⡿⠏⣿⣗⠲⡒⠱⢤⣈⢙⢿⡛⠐⠛⠟⠛⠛⠒⠿⢶⣶⠠⢠⠀\r\n"
				+ "⠀⠀⠀⠀⡀⠞⠡⠄⠠⠀⢀⣀⠀⠀⣀⣀⣀⣁⣠⣋⣭⠤⠶⢺⡿⠋⠑⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⡽⠏⠠⢻⣇⢹⡿⠶⣄⣀⢀⡈⠁⠂⡠⠤⣴⡟⣿⣿⣿⣿⣤⡾⠋⠰⠆⠚⠞⡏⠻⣄⠀⡈⠁⠀⣠⡾⠛⠉⣙⣾⠟⠝⠳⢧⣀⠀⠳⣄⡹⠓⠢⠀⠄⠀⠀⠀⠀⠀⠀⠙⠲⣄\r\n"
				+ "⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠀⠀⠀⠀⠀⠏⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⡾⠛⠇⠀⠀⠀⢻⣿⡃⠉⠈⠙⢿⣷⣶⡄⠀⠀⣿⣤⣴⣾⣿⣋⣿⣿⣿⣿⣀⣀⡤⢴⣻⣟⠍⠀⠈⠁⣀⡴⢛⡿⠋⠀⠀⠀⠀⠉⠙⠲⣮⣷⣦⣀⣀⠀⣀⣀⣀⣀⠀⢀⣀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠐⠂⠈⠁⠁⠀⣾⠀⠀⠀⢀⢀⠴⣺⠟⣷⣄⠀⡀⠠⠔⠛⠃⠀⠀⢻⣷⣿⡋⣿⣿⣿⠂⠈⠁⠁⡀⣀⡮⠀⠻⡇⠀⡒⠋⣡⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠼⠹⣄⠀⠐⠉⢀⠘⡥⠄⢽⡟⠿⣅⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣍⡳⢤⡂⠀⠛⠊⠁⠁⠸⣄⠀⠈⡼⢷⡟⠺⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠐⠀⠁⠀⠀⠘⠣⡀⠨⠀⠀⠀⠀⡾⠀⠀⠈⠁⢀⣴⣿⣿⣿⣿⣿⢠⠃⢹⢯⡛⠓⠦⠀⠀⠀⠀⠀⠈⠑⡘⠀⠈⢿⡲⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⠀⠀⣀⡾⠁⠀⢀⣠⣶⣿⣿⠟⣿⣽⠳⢦⣀⠀⠀⠙⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⠠⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⡀⠀⡠⠄⠡⠄⠶⠛⠉⠁⢀⣽⢿⣿⣿⠟⣿⣿⡏⠈⠙⠦⠬⣹⣤⡀⠈⢳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⢟⣿⣿⣿⣿⣿⣿⠁⠀ ⠀⠀⠀⠀⠀⠈⠻⠂⠂⢿⠄⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢀⣿⣿⣿⣿⣿⠘⠂⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⡠⠞⣿⣿⣿⠲⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀   ⣿⣿⣿⣿⣷ ⣮⣦⣀⣀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⣸⣿⣿⣿⣓⠾⣿ ⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠐⠁⣿⣿⣿⣿⢿⠄⢀⠀⠂⠐⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠲⠀⣿⣿⣿⡋ ⠉⠒⠠⠠⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⠀⠀⠀⠀⠈⡇⣿⣿⣿⡳ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀            ⠀⠀⠠⠜⠙⣿⣿⢳ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀           ⠻⣤⡾⣿⢿⣿ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀ ⠀             ⠜⢿⣿⡉⡄ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀            ⠀⠀⣠⠼⣿⣿⣿⣶⣮⢠ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀       ⠀⠂ ⠀⠁    ⣿⣿⣿⠙⠲⣄ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀                 ⡲⣿⣿⢳ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀                ⢞⣿⣟ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                   ⣹⣿⣷⠳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀            .⣿⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀                 ⢯⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                    ⣶⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
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

}
