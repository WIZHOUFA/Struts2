package com.struts.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

public class TypeTansfer extends StrutsTypeConverter{
    private DateFormat dateFormat;
    
	public TypeTansfer() {
		System.out.println("Constructor's ...");
	}
    public DateFormat getDateFormat(){
    	if(dateFormat==null){
    		ServletContext servletContext=ServletActionContext.getServletContext();
    		String time=servletContext.getInitParameter("time");
    		return new SimpleDateFormat(time);
    	}
    	return null;
    }
	@Override
	public Object convertFromString(Map map, String[] values, Class clazz) {
		// TODO Auto-generated method stub
		if(Date.class==clazz){
		if(values!=null&&values.length>0){
			try{
		    return getDateFormat().parseObject(values[0]);
		    }catch(Exception e){
		        e.printStackTrace();	
		        return values;
		    }
		}
		}
		return values;
	}

	@Override
	public String convertToString(Map arg0, Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Date){
			Date date=(Date)obj;
			return getDateFormat().format(date);
		}
	    return null;    
	}

}
