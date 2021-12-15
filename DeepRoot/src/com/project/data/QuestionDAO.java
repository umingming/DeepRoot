package com.project.data;

import java.io.*;
import java.util.*;

public class QuestionDAO implements DAO {
	private ArrayList<QuestionDTO> list;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public QuestionDAO() {
		list = new ArrayList<QuestionDTO>();
	}

	@Override
	public ArrayList load() throws Exception {
		reader = new BufferedReader(new FileReader(Path.question));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new QuestionDTO(tmp[0],tmp[1],tmp[2],tmp[3],tmp[4]));
		}
		
		reader.close();
		return list;
	}

	@Override
	public void save() throws Exception {
		writer = new BufferedWriter(new FileWriter(Path.question));
		
		for (QuestionDTO dto : list) {
			String line = String.format("%s■%s■%s■%s■%s" 
											, dto.getSeq()
											, dto.getCategorySeq()
											, dto.getNum()
											, dto.getQuestion()
											, dto.getAnswer());
			writer.write(line);
			writer.newLine();
		}
		
		writer.close();
	}

	@Override
	public void insert(Object obj) throws Exception {
	}

	@Override
	public void update(String seq) throws Exception {
	}

	@Override
	public void delete(String seq) throws Exception {
	}

}
