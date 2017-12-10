<%@page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>筛选学生</title>
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
                <li class="active">
                    <a href="select-students.jsp">筛选学生</a>
                </li>
                <li>
                    <a href="add-students.jsp">添加学生</a>
                </li>
                <li>
                    <a href="import-students.jsp">导入学生资料</a>
                </li>


            </ul>
        </div>
        <div class="col-md-10 table-responsive">
            <h3>
                筛选学生
            </h3>

            <div class="row-fluid">
                <div id="selector">
                    <form method="post" action="" class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-1">

                            </div>
                            <div class="col-sm-11" id="departmentSpecialty">
                                <!--学院下拉框-->
                                <div class="col-sm-3">
                                    <select class="form-control selectChoice" id="department" >
                                        <option value="0">选择学院</option>
                                    </select>
                                </div>

                                <!--年级下拉框-->
                                <div class="col-sm-2">
                                    <select class="form-control selectChoice">
                                        <option value="2014">2014级</option>
                                        <option value="2015" selected>2015级</option>
                                        <option value="2016">2016级</option>
                                        <option value="2017">2017级</option>
                                    </select>
                                </div>

                                <!--专业下拉框-->
                                <div class="col-sm-3">
                                    <select class="form-control selectChoice" id="domain" >
                                        <option value="0" class="label">选择专业</option>
                                    </select>
                                </div>
                                <!--班级下拉框-->
                                <div class="col-sm-2">
                                    <select class="form-control selectChoice" id="grade" >
                                        <option value="0" class="label">选择班级</option>
                                    </select>
                                </div>
                            </div>
                        </div>


                        <div class="form-group" id="inputs">

                            <label for="studentID" class="col-sm-2 text-right">学号:</label>
                            <div class="col-sm-3">
                                <input type="text" id="studentID" class="form-control col-sm-3" placeholder="1506010512"/>
                            </div>

                            <label for="studentName" class="col-sm-1 text-right">姓名:</label>
                            <div class="col-sm-3">
                                <input type="text" id="studentName" class="form-control col-sm-3" placeholder="金培源"/>
                            </div>
                            <div class="col-sm-2 ">
                                <button class="btn btn-info " type="button" id="button1" >搜索</button>
                            </div>
                        </div>


                    </form>
                </div>
            </div>
            <div class="row-fluid hidden" id="selectedStudents" >
                <table class="table table-bordered table-striped table-hover ">
                    <thead id="fields">
                    <tr>
                        <th><i class="fa fa-university"></i>院系</th>
                        <th><i class="fa fa-mortar-board"></i>年级</th>
                        <th><i class="fa fa-group (alias) [&#xf0c0;]"></i>专业</th>
                        <th><i class="fa fa-qrcode"></i>班级 </th>
                        <th><i class="fa fa-bookmark"></i>学号</th>
                        <th><i class="fa fa-user"></i>姓名</th>
                        <th><i class="fa fa-male [&#xf183;]"></i>性别 </th>
                        <th><i class="fa fa-globe"></i>政治面貌</th>
                        <th><i class="fa fa-book [&#xf02d;]"></i>绩点</th>
                        <th><i class="fa fa-search-plus [&#xf00e;]"></i>详细资料</th>
                    </tr>
                    </thead>

                    <tbody id="info">
                    </tbody>
                </table>
            </div>
        </div>

    </div><!--row-->

</div><!--container-->


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
