package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Shool;

public interface IShoolService {
	List<Shool> findAll() throws Exception;
	
	Shool findById(long id) throws Exception;
	
	void updateById(Shool shool) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void save(Shool shool) throws Exception;
}
