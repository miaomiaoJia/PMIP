<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- js实现改变表单提交路径 -->
  <script type="text/javascript">  
function userLogin(){  
    document.forms['loginForm'].action = "${pageContext.request.contextPath }/student/login.action";  
    document.forms['loginForm'].submit();  
}  
function managerLogin(){  
    document.forms['loginForm'].action = "${pageContext.request.contextPath }/manager/login.action";  
    document.forms['loginForm'].submit();  
}  
</script> 
  <body>
    <h1>登录界面</h1>
    <h4>${msg}</h4>
    <form name="loginForm" action="" method="post">
       <input type="text" name="username"/>
       <br/>
       <input type="password" name="password"/> 
       <br/>
       <table>
       <tr>
         <td>
       <input type="button" value="用户登录" onclick="userLogin()"/>
         </td>
          <td>
       <input type="button" value="管理员登录" onclick="managerLogin()"/>
         </td>
       </tr>
       </table> 
    </form>
  </body>
</html>
