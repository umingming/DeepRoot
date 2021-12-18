package com.project.user;

import java.util.*;

import com.project.data.*;
import com.project.main.Form;

public class User {
	private static Form form;
	private static UserDTO user;
	private static ScoreDTO userScore;

	private static String id;
	private static int total;
	private static double score;
	
	private static String[] str;
	private static ArrayList<UserDTO> userList;
	private static ArrayList<ScoreDTO> scoreList;
	private static ArrayList<QuestionDTO> questionList;
	
	static {
		form = new Form();
	}
	
	public User(String id) {
		this.id = id;
	}

	public void user() throws Exception {
		setUser();
		str = form.getStr();

		while(true) {
			menu();
		}
	}

	private void menu() {
		str[2] = user.getName() + "님 환영합니다!";
//		getAchievement();
		
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
			tmp = "⬛";
		}
		
		return tmp;
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
