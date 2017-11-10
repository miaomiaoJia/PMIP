<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'modifyPassword.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1 align="center">修改密码页面</h1><br/>
    <form method="post" action="${pageContext.request.contextPath }/student/modifyPassword">
     新密码：<input type="password" name="password"><br/>
     <!--   邮箱： <input type="text" name="email"><br/> -->
    验证码： <input type="text" value="verifycode"><button  type="submit" value="获取验证码" onclick="submit();"></button>
        <input type="submit" value="修改密码"><br/>
    </form> 
    新密码：
  </body>
</html>
