package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Question;
import com.briup.app02.vm.QuestionVM;

public interface IQuestionService {
	List<QuestionVM> findAll() throws Exception;
	
	QuestionVM findById(long id) throws Exception;
	
	void updateById(Question question) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void save(Question question) throws Exception;
}
