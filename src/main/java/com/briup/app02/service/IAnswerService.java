package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Answer;
import com.briup.app02.vm.AnswerVM;

public interface IAnswerService {
	List<Answer> findAll() throws Exception;
	List<AnswerVM> findAllAnswerVM() throws Exception;
	
	Answer findById(long id) throws Exception;
	AnswerVM findAnswerVMById(long id) throws Exception;
	
	void updateById(Answer answer) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void save(Answer answer) throws Exception;
}
