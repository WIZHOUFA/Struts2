<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
   <s:debug></s:debug>
    <s:form action="emp-input" method="post">
    <s:textfield name="empName" label="EmpName"></s:textfield>
    <s:textfield name="age" label="Age"></s:textfield>&nbsp; 
     ${fieldErrors.age[0]} 
    <s:textfield name="address" label="Address"></s:textfield>     
     <s:textfield name="birth" label="Birth"></s:textfield>
     <br><br>
      <s:submit></s:submit>
    </s:form>
  </body>
</html>
