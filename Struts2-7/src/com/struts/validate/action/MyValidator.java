package com.struts.validate.action;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class MyValidator extends FieldValidatorSupport{

	public void validate(Object obj) throws ValidationException {
		// TODO Auto-generated method stub
		String fieldName = getFieldName();
        Object value = getFieldValue(fieldName, obj);
        IDCard idCard=new IDCard();
        if(!idCard.Verify((String)value))
            addFieldError(fieldName, obj);
	}

}
