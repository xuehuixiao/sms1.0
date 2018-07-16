package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Qq;
import com.briup.app02.dao.QqMapper;
import com.briup.app02.service.IQqService;

@Service
public class QqServiceImpl implements IQqService {
	
	@Autowired
	private QqMapper qqMapper;
	
	@Override
	public List<Qq> findAll() throws Exception {
		
		List<Qq> list=qqMapper.findAll();
		
		return list;
	}
	
	@Override
	public Qq findById(long id) throws Exception {
		
		 return qqMapper.findById(id);
	}
	
	@Override
	public void updateById(Qq qq) throws Exception {
		
		qqMapper.updateById(qq);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		qqMapper.deleteById(id);
	}
	
	@Override
	public void save(Qq qq) throws Exception {
		
		qqMapper.save(qq);
	}
}
