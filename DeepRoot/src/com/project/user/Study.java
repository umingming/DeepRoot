package com.project.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.QuestionDAO;
import com.project.data.QuestionDTO;
import com.project.data.StudyDAO;
import com.project.data.StudyDTO;
import com.project.data.UserDTO;
import com.project.main.Form;

public class Study {
	private static Form form;
	private static UserDTO user;
	private static QuestionDTO question;

	private static String input;
	private static String pw;
	private static String newPw;
	private static String category;
	private static String questionNum;
	private static int index;
	
	private static Scanner scan;
	private static String[] str;
	private static ArrayList<StudyDTO> studyList;
	private static ArrayList<QuestionDTO> questionList;
	
	static {
		scan = new Scanner(System.in);
	}
	
	public void select(UserDTO user) throws Exception {
		Study.user = user;
		form = new Form();
		
		while(true) {
			System.out.println("\r\n\r\n\r\n[한국사 학습]\r\n\r\n\r\n");
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
		category = form.input();
		setProgress(category);
	}
	
	private void setProgress(String category) throws Exception {
		studyList = new StudyDAO().load();
		studyList.stream()
				 .filter(s -> s.getUserSeq().equals(user.getSeq()))
				 .forEach(s -> index = Math.max(index,  Integer.parseInt(s.getQuesitonSeq())));
		
		getProgress();
	}

	private void getProgress() throws Exception {
		str = form.getStr();
		int temp = 5;

		for(int i=0; i<index+1; i++) {
			if(i%20 == 0) {
				temp++;
				str[temp] = "\t\t   ";
			}
			str[temp] += String.format("%4d", i+1);
		}
		System.out.println("\r\n\r\n\r\n[한국사 학습]\r\n\r\n\r\n");
		form.getLogo();
		print();
		questionNum = form.input();
		setQuestion();
	}

	private void setQuestion() throws Exception {
		questionList = new QuestionDAO().load();
		
		questionList.stream()
					.filter(q -> q.getNum().equals(questionNum))
					.forEach(q -> question = q);
		getQuestion(question);
	}
	
	private void getQuestion(QuestionDTO question) throws Exception {
		str = form.getStr();
		str[5] = String.format("%70s", question.getQuestion());
		System.out.println("\r\n\r\n\r\n[한국사 학습]\r\n\r\n\r\n");
		form.getLogo();
		print();
		setAnswer(form.input());
	}

	private void setAnswer(String input) throws Exception {
		str = form.getStr();
		if(input.equals(question.getAnswer())){
			str[4] += "\t정답입니다!";
			index ++;
			clear();
		} else {
			str[4] += "\t오답입니다.";
		}
		System.out.println("\r\n\r\n\r\n[한국사 학습]\r\n\r\n\r\n");
		form.getLogo();
		str[6] = String.format("%70s", getAnswer());
		print();
		form.input();
		
		getProgress();
	}

	private String getAnswer() {
		String tmp = question.getQuestion();
		String answer = question.getAnswer();
		String blank = "";
		
		for(int i=0; i<answer.length(); i++) {
			blank += "ㅇ";
		}
		return tmp.replace(blank, answer);
	}

	private void clear() {
		// TODO Auto-generated method stub
		
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

