package com.project.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ScoreDAO implements DAO {
	private ArrayList<ScoreDTO> list;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public ScoreDAO() {
		list = new ArrayList<ScoreDTO>();
	}
	

	@Override
	public ArrayList load() throws Exception {
		reader = new BufferedReader(new FileReader(Path.score));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			int[] num = new int[8];
			
			for(int i=0; i<8; i++) {
				num[i] = Integer.parseInt(tmp[i+1]);
			}
			
			list.add(new ScoreDTO(tmp[0],num[0],num[1],num[2],num[3],num[4],num[5],num[6],num[7]));
		}
		
		reader.close();
		return list;
	}

	@Override
	public void save() throws Exception {
		writer = new BufferedWriter(new FileWriter(Path.score));
		
		for (ScoreDTO dto : list) {
			String line = String.format("%s■%d■%d■%d■%d■%d■%d■%d" 
											, dto.getUserSeq()
											, dto.getNum1()
											, dto.getNum2()
											, dto.getNum3()
											, dto.getNum4()
											, dto.getNum5()
											, dto.getNum6()
											, dto.getNum7()
											, dto.getNum8());
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
