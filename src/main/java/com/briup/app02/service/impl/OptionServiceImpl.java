package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Option;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.service.IOptionService;

@Service
public class OptionServiceImpl implements IOptionService {
	
	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public List<Option> findAll() throws Exception {
		
		List<Option> list=optionMapper.findAll();
		
		return list;
	}
	
	@Override
	public Option findById(long id) throws Exception {
		
		 return optionMapper.findById(id);
	}
	
	@Override
	public void updateById(Option option) throws Exception {
		
		optionMapper.updateById(option);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		optionMapper.deleteById(id);
	}
	
	@Override
	public void save(Option option) throws Exception {
		
		optionMapper.save(option);
	}
}
