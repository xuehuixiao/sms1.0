package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;

public interface CourseMapper {
	List<Course> findAll();
	
	Course findById(long id);
	
	void updateById(Course course);
	
	void deleteById(long id);
	
	void save(Course course);
}
