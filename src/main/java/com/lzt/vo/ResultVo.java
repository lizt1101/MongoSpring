package com.lzt.vo;

public class ResultVo<T> {
	
	private String code;
	private String mesg;
	private T data;
	
	
	public ResultVo() {
		this.code="00000";
		this.mesg="success";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMesg() {
		return mesg;
	}
	public void setMesg(String mesg) {
		this.mesg = mesg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	

}
