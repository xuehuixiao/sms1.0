package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> findAll() throws Exception {
		
		List<Student> list=studentMapper.findAll();
		
		return list;
	}
	
	@Override
	public Student findById(long id) throws Exception {
		
		 return studentMapper.findById(id);
	}
	
	@Override
	public void updateById(long id,String name,int age) throws Exception {
		
		studentMapper.updateById(id,name,age);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		studentMapper.deleteById(id);
		
	}
	
	@Override
	public void save(Student student) throws Exception {
		
		studentMapper.save(student);
	}
}
