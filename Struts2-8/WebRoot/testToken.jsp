<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  <s:debug></s:debug>
  <s:form action="testToken" method="post">
  <s:token></s:token>
  <s:actionerror/>
  <s:textfield name="username" label="Username"></s:textfield>
  <s:submit></s:submit>
  </s:form>
   <br>
  </body>
</html>
