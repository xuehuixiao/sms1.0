package com.briup.app02.dao.extend;

import java.util.List;

import com.briup.app02.vm.AnswerVM;

public interface AnswerVMMapper {
	List<AnswerVM> findAllAnswerVM();
	
	AnswerVM findAnswerVMById(long id);
}
