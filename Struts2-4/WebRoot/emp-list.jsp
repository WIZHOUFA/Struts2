<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
  <s:debug></s:debug>
  <br>
  <s:form action="emp-save" method="post">
  <s:textfield name="firstName" label="FirstName"></s:textfield>
  <s:textfield name="lastName" label="lastName"></s:textfield>
  <s:submit></s:submit>
  </s:form>
  <table cellpadding="10" cellspacing="0" border="1">
     <thead>
        <tr> <td>eEmployeeID</td><td>FirstName</td><td>LastName</td><td>Edit</td><td>Delete</td></tr>
     </thead>
     <s:iterator value="#request.list"><tr>
      <td>${employeeID }</td>
      <td>${firstName }</td>
      <td>${lastName }</td>
      <td><a href="emp-edit?employeeID=${employeeID}">Edit</a></td>
      <td><a href="emp-delete?employeeID=${employeeID}">Delete</a></td>
     </tr></s:iterator>
  </table>
  </body>
</html>
