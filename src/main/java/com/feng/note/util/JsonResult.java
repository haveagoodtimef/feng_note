package com.feng.note.util;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {

	private String success;
	private Integer state;
	private T data;
	
	public JsonResult() {
		
	}
	
	

	public JsonResult(T data) {
		this.success = "OK";
		this.state = 0;
		this.data = data;
	}



	public JsonResult(String success, Integer state) {
		super();
		this.success = success;
		this.state = state;
	}

	
	public String getSuccess() {
		return success;
	}


	public void setSuccess(String success) {
		this.success = success;
	}

	public Integer getState() {
		return state;
	}


	public void setState(Integer state) {
		this.state = state;
	}

	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}
	
	
}
