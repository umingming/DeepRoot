package com.project.data;

import java.io.*;
import java.util.*;

public class CategoryDAO implements DAO {
	private ArrayList<CategoryDTO> list;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public CategoryDAO() {
		list = new ArrayList<CategoryDTO>();
	}

	@Override
	public ArrayList load() throws Exception {
		reader = new BufferedReader(new FileReader(Path.category));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new CategoryDTO(tmp[0],tmp[1]));
		}
		
		reader.close();
		return list;
	}

	@Override
	public void save() throws Exception {
		writer = new BufferedWriter(new FileWriter(Path.category));
		
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
	}

	@Override
	public void update(String seq) throws Exception {
	}

	@Override
	public void delete(String seq) throws Exception {
	}
	
}
