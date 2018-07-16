package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Shool;
import com.briup.app02.service.IShoolService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Shool")
public class ShoolController {
	@Autowired
	private IShoolService shoolService;
	
	@GetMapping("findAllShool")
	public MsgResponse findAllShool() {
		
		try {
			return MsgResponse.success("查找成功",shoolService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findShoolById")
	public MsgResponse findShoolById(long id) {
		
		try {
			return MsgResponse.success("查找成功",shoolService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateShoolById")
	public MsgResponse updateShoolById(Shool shool) {
			
		try {
			shoolService.updateById(shool);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteShoolById")
	public MsgResponse deleteShoolById(long id) {
		
		try {
			shoolService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveShoolById")
	public MsgResponse saveShoolById(Shool shool) {
		
		try {
			shoolService.save(shool);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
