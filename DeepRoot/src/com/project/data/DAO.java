package com.project.data;

public interface DAO {
	public void load() throws Exception;
	public void save() throws Exception;
	public void insert(Object obj) throws Exception;
	public void update(String seq) throws Exception;
	public void delete(String seq) throws Exception;
}
