package com.struts.websourceaccess;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class TestAccessWebsource{
    public String execute(){
    	//定义一个ActionContext对象
    	ActionContext actionContext=ActionContext.getContext();
    	//获取application对象
    	Map<String,Object> application=actionContext.getApplication();
    	application.put("application", "applicationValue");
    	//获取Session对象
    	Map<String,Object> session=actionContext.getSession();
    	session.put("session", "sessionValue");
    	System.out.println(session.get("session"));
    	//获取request请求对象
    	Map<String,Object> request=(Map<String, Object>) actionContext.get("request");
    	request.put("object", "reqeustValue");
    	//获取请求参数
    	Map<String,Object> map=actionContext.getParameters();
    	System.out.println(((String[])map.get("name"))[1]);
    	return "success";
    }
}
