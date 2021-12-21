package com.project.user;

import java.util.*;

import com.project.data.*;
import com.project.main.Form;

public class User {
	private static Form form;
	private static UserDTO user;
	private static ScoreDTO userScore;
	private static AccountManagement management;

	private static String id;
	private static String sel;
	private static int total;
	private static double score;
	
	private static String[] str;
	private static ArrayList<UserDTO> userList;
	private static ArrayList<ScoreDTO> scoreList;
	private static ArrayList<QuestionDTO> questionList;
	
	static {
	}
	
	public User(String id) {
		this.id = id;
	}

	public void main() throws Exception {
		setUser();

		while(true) {
			form = new Form();
			str = form.getStr();
			menu();
			
			if(sel.equals("1")) {
				management = new AccountManagement();
				management.info(user);
			} else if (sel.equals("2")) {
				
			} else if (sel.equals("3")) {
				
			} else if (sel.equalsIgnoreCase("B")) {
				break;
			} else if(sel.equalsIgnoreCase("X")) {
				System.exit(0);
			}
		}
	}

	private void menu() throws Exception {
		form.getLogo();
		str[2] += "     " + user.getName() + "님 환영합니다!";
		str[3] += "    ";
		setAchievement(userScore.getNum1(), "1");
		setAchievement(userScore.getNum2(), "2");
		setAchievement(userScore.getNum3(), "3");
		setAchievement(userScore.getNum4(), "4");
		setAchievement(userScore.getNum5(), "5");
		setAchievement(userScore.getNum6(), "6");
		setAchievement(userScore.getNum7(), "7");
		setAchievement(userScore.getNum8(), "8");
		
		str[6] += "\t1. 계정 관리";
		str[7] += "\t2. 한국사 학습";
		str[8] += "\t3. 순위 확인";
		form.print(str);
		form.getMenu();
		sel = form.input();
	}

	private void setAchievement(int level, String unit) throws Exception {
		questionList = new QuestionDAO().load();
		total = 0;
		
		questionList.stream()
				.filter(q -> q.getCategorySeq().equals(unit))
				.forEach(q -> total = Math.max(total, Integer.parseInt(q.getNum())));
		
				//TODO Num을 int 변수로 수정
		
		score = (double)level / total;
		
		str[3] += getAchievement(score);
	}

	private String getAchievement(double score) {
		String tmp = "";
		
		if(score < 0.25) {
			tmp = "⬜";
		} else if(score < 0.5) {
			tmp = "▤";
		} else if(score < 0.75) {
			tmp = "▦";
		} else {
			tmp = "■";
		}
		
		return tmp + "  ";
	}

	private void setUser() throws Exception {
		userList = new UserDAO().load();
		scoreList = new ScoreDAO().load();
		
		userList.stream()
				.filter(u -> u.getId().equals(id))
				.forEach(u -> user = u);
				
		scoreList.stream()
				.filter(s -> s.getUserSeq().equals(user.getSeq()))
				.forEach(s -> userScore = s);
	}
	
	
	
	
	
}
