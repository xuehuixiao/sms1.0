package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.service.ICourseService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("findAllCourse")
	public MsgResponse findAllCourse() {
		
		try {
			return MsgResponse.success("查找成功",courseService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findCourseById")
	public MsgResponse findCourseById(long id) {
		
		try {
			return MsgResponse.success("查找成功",courseService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateCourseById")
	public MsgResponse updateCourseById(Course course) {
			
		try {
			courseService.updateById(course);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteCourseById")
	public MsgResponse deleteCourseById(long id) {
		
		try {
			courseService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveCourseById")
	public MsgResponse saveCourseById(Course course) {
		
		try {
			courseService.save(course);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
