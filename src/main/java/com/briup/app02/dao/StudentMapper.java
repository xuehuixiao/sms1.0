package com.briup.app02.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app02.bean.Student;

public interface StudentMapper {
	List<Student> findAll();
	
	Student findById(long id);
	
	void updateById(@Param("id")long id,@Param("name")String name,@Param("age")int age);
	
	void deleteById(long id);
	
	void save(Student student);
}
