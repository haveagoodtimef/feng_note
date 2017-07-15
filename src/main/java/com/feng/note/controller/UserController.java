package com.feng.note.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feng.note.entity.User;
import com.feng.note.service.UserService;
import com.feng.note.util.JsonResult;

/**
 * 用户控制层
 * 
 * 一定要注意,controller的包必须与启动App为同一个级.否则无法扫描Controller类.
 * 
 * SpringBoot项目的Bean装配默认规则是根据Application类所在的包位置从上往下扫描！ 
 * 
 * @author feng-hong-zhang
 * 
 * 2017年7月15日
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/hello/{username}")
	public String hi(@PathVariable("username") String name,Model model) {
		model.addAttribute("mingzihao",name);
		return "log_in";
	}
	
	@RequestMapping("/login")
	public JsonResult<User> login(HttpServletRequest request,HttpServletResponse response) {
		String name1 = request.getParameter("name");
		String passwrod = request.getParameter("password");
		System.out.println(name1);
		System.out.println(passwrod);
		User user = userService.userLogin(name1, passwrod);
		//把用户存到session中
		request.getSession().setAttribute("user", user);
		
		return new JsonResult<User>(user);
		
	}
	
	
	
}
