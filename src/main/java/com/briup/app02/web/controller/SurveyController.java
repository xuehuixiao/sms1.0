package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.service.ISurveyService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Survey")
public class SurveyController {
	@Autowired
	private ISurveyService surveyService;
	
	@ApiOperation(value="查询所有课调",notes="不级联查询班主任，问卷，班级和年级")
	@GetMapping("findAllSurvey")
	public MsgResponse findAllSurvey() {
		
		try {
			return MsgResponse.success("查找成功",surveyService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value="查询所有课调",notes="级联查询班主任，问卷，班级和年级")
	@GetMapping("findAllSurveyVM")
	public MsgResponse findAllSurveyVM() {
		
		try {
			return MsgResponse.success("查找成功",surveyService.findAllSurveyVM());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value="通过id查询课调",notes="不级联查询班主任，问卷，班级和年级")
	@GetMapping("findSurveyById")
	public MsgResponse findSurveyById(long id) {
		
		try {
			return MsgResponse.success("查找成功",surveyService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value="通过id查询课调",notes="级联查询班主任，问卷，班级和年级")
	@GetMapping("findSurveyVMById")
	public MsgResponse findSurveyVMById(long id) {
		
		try {
			return MsgResponse.success("查找成功",surveyService.findSurveyVMById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateSurveyById")
	public MsgResponse updateSurveyById(Survey survey) {
			
		try {
			surveyService.updateById(survey);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteSurveyById")
	public MsgResponse deleteSurveyById(long id) {
		
		try {
			surveyService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveSurvey")
	public MsgResponse saveSurvey(Survey survey) {
		
		try {
			surveyService.save(survey);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
