package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Grade;
import com.briup.app02.dao.GradeMapper;
import com.briup.app02.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService {
	
	@Autowired
	private GradeMapper gradeMapper;
	
	@Override
	public List<Grade> findAll() throws Exception {
		
		List<Grade> list=gradeMapper.findAll();
		
		return list;
	}
	
	@Override
	public Grade findById(long id) throws Exception {
		
		 return gradeMapper.findById(id);
	}
	
	@Override
	public void updateById(Grade grade) throws Exception {
		
		gradeMapper.updateById(grade);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		gradeMapper.deleteById(id);
	}
	
	@Override
	public void save(Grade grade) throws Exception {
		
		gradeMapper.save(grade);
	}
}
