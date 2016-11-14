<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:form action="product_save.action" method="post">
		
		ProductName: <s:textfield name="name"/>
		<br><br>

		ProductBrand: <s:textfield type="text" name="brand"/>
		<br><br>
		
		ProductPrice: <s:textfield type="text" name="price" />
		<br><br>
		
		<s:submit value="Submit"/>
		<br><br>
	</s:form>

</body>
</html>