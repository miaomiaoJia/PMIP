<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>添加学生</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->


    <link rel="stylesheet" href="assets/css/font-awesome.css">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">

    <script src="assets/js/jquery-2.1.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
    <script src="assets/js/studentsInformation.js"></script>
</head>
<body>

<!-- Add your site or application content here -->

<!-- header Start
================================================= -->

<section id="header">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div class="block-left">
                    <nav class="navbar navbar-default" role="navigation">
                        <div class="container-fluid">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                                        data-target="#bs-example-navbar-collapse-1">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <div class="nav-logo">
                                    <a href="index-manager.jsp"><h3>党员信息管理系统</h3></a>
                                </div>
                            </div>
                        </div><!-- /.container-fluid -->
                    </nav>
                </div>
            </div><!-- .col-md-6 -->

            <div class="col-md-6">
                <div class="block-right">
                    <div class="contact-area">
                        <ul>
                            <li><i class="fa fa-user"></i>当前用户：1506010123（XX）</li>
                            <li><a href="login.jsp">注销</a></li>
                            <li><a href="modifyPassword.jsp">修改密码</a></li>
                        </ul>
                    </div>
                </div>
            </div><!-- .col-md-6 close -->
        </div><!-- .row close -->
        <div class="row ">
            <div class="col-md-12">
                <ul class="nav nav-tabs">
                    <li>
                        <a href="application-manager.jsp">资料审核</a>
                    </li>
                    <li class="active">
                        <a href="manageStudent.jsp">学生管理</a>
                    </li>


                </ul>
            </div>
        </div>
    </div><!-- .container close -->
</section><!-- #heder close -->


<div class="container">
    <div class="row">
        <div class="col-md-2">
            <ul class="nav nav-stacked nav-pills">
                <li>
                    <a href="manageStudent.jsp">查看学生资料</a>
                </li>
                <li>
                    <a href="select-students.jsp">筛选学生</a>
                </li>
                <li  class="active">
                    <a href="add-students.jsp">添加学生</a>
                </li>
                <li>
                    <a href="import-students.jsp">导入学生资料</a>
                </li>
            </ul>
        </div>
        <div class="col-md-10">
        	<div class="panel panel-default" >
                <div class="panel-heading">
                    <h3 class="panel-title" id="title"></h3>
                    <ul class="nav nav-pills show" id="control">
                        <li class="active"> <button type="button" class="btn btn-info btn-lg" id="leading-in">单个添加</button></li>
                        <li> <button type="button" class="btn btn-default btn-lg" id="batch-import">批量导入</button></li>
                    </ul>
                </div>
                <div class="panel-body">
                    <div id="introduction" class="row-fluid">
                        <h4>
                           单个添加：添加某个同学的信息
                        </h4>
                        <h4>
                            批量导入：通过xls表格文件批量导入同学信息
                        </h4>

                    </div>
                    <div id="studentInfo" class="row-fluid hidden">
                        <form method="post" action="${pageContext.request.contextPath }/manager/addStudent.action" class="form-horizontal" id="myform">
                            <div class="form-group">
                                <label for="" class="col-sm-2 text-right">院系:</label>
                                <div class="col-sm-10 row" id="departmentSpecialty">
                                    <!--department select-->
                                    <div class=" col-sm-3" style="padding-right: 0">
		                                <select class="form-control selectChoice" id="department" >
		                                    <option value="0">选择学院</option>
		                                </select>
                            		</div>
                                    <!--domain select-->
                                    <div class="col-sm-3" style="padding-right: 0">
		                                <select class="form-control selectChoice" id="domain"   >
		                                    <option value="0" >选择专业</option>
		                                </select>
                           			</div>
                                    <!--grade select-->
                                    <div class="col-sm-2" style="padding-right: 0">
		                                <select class="form-control  selectChoice" id="grade">
		                                    <option value="0">选择班级</option>
		                                </select>
                            		</div>
                                </div>
                            </div>
                            <!--填入框-->
                            <div id="inputs">
                                <!--name,id-->
                                <div class="form-group">
                                    <label for="studentId" class="col-sm-2 text-right ">学号:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="studentId" class="form-control col-sm-3" placeholder="1506010501"/>
                                    </div>

                                    <label for="studentName" class="col-sm-2 text-right" >姓名:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="studentName" class="form-control col-sm-3" placeholder="金培源"/>
                                    </div>
                                </div>
                                <!--sex,politicalStatus-->
                                <div class="form-group">
                                    <label  class="col-sm-2 text-right radio_inline ">性别:</label>
                                    <div class="col-sm-3">
                                        <div class="col-sm-6">
                                            <input type="radio" name="sex" id="optionsRadio1" value="man"  checked/>男
                                        </div>
                                        <div class="col-sm-6">
                                        	<input type="radio" name="sex" id="optionsRadio2"  value="woman"/>女
                                        </div>
                                    </div>
                                    <label for="politicalStatus" class="col-sm-2 text-right">政治面貌:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="politicalStatus" class="form-control col-sm-3" placeholder="预备党员"/>
                                    </div>
                                </div>
                                <!--CET-4，CET-6-->
                                <div class="form-group">
                                    <label  for="CET-4" class="col-sm-2 text-right">四级成绩:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="CET-4" class="form-control col-sm-3" placeholder="560"/>
                                    </div>

                                    <label for="CET-6" class="col-sm-2 text-right">六级成绩:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="CET-6" class="form-control col-sm-3" placeholder="540"/>
                                    </div>
                                </div>
                                <!--GPA,rank-->
                                <div class="form-group">
                                    <label  for="GPA" class="col-sm-2 text-right">绩点:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="GPA" id="GPA" class="form-control " placeholder="5.0">
                                    </div>

                                    <label  for="rank" class="col-sm-2 text-right">排名:</label>
                                    <div class="col-sm-3">
                                        <input type="text" name="rank" id="rank" class="form-control" placeholder="3">
                                    </div>
                                </div>
                            </div>
                            <!--operator button-->
                            <div class="form-group">
                                <div class="col-sm-6 col-sm-push-4 col-xs-6">
                                    <button class="btn btn-info center-block  col-sm-2" type="submit">提交</button>
                                </div>

                                <div class="col-sm-6">
                                    <button class="btn btn-danger  col-sm-2" type="reset">重置</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div id="studentsInfo" class="row-fluid hidden">
                        <form method="post" action="" class="form-horizontal">
                            <div class="form-group">
                                <label for="fileName" class="col-sm-2  text-right">导入文件:</label>
                                <div class="col-sm-10">
                                    <!--department select-->
                                    <input type="file" id="fileName">
                                </div>
                            </div>

                            <!--operator button-->
                            <div class="form-group">
                                <div class="col-sm-6 col-sm-push-4 col-xs-6">
                                    <button class="btn btn-info center-block  col-sm-2" type="submit">提交</button>
                                </div>

                                <div class="col-sm-6">
                                    <button class="btn btn-danger  col-sm-2" type="reset">重置</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div> <!--row end-->
</div><!--container end-->
                   


<!-- footer Start
====================================================================== -->

<div id="footer" style="display: none">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
            </div><!-- col-md-12 -->
        </div><!-- .row -->
    </div><!-- .container -->
</div><!-- #footer -->

</body>
</html>
