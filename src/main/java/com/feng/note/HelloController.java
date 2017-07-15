package com.feng.note;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 * 通过则证明框架搭建完成.
 * @author feng-hong-zhang
 * 2017年7月15日
 */
@Controller
public class HelloController {
	
	private Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hi/{username}")
	public String hi(@PathVariable("username") String name,Model model) {
		model.addAttribute("mingzihao",name);
		return "log_in";
	}
}
