<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
   Welcome:${sessionScope.username }<br><br/>
   Welcome.Number of users online:${applicationScope.personOnline}<br><br>
   <a href="User_logout.action">logout</a>
   
  </body>
</html>
