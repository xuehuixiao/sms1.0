package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.dao.QuestionnaireMapper;
import com.briup.app02.service.IQuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
	
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	@Override
	public List<Questionnaire> findAll() throws Exception {
		
		List<Questionnaire> list=questionnaireMapper.findAll();
		
		return list;
	}
	
	@Override
	public Questionnaire findById(long id) throws Exception {
		
		 return questionnaireMapper.findById(id);
	}
	
	@Override
	public void updateById(Questionnaire questionnaire) throws Exception {
		
		questionnaireMapper.updateById(questionnaire);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		questionnaireMapper.deleteById(id);
	}
	
	@Override
	public void save(Questionnaire questionnaire) throws Exception {
		
		questionnaireMapper.save(questionnaire);
	}
}
