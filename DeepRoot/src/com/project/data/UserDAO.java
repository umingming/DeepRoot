package com.project.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class UserDAO implements DAO {
	private ArrayList<UserDTO> list;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public UserDAO() {
		list = new ArrayList<UserDTO>();
	}


	@Override
	public ArrayList load() throws Exception {
		reader = new BufferedReader(new FileReader(Path.user));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new UserDTO(tmp[0],tmp[1],tmp[2],tmp[3],tmp[4],tmp[5],tmp[6]));
		}
		
		reader.close();
		return list;
	}

	@Override
	public void save() throws Exception {
		writer = new BufferedWriter(new FileWriter(Path.user));
		
		for (UserDTO dto : list) {
			String line = String.format("%s■%s■%s■%s■%s" 
											, dto.getSeq()
											, dto.getName()
											, dto.getId()
											, dto.getPw()
											, dto.getSsn()
											, dto.getTel()
											, dto.getSchool());
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
