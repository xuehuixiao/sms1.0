package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.User;
import com.briup.app02.service.IUserService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("findAllUser")
	public MsgResponse findAllUser() {
		
		try {
			return MsgResponse.success("查找成功",userService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findUserById")
	public MsgResponse findUserById(long id) {
		
		try {
			return MsgResponse.success("查找成功",userService.findById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateUserById")
	public MsgResponse updateUserById(User user) {
			
		try {
			userService.updateById(user);
			return MsgResponse.success("更新成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteUserById")
	public MsgResponse deleteUserById(long id) {
		
		try {
			userService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveUserById")
	public MsgResponse saveUserById(User user) {
		
		try {
			userService.save(user);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
