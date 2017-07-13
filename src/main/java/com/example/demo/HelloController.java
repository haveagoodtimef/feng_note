package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	private Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hi/{username}")
	public String hi(@PathVariable("username") String name,Model model) {
		model.addAttribute("mingzihao",name);
		return "log_in";
	}
}
