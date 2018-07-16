package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.service.IQuestionnaireService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Questionnaire")
public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService questionnaireService;
	
	@GetMapping("findAllQuestionnaire")
	public MsgResponse findAllQuestionnaire() {
		
		try {
			return MsgResponse.success("查找成功",questionnaireService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQuestionnaireById")
	public MsgResponse findQuestionnaireById(long id) {
		
		try {
			return MsgResponse.success("查找成功",questionnaireService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateQuestionnaireById")
	public MsgResponse updateQuestionnaireById(Questionnaire questionnaire) {
			
		try {
			questionnaireService.updateById(questionnaire);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteQuestionnaireById")
	public MsgResponse deleteQuestionnaireById(long id) {
		
		try {
			questionnaireService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveQuestionnaireById")
	public MsgResponse saveQuestionnaireById(Questionnaire questionnaire) {
		
		try {
			questionnaireService.save(questionnaire);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
