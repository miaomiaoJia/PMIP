<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'addstudent.jsp' starting page</title>
    
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
  <h1 align="center">注册页面</h1>
    <form action="${pageContext.request.contextPath }/manager/addStudent.action" method="post">
      姓名：<input type="text" name="studentname"><br/>
     学号 ：  <input type="text" name="studentnumber"><br/>
   性别：   <input type="text" name="sex"><br/>
  密码：    <input type="password" name="password"><br/>
  专业班级：   <input type="text" name="studentclass"><br/>
      <input type="submit" value="提交">	
    </form>
  </body>
</html>
