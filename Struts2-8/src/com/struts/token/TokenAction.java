package com.struts.token;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.out.println(username);
		return super.execute();
	}

}
