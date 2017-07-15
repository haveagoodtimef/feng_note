package com.feng.note.service.impl;

/**
 * 自定义异常类.继承RuntimeException 并重写方法即可.
 * @author feng-hong-zhang
 *
 * 2017年7月15日
 */
public class UserNameException extends RuntimeException {

	public UserNameException() {
		// TODO Auto-generated constructor stub
	}

	public UserNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UserNameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
