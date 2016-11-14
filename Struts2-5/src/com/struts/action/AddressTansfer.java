package com.struts.action;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.struts.model.Address;

public class AddressTansfer extends StrutsTypeConverter{
    public AddressTansfer(){
    	System.out.println("Jangsu,NanJing,Qixia");
    }
	@Override
	public Object convertFromString(Map arg0, String[] values, Class clazz) {
		if(clazz==Address.class){
			if(values!=null&&values.length>0){
				System.out.println(values[0]);
				String[] str=values[0].split(",");
				if(str.length==3){
					//System.out.println(str[0]);
					return new Address(str[0],str[1],str[2]);
				}
			}
		}
		return values;
	}

	@Override
	public String convertToString(Map arg0, Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Address){
			Address address=(Address)obj;
			return address.getProvince()+","+address.getCity()+","+address.getQu();
		}
	    return null;
	}

}
