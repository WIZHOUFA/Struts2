<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
  <s:debug></s:debug>
    <s:form action="emp-update" method="post">
    <s:hidden name="employeeID"></s:hidden>
    <s:textfield name="firstName" label="FirstName"></s:textfield>
    <s:textfield name="lastName" label="lastName"></s:textfield> 
    <s:submit></s:submit>
    </s:form>
  </body>
</html>
