package com.project.data;

import java.util.*;

public interface DAO {
	public ArrayList load() throws Exception;
	public void save() throws Exception;
	public void insert(Object obj) throws Exception;
	public void update(String seq) throws Exception;
	public void delete(String seq) throws Exception;
}
