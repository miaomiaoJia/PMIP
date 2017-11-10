 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'showAllStudent.jsp' starting page</title>
    
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
    <h1 align="center">所有学生信息</h1>
    <table border="1">
      <tr> 
      <td>姓名</td>
       <td>学号</td>
        <td>性别</td>
         <td>班级</td>
          <td>邮箱</td>
      </tr>
        <c:forEach var="student" items="${allStudent }">
           <tr>
               <td><c:out value="${student.studentname }"></c:out></td>
               <td><c:out value="${student.studentnumber }"></c:out></td>
               <td><c:out value="${student.sex }"></c:out></td>
               <td><c:out value="${student.studentclass }"></c:out></td>
               <td><c:out value="${student.email }"></c:out></td>
           </tr>
        </c:forEach>
    </table>
  </body>
</html>
