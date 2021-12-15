package com.project.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.project.data.QuotationDAO;
import com.project.data.QuotationDTO;

public class MainTest {
	private static Login login;
	
	static {
		login = new Login();
	}
	
	public static void main(String[] args) throws Exception {
		
		login.login();
	}
	
	
}
