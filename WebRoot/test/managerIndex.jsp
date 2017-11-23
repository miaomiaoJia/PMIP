<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'managerIndex.jsp' starting page</title>
    
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
    <h1 align="center">管理员中心</h1>
    <a href="${pageContext.request.contextPath }/addstudent.jsp">添加学生信息</a>
    <a href="${pageContext.request.contextPath }/manager/seeAllStudent.action">查看所有学生信息</a>
    <a href="${pageContext.request.contextPath }/addnews.jsp">给学生发送消息</a>
    <a href="${pageContext.request.contextPath }/select.jsp">选择查询方式</a>
  </body>
</html>
