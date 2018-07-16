package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Survey;
import com.briup.app02.dao.SurveyMapper;
import com.briup.app02.service.ISurveyService;

@Service
public class SurveyServiceImpl implements ISurveyService {
	
	@Autowired
	private SurveyMapper surveyMapper;
	
	@Override
	public List<Survey> findAll() throws Exception {
		
		List<Survey> list=surveyMapper.findAll();
		
		return list;
	}
	
	@Override
	public Survey findById(long id) throws Exception {
		
		 return surveyMapper.findById(id);
	}
	
	@Override
	public void updateById(Survey survey) throws Exception {
		
		surveyMapper.updateById(survey);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		surveyMapper.deleteById(id);
	}
	
	@Override
	public void save(Survey survey) throws Exception {
		
		surveyMapper.save(survey);
	}
}