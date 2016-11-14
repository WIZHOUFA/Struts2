<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  <s:debug></s:debug>
    <a href="i18n.action?request_locale=en_US">English</a>
	<a href="i18n.action?request_locale=zh_CN">中文</a><br>
    <a href="input.jsp">input</a><br>
    <s:text name="time">
    <s:param value="date"></s:param>
    </s:text>
    <s:form theme="simple">
    <s:text name="username"></s:text><s:textfield name="username" label="%{getText('username')}"></s:textfield>
    <s:text name="username"></s:text><s:textfield name="username" key="username"></s:textfield>
    <s:text name="password"></s:text><s:password name="password" key="password"></s:password>
    <s:submit key="submit"></s:submit>
    </s:form>
  </body>
</html>
