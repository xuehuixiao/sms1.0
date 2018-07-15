package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Grade;

public interface GradeMapper {
	List<Grade> findAll();
	
	Grade findById(long id);
	
	void updateById(Grade grade);
	
	void deleteById(long id);
	
	void save(Grade grade);
}
