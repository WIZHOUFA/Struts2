package com.struts.websourceaccess;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class TestAccessWebsource{
    public String execute(){
    	//����һ��ActionContext����
    	ActionContext actionContext=ActionContext.getContext();
    	//��ȡapplication����
    	Map<String,Object> application=actionContext.getApplication();
    	application.put("application", "applicationValue");
    	//��ȡSession����
    	Map<String,Object> session=actionContext.getSession();
    	session.put("session", "sessionValue");
    	System.out.println(session.get("session"));
    	//��ȡrequest�������
    	Map<String,Object> request=(Map<String, Object>) actionContext.get("request");
    	request.put("object", "reqeustValue");
    	//��ȡ�������
    	Map<String,Object> map=actionContext.getParameters();
    	System.out.println(((String[])map.get("name"))[1]);
    	return "success";
    }
}
