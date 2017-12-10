<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>
		登录
	</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="assets/css/login.css"/>
	<meta charset="utf-8">
	<script src="assets/js/login.js"></script>
	<script src="assets/js/bootstrap.js"></script>
</head>
<body>
<form id="sub" action="" method="post">

	<div class="container">
		<div class="row">
			<div class="col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 col-md-10 col-md-offset-1 col-sm-offset-1 col-sm-offset-1 text-center text-info">
				<h2 class="title">党员管理系统</h2>
			</div>
		</div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		
		<div class="row">
			<div class="col-lg-1 col-lg-offset-1 col-xs-1 col-xs-offset-1 col-md-1 col-md-offset-1 col-sm-1 col-sm-offset-1">
				<div class="row">
					<i class="mybtn fa fa-user fa-lg"></i>
				</div>
			</div>
	
			<div class="col-lg-9 col-md-9 col-xs-9 col-sm-9">
				<input type="text" name="personId" id='changeId' class="form-control"  placeholder="请输入学号" required autofocus/>
				
			</div>
		</div>

		<div class="row" style="height: 7px"></div>
		<div class="row">
			<div class="col-lg-1 col-lg-offset-1 col-xs-1 col-xs-offset-1 col-md-1 col-md-offset-1 col-sm-1 col-sm-offset-1">
				<div class="row">
					<i class="mybtn fa  fa-lock fa-lg"></i>
				</div>
			</div>
			<div class="col-lg-9 col-xs-9 col-md-9 col-sm-9">
				<input type="password" name="password" class="form-control "  placeholder="请输入密码" required autofocus/>
				
			</div>
		</div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>

		<div class="row">
			<div class="col-lg-4 col-lg-offset-2 col-xs-4 col-xs-offset-2  col-md-4 col-md-offset-2 col-sm-4 col-sm-offset-2">
				<i id="student" onclick="toStudent()" class="fa fa-square-o"></i><label onclick="toStudent()">&nbsp&nbsp学生</label>
			</div>
			<div class="col-lg-4 col-lg-offset-1 col-xs-4 col-xs-offset-1 col-md-4 col-md-offset-1 col-sm-4 col-sm-offset-1">
				<i id="manager" onclick="toManager()" class="fa fa-square-o"></i><label onclick="toManager()">&nbsp&nbsp管理员</label>
			</div>

		</div>
		
		<div class="row">
			<div class="col-lg-12 col-xs-12 col-md-12 col-sm-12 text-center" id="message" style="display: none;color: red;">
				<p >请选择登录类型</p>
			</div>
		</div>
		<div class="row"></div>
		<div class="row">
			<div class="col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1">
				<input type="submit" name="submit" class="btn btn-info col-lg-12 col-xs-12 col-md-12 col-sm-12" onclick="return check()" value="登录">
			</div>
			
		</div>
		
		
		<div class="row" style="height: 40px"></div>
		<div class="row rbelong">
			<div class="col-lg-12 col-xs-12 col-md-12 col-sm-12 text-center">
				<p class="belong">版权所有©河海大学-党支部</p>
			</div>
		</div>

	</div>
	
</form>

</body>
</html>