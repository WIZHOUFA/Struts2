package com.struts.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8527327432329586038L;
	private int age;
	private Date birth;
	public void setAge(int age) {
		this.age = age;
	}
    
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String execute(){
		System.out.println("age:"+age);
		System.out.println("birth"+birth);
		return "success";
	}
}
