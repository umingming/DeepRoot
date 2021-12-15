package com.project.data;

import java.io.*;
import java.util.*;

public class CategoryDAO implements DAO{
	private ArrayList<CategoryDTO> list;
	private Scanner scan;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public CategoryDAO() {
		try {
			list = new ArrayList<CategoryDTO>();
			scan = new Scanner(System.in);
			reader = new BufferedReader(new FileReader(Path.category));
			writer = new BufferedWriter(new FileWriter(Path.category));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load() throws Exception {
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new CategoryDTO(tmp[0],tmp[1]));
		}
		
		reader.close();
	}

	@Override
	public void save() throws Exception {
		for (CategoryDTO dto : list) {
			String line = String.format("%s■%s" 
											, dto.getSeq()
											, dto.getCategory());
			writer.write(line);
			writer.newLine();
		}
		
		writer.close();
	}

	@Override
	public void insert(Object obj) throws Exception {
		list.add((CategoryDTO) obj);
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
