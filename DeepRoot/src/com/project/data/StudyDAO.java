package com.project.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class StudyDAO implements DAO {
	private ArrayList<StudyDTO> list;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public StudyDAO() {
		list = new ArrayList<StudyDTO>();
	}

	@Override
	public ArrayList load() throws Exception {
		reader = new BufferedReader(new FileReader(Path.study));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new StudyDTO(tmp[0],tmp[1],tmp[2],tmp[3]));
		}
		
		reader.close();
		return list;
	}

	@Override
	public void save() throws Exception {
		writer = new BufferedWriter(new FileWriter(Path.study));
		
		for (StudyDTO dto : list) {
			String line = String.format("%s■%s■%s■%s" 
											, dto.getSeq()
											, dto.getUserSeq()
											, dto.getQuesitonSeq()
											, dto.getAnswer());
			writer.write(line);
			writer.newLine();
		}
		
		writer.close();
	}

	@Override
	public void insert(Object obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String seq) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String seq) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
