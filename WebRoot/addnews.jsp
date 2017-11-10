<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'addnews.jsp' starting page</title>
    
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
    <h1 align="center">发送消息页面</h1>
    <form method="post" action="${pageContext.request.contextPath }/manager/sendNews.action">
        消息主题 :<input type="text" name="newstitle"><br/>
        消息内容:<textarea rows="3" cols="4" name="newscontent"></textarea><br/>    
        <!-- 先实现发送给一个学生 -->
             选择要添加的学生:<br/>
             <tr>
             <c:forEach var="student" items="${allStudent }">
                  <td>
                  <input type="checkbox" name="studentname"/>${student.studentname }
                  </td>
               </c:forEach>
             </tr>
             <!--自定义绑定的列表 -->
        <input type="submit" value="发送"/>
    </form>
  </body>
</html>
