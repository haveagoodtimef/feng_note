package com.feng.note;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.feng.note.dao.UserMapper;
import com.feng.note.entity.User;
import com.feng.note.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteApplicationTests {
	
	@Autowired
	private UserMapper userMapper;
	 
	@Autowired
	private UserService userService;
	
	@Test
	public void contextLoads() {
		System.out.println("KAISHI");
	}

	@Test
//	@Rollback
	public void test1() {
		User user = userMapper.selectByPrimaryKey("1");
		System.out.println(user);
	}
	
	@Test
	public void test2() {
		User user = userService.userLogin("1", "1");
		System.out.println(user);
	}
}


