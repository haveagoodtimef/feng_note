//package com.feng.note.service.impl;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.DigestUtils;
//import org.w3c.dom.ranges.RangeException;
//
//import com.feng.note.dao.UserMapper;
//import com.feng.note.entity.User;
//import com.feng.note.service.UserService;
//
//
//public class UserServiceImpl implements UserService {
//	
//	@Autowired
//	private UserMapper userMapper;
//
//	@Override
//	public User userLogin(String name, String password) {
//		User user = userMapper.selectByPrimaryKey(name);
//		if(user == null) {
//			throw new UserNameException("用户名错误!");
//		}
//		//String md5 = DigestUtils.md5DigestAsHex(password.getBytes());
//		//System.out.println(md5);
//		if(password.equals(user.getCnUserPassword())) {
//			return user;
//		}else {
//			throw new RuntimeException("密码错误");
//		}
//	}
//	
//	
//}
