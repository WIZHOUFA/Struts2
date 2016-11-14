package com.struts.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Il8nAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date=null;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String execute(){
		date=new Date();
		System.out.println(date);
		return "success";
	}
}
