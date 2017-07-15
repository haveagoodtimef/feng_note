package com.feng.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.note.dao.UserMapper;
import com.feng.note.entity.User;
import com.feng.note.service.impl.UserNameException;

@Service
public class UserService {
	/**
	 * 登录功能
	 * @param name
	 * @param passwrod
	 * @return 用户实例
	 */
	@Autowired
	private UserMapper userMapper;

	public User userLogin(String name, String password) {
		User user = userMapper.selectByPrimaryKey(name);
		if(user == null) {
			throw new UserNameException("用户名错误!");
		}
		//String md5 = DigestUtils.md5DigestAsHex(password.getBytes());
		//System.out.println(md5);
		if(password.equals(user.getCnUserPassword())) {
			return user;
		}else {
			throw new RuntimeException("密码错误");
		}
	}
}
