package com.feng.note.service;

import org.springframework.stereotype.Service;

import com.feng.note.entity.User;

public interface UserService {
	/**
	 * 登录功能
	 * @param name
	 * @param passwrod
	 * @return 用户实例
	 */
	User userLogin(String name,String passwrod);
}
