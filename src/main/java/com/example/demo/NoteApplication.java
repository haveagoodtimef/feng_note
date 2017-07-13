package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class NoteApplication {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi() {
		return "hi";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}
}
