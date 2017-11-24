<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
	<title>
		登陆
	</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">

	<meta charset="utf-8">
	<style type="text/css">
		body
		{
			background-color: #f8f6e9;
		}
		.container
		{
			background: white;
			margin: 0.8;
			height: 420px;
			width:380px;
			padding-top: 2.5%;
			padding-left: 0px;
			padding-right: 0px;
			top: 15%;
			margin-top: 130px;
			margin-left: auto;
			margin-right: auto;
			border-radius: 10px;
			border: 2px solid #46b8da;
		}
		.title
		{
			font-family:sans-serif;
		}
		.row
		{
			margin: 2%;
		}
		.mybton
		{
			border: 1px solid black;
		}
		.belong
		{
			font-size: 10px;
			color: gray;
		}

	</style>
</head>
<body>
<form action="" method="post">

	<div class="container">
		<div class="row">
			<div class="col-lg-10 col-lg-offset-1 text-center text-info">
				<h2 class="title">党员管理系统</h2>
			</div>
		</div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		
		<div class="row">
			<div class="col-lg-1 col-lg-offset-1">
				<div class="row" style="height: 7px"></div>
				<div class="row">
					<i class="mybtn fa fa-user fa-user fa-lg"></i>
				</div>
			</div>
	
			<div class="col-lg-9 ">
				<input type="text" name="id" class="form-control"  placeholder="请输入学号" required autofocus/>
				
			</div>
		</div>

		<div class="row"></div>
		
		<div class="row">
			<div class="col-lg-1 col-lg-offset-1">
				<div class="row" style="height: 7px"></div>
				<div class="row">
					<i class="mybtn fa fa-user fa-lock fa-lg"></i>
				</div>
			</div>
			<div class="col-lg-9 ">
				<input type="password" name="password" class="form-control "  placeholder="请输入密码" required autofocus/>
				
			</div>
		</div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row">
			<div class="col-lg-5 col-lg-offset-1">
				<input type="checkbox"  class="col-lg-2">记住密码</input>
			</div>
			<div class="col-lg-5 col-lg-offset-1"">
				<a href="">忘记密码？</a>
			</div>

		</div>
		<div class="row"></div>
		<div class="row">
			<div class="col-lg-10 col-lg-offset-1">
				<input type="submit" name="submit" class="btn btn-info col-lg-12" value="登录">
			</div>
			
		</div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row"></div>
		<div class="row rbelong">
			<div class="col-lg-12 text-center">
				<p class="belong">版权所有©河海大学-党支部</p>
			</div>
		</div>

	</div>
	
</form>



</body>
</html>