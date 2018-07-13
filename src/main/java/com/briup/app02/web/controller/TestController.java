package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 路由的命名空间
 * http://127.0.0.1:8080可以访问当前
 * @author Administrator
 *
 * hello方法
 */
@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("hello")
	public String hello() {
		return "hello world";
	}

}
