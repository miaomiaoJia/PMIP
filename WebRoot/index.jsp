<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <h1 align="center">这是学生主页</h1><br/>
    <h4 align="center">当前用户：${student.studentname }</h4><br/>
    <a href="${pageContext.request.contextPath }/student/quit.action">退出</a><br/>
    <a href="${pageContext.request.contextPath }/student/personalInformation.action">查询个人信息</a><br/>
    <a href="${pageContext.request.contextPath }/student/seeNews.action">查看消息记录</a><br/>
    <a href="${pageContext.request.contextPath }/student/toPassword">修改密码</a><br/>
    <a href="${pageContext.request.contextPath }/upload.jsp">文件上传</a><br/>
    <a href="${pageContext.request.contextPath }/material/showAllMaterial.action">我的材料</a>
  </body>
</html>
