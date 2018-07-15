package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Clazz;

public interface ClazzMapper {
	List<Clazz> findAll();
	
	Clazz findById(long id);
	
	void updateById(Clazz clazz);
	
	void deleteById(long id);
	
	void save(Clazz clazz);
}
