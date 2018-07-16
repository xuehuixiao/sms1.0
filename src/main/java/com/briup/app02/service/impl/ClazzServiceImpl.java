package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.dao.ClazzMapper;
import com.briup.app02.service.IClazzService;

@Service
public class ClazzServiceImpl implements IClazzService {
	
	@Autowired
	private ClazzMapper clazzMapper;
	
	@Override
	public List<Clazz> findAll() throws Exception {
		
		List<Clazz> list=clazzMapper.findAll();
		
		return list;
	}
	
	@Override
	public Clazz findById(long id) throws Exception {
		
		 return clazzMapper.findById(id);
	}
	
	@Override
	public void updateById(Clazz clazz) throws Exception {
		
		clazzMapper.updateById(clazz);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		clazzMapper.deleteById(id);
	}
	
	@Override
	public void save(Clazz clazz) throws Exception {
		
		clazzMapper.save(clazz);
	}
}
