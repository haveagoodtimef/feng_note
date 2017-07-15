package com.feng.note;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * app入口类.
 * 注解@MapperScan 是定义要扫描的Mapper接口.
 * 好处是不用在每一个接口上加入@Mapper注解
 * @author feng-hong-zhang
 *
 * 2017年7月15日
 */
@MapperScan("com.feng.note")
@SpringBootApplication
public class NoteApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}
}
