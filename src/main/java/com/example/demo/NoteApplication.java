package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@MapperScan("com.feng.note")
@SpringBootApplication
public class NoteApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}
}
