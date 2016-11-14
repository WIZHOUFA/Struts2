/*jadclipse*/// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

package com.opensymphony.xwork2.interceptor;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.conversion.impl.XWorkConverter;
import com.opensymphony.xwork2.util.ValueStack;
import java.util.*;
import org.apache.commons.lang3.StringEscapeUtils;

// Referenced classes of package com.opensymphony.xwork2.interceptor:
//            AbstractInterceptor, PreResultListener

public class ConversionErrorInterceptor extends AbstractInterceptor
{

    public ConversionErrorInterceptor()
    {
    }

    protected Object getOverrideExpr(ActionInvocation invocation, Object value)
    {
        return escape(value);
    }

    protected String escape(Object value)
    {
        return (new StringBuilder()).append("\"").append(StringEscapeUtils.escapeJava(String.valueOf(value))).append("\"").toString();
    }

    public String intercept(ActionInvocation invocation)
        throws Exception
    {
        ActionContext invocationContext = invocation.getInvocationContext();
        Map conversionErrors = invocationContext.getConversionErrors();
        ValueStack stack = invocationContext.getValueStack();
        HashMap fakie = null;
        Iterator i$ = conversionErrors.entrySet().iterator();
        do
        {
            if(!i$.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry)i$.next();
            String propertyName = (String)entry.getKey();
            Object value = entry.getValue();
            if(shouldAddError(propertyName, value))
            {
                String message = XWorkConverter.getConversionErrorMessage(propertyName, stack);
                Object action = invocation.getAction();
                if(action instanceof ValidationAware)
                {
                    ValidationAware va = (ValidationAware)action;
                    va.addFieldError(propertyName, message);
                }
                if(fakie == null)
                    fakie = new HashMap();
                fakie.put(propertyName, getOverrideExpr(invocation, value));
            }
        } while(true);
        if(fakie != null)
        {
            stack.getContext().put("original.property.override", fakie);
            invocation.addPreResultListener(new PreResultListener() {

                public void beforeResult(ActionInvocation invocation, String resultCode)
                {
                    Map fakie = (Map)invocation.getInvocationContext().get("original.property.override");
                    if(fakie != null)
                        invocation.getStack().setExprOverrides(fakie);
                }
            }
);
        }
        Object action = invocation.getAction();
        if(action instanceof ValidationAware)
        {
            ValidationAware va = (ValidationAware)action;
            if(va.hasFieldErrors()||va.hasActionErrors()){
            	return "input";
            }
        }
        return invocation.invoke();
    }

    protected boolean shouldAddError(String propertyName, Object value)
    {
        return true;
    }

    public static final String ORIGINAL_PROPERTY_OVERRIDE = "original.property.override";
}


/*
	DECOMPILATION REPORT

	Decompiled from: E:\js_jquery_ajax\Struts2-7\WebRoot\WEB-INF\lib\xwork-core-2.3.15.3.jar
	Total time: 45 ms
	Jad reported messages/errors:
	Exit status: 0
	Caught exceptions:
*/