package com.project.data;

import java.io.*;
import java.util.*;

public class QuotationDAO implements DAO {
	private ArrayList<QuotationDTO> list;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public QuotationDAO() {
		list = new ArrayList<QuotationDTO>();
	}

	@Override
	public ArrayList load() throws Exception {
		reader = new BufferedReader(new FileReader(Path.quotation));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new QuotationDTO(tmp[0],tmp[1],tmp[2]));
		}
		
		reader.close();
		return list;
	}

	@Override
	public void save() throws Exception {
		writer = new BufferedWriter(new FileWriter(Path.quotation));
		
		for (QuotationDTO dto : list) {
			String line = String.format("%s■%s■%s" 
											, dto.getSeq()
											, dto.getContent()
											, dto.getName());
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
