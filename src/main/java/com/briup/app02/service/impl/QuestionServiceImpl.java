package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Question;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.service.IQuestionService;

@Service
public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public List<Question> findAll() throws Exception {
		
		List<Question> list=questionMapper.findAll();
		
		return list;
	}
	
	@Override
	public Question findById(long id) throws Exception {
		
		 return questionMapper.findById(id);
	}
	
	@Override
	public void updateById(Question question) throws Exception {
		
		questionMapper.updateById(question);
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		
		questionMapper.deleteById(id);
	}
	
	@Override
	public void save(Question question) throws Exception {
		
		questionMapper.save(question);
	}
}
