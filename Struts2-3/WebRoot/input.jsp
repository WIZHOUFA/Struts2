<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
  <s:debug></s:debug>
    <s:form action="emp-input" method="post">
    <s:textfield name="name" label="Name"></s:textfield>
    <s:password name="password" label="Password"></s:password>
    <s:radio name="gender" list="#{'1':'Male','0':'Female'}" label="Gander"></s:radio>
    <s:select label="部门" name="departmentName" list="#request.department" listKey="departmentID" listValue="departmentName" headerKey="" headerValue="请选择"></s:select>
    <s:checkboxlist label="Role" name="roleName" list="#request.role" listKey="roleID" listValue="roleName"></s:checkboxlist>
    <s:textarea name="desc" label="Desc"></s:textarea>
    <s:submit></s:submit>
    </s:form>
  </body>
</html>
