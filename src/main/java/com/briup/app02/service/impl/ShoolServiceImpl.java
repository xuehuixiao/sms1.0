package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Shool;
import com.briup.app02.dao.ShoolMapper;
import com.briup.app02.service.IShoolService;

@Service
public class ShoolServiceImpl implements IShoolService {
	
	@Autowired
	private ShoolMapper shoolMapper;
	
	@Override
	public List<Shool> findAll() throws Exception {
		
		List<Shool> list=shoolMapper.findAll();
		
		return list;
	}
	
	@Override
	public Shool findById(long id) throws Exception {
		
		 return shoolMapper.findById(id);
	}
	
	@Override
	public void updateById(Shool shool) throws Exception {
		
		shoolMapper.updateById(shool);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		shoolMapper.deleteById(id);
	}
	
	@Override
	public void save(Shool shool) throws Exception {
		
		shoolMapper.save(shool);
	}
}
