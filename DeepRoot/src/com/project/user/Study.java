package com.project.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.QuestionDTO;
import com.project.data.ScoreDAO;
import com.project.data.StudyDAO;
import com.project.data.StudyDTO;
import com.project.data.UserDAO;
import com.project.data.UserDTO;
import com.project.main.Form;
import com.project.main.Main;

public class Study {
	private static Form form;
	private static UserDTO user;

	private static String input;
	private static String pw;
	private static String newPw;
	private static int index;
	
	private static Scanner scan;
	private static String[] str;
	private static ArrayList<StudyDTO> studyList;
	
	static {
		scan = new Scanner(System.in);
	}
	
	public void select(UserDTO user) throws Exception {
		Study.user = user;
		form = new Form();
		
		while(true) {
			form.getLogo();
			
			if(input == null) {
				menu();
			} else if(input.equals("1")) {
				setCategory();
			} else if (input.equals("2")) {
				correctAnswer();
			} else if (input.equalsIgnoreCase("B")) {
				break;
			} else if(input.equalsIgnoreCase("X")) {
				System.exit(0);
			}
			
		}
	}
	
	private void correctAnswer() {
		// TODO Auto-generated method stub
		
	}

	private void solveQuestion() throws Exception {
		setCategory();
	}

	private void setCategory() throws Exception {
		str = form.getStr();
		str[6] = "\t\t\t\t1. 선사시대 \t\t 2. 고대 \t\t 3. 고려";
		str[7] = "\t\t\t\t4. 조선 전기 \t\t 5. 조선 후기 \t\t 6. 개항기";
		str[8] = "\t\t\t\t7. 일제 강점기 \t\t 8. 현대";
		print();
		String category = form.input();
		setProgress(category);
	}
	
	private void setProgress(String category) throws Exception {
		studyList = new StudyDAO().load();
		studyList.stream()
				 .filter(s -> s.getUserSeq().equals(user.getSeq()))
				 .forEach(s -> index = Math.max(index,  Integer.parseInt(s.getQuesitonSeq())));
		
		getProgress(index);
	}

	private void getProgress(int index) {
		str = form.getStr();
		int temp = 5;

		for(int i=0; i<index; i++) {
			if(i%20 == 0) {
				temp++;
				str[temp] = "\t\t   ";
			}
			str[temp] += String.format("%4d", i+1);
		}
		
		form.getLogo();
		print();
		input = form.input();
	}

	private void print() {
		form.print(str);
		form.getMenu();
	}
	
	private void menu() {
		str = form.getStr();
		str[5] += "\t1. 문제 풀기";
		str[6] += "\t2. 오답 공책";
		
		print();
		input = form.input();
	}

}

