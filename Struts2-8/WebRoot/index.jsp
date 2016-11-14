<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
    <s:debug></s:debug>
    <s:form action="fileUpload" method="post" enctype="multipart/form-data">
    <s:file name="ppt" label="File"></s:file>
    <s:textfield name="desc" label="Desc"></s:textfield>
    <s:submit></s:submit>
    </s:form>
  </body>
</html>
