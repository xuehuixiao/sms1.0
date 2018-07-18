package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Qq;
import com.briup.app02.service.IQqService;
import com.briup.app02.util.MsgResponse;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore

@RestController
@RequestMapping("/Qq")
public class QqController {
	@Autowired
	private IQqService qqService;
	
	@GetMapping("findAllQq")
	public MsgResponse findAllQq() {
		
		try {
			return MsgResponse.success("查找成功",qqService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findAllQqVM")
	public MsgResponse findAllQqVM() {
		
		try {
			return MsgResponse.success("查找成功",qqService.findAllQqVM());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQqById")
	public MsgResponse findQqById(long id) {
		
		try {
			return MsgResponse.success("查找成功",qqService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findQqVMById")
	public MsgResponse findQqVMById(long id) {
		
		try {
			return MsgResponse.success("查找成功",qqService.findQqVMById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateQqById")
	public MsgResponse updateQqById(Qq Qq) {
			
		try {
			qqService.updateById(Qq);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteQqById")
	public MsgResponse deleteQqById(long id) {
		
		try {
			qqService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveQq")
	public MsgResponse saveQq(Qq Qq) {
		
		try {
			qqService.save(Qq);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
