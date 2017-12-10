<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>
		修改密码
	</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="assets/css/modifyPassword.css">
	<script src="assets/js/modifyPassword.js"></script>
	<meta charset="utf-8">
</head>
<body>
 <form class="form-inline" role="form" action="${pageContext.request.contextPath }/student/modifyPassword">
	<div class="container">
		<div class="row" id="top">
			<div class="col-lg-1 col-md-1 col-sm-1 col-xs-1" id="colLine">
				<div id="line"></div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4" id="nextColLine">
				<h5 id="modifyPassword">更改密码</h5>
			</div>
		</div>

		<div class="row" id="empty">
		</div>


		<div class="row" >
			<div class="col-lg-3 col-md-3 col-xs-3 col-sm-3" id="bord" >
				<label class="form-label" id="word" >学号：</label>
			</div>
			<div class="col-lg-7 col-md-7 col-xs-7 col-sm-7 " >
				<input type="text" name="personId" style="width: 250px" class="form-control" required autofocus/>
			</div>			
			<div class="col-lg-2 col-md-2 col-xs-2 col-sm-2" >
			</div>
		</div>


		<div class="row" id="empty2">
		</div>


		<div class="row">
			
			<div class="col-lg-3 col-md-3 col-xs-3 col-sm-3" id="bord">
				<label class="form-label" id="word">新密码：</label>
			</div>
			<div class="col-lg-7 col-md-7 col-xs-7 col-sm-7 ">
				<input type="password" name="password" id="password" style="width: 250px" class="form-control" onclick="changeMessage()" required autofocus/>
			</div>			
		</div>


		<div class="row" id="empty2">
		</div>


		<div class="row">
			<div class="col-lg-3 col-md-3 col-xs-3 col-sm-3" id="bord">
				<label class="form-label" id="word">确认密码：</label>
			</div>
			<div class="col-lg-7 col-md-7 col-xs-7 col-sm-7">
				<input type="password" name="confirmPass" 
			id="repassword" style="width: 250px" class="form-control" required autofocus/>
			</div>	
			<div class="col-lg-2 col-md-2 col-xs-2 col-sm-2" id="message">
				密码不一致！
			</div>		
		</div>


		<div class="row" id="empty3">
		</div>


		<div class="row">
			<div class="col-lg-offset-9 col-md-offset-9 col-xs-offset-9 col-sm-offset-9 col-lg-2 col-md-2 col-xs-2 col-sm-2">
				<input type="submit" name="submit" class="btn btn-info" onclick="return check()" value="确定修改"/>
			</div>
				
		</div>

	</div>
</form>

</body>
</html>