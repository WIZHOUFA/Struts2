<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  <s:debug></s:debug>
    <s:form action="input" theme="simple">
    Age:<s:textfield name="age" label="Age"></s:textfield>
    <s:fielderror fieldName="age"></s:fielderror>
    <br><br>
    Password1:<s:password name="password1"></s:password>
    <br><br>
    password2:<s:password name="password2"></s:password>
    <s:actionerror/><br><br>
    Count:<s:textfield name="count"></s:textfield>
    <s:fielderror fieldName="count"></s:fielderror>
    <br><br>
    IDCard:<s:textfield name="idcard"></s:textfield>
    <s:fielderror fieldName="idcard"></s:fielderror>
    <s:submit></s:submit>
    </s:form>
  </body>
</html>
