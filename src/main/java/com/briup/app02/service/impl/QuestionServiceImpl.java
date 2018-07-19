package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.Question;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.dao.extend.QuestionVMMapper;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.vm.QuestionVM;

@Service
public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private QuestionVMMapper questionVMMapper;
	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public List<Question> findAll() throws Exception {
		
		List<Question> list=questionMapper.findAll();
		
		return list;
	}
	
	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		
		List<QuestionVM> list=questionVMMapper.findAllQuestionVM();
		
		return list;
	}
	
	@Override
	public Question findById(long id) throws Exception {
		
		 return questionMapper.findById(id);
	}
	
	@Override
	public QuestionVM findQuestionVMById(long id) throws Exception {
		
		 return questionVMMapper.findQuestionVMById(id);
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
	@Override
	public void saveQuestionVM(QuestionVM questionVM) throws Exception {
		
		Question q=new Question();
		q.setName(questionVM.getName());
		q.setQuestiontype(questionVM.getQuestiontype());
		
		questionMapper.save(q);
		
		Long q_id=q.getId();
		List<Option> options = questionVM.getOption();
		for(Option option : options){
			option.setQuestion_id(q_id);
			optionMapper.save(option);
		}	
	}
}









