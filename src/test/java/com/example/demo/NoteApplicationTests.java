package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.feng.note.dao.UserMapper;
import com.feng.note.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteApplicationTests {
	
	@Autowired
	private UserMapper userMapper;
	
	
	@Test
	public void contextLoads() {
		System.out.println("11111");
	}

	@Test
//	@Rollback
	public void test1() {
		User user = userMapper.selectByPrimaryKey("1");
		System.out.println(user);
	}
}
