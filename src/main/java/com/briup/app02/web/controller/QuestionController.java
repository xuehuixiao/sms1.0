package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	
	@ApiOperation(value="查询所有问题",notes="级联查询问题选项")
	@GetMapping("findAllQuestion")
	public MsgResponse findAllQuestion() {
		
		try {
			return MsgResponse.success("查找成功",questionService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQuestionById")
	public MsgResponse findQuestionById(long id) {
		
		try {
			return MsgResponse.success("查找成功",questionService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateQuestionById")
	public MsgResponse updateQuestionById(Question question) {
			
		try {
			questionService.updateById(question);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteQuestionById")
	public MsgResponse deleteQuestionById(long id) {
		
		try {
			questionService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveQuestion")
	public MsgResponse saveQuestion(Question question) {
		
		try {
			questionService.save(question);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
