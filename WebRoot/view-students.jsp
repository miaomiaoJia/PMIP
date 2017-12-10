<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>详细信息</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->


    <link rel="stylesheet" href="assets/css/font-awesome.css">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">

    <script src="assets/js/jquery-2.1.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
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
                <li class="active">
                    <a href="manageStudent.jsp">查看学生资料</a>
                </li>
                <li>
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
        <div class="col-md-10">
            <div class="container-fluid">
                <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">个人信息</h3>
                </div>
                <div class="table-responsive">
                    <table class="table table-bordered table-striped table-hover">
                        <tbody>
                        <tr>
                            <th>姓名</th>
                            <td>金培源</td>
                            <th>性别</th>
                            <td>男</td>
                        </tr>
                        <tr>
                            <th>学号</th>
                            <td>1506010123</td>
                            <th>年级专业班级</th>
                            <td>2015级计算机科学与技术5班</td>
                        </tr>
                        <tr>
                            <th>政治面貌</th>
                            <td>预备党员</td>
                            <th>邮箱</th>
                            <td>1506010501@hhu.edu.cn</td>
                        </tr>
                        <tr>
                            <th>绩点</th>
                            <td>5.00</td>
                            <th>排名</th>
                            <td>111</td>
                        </tr>
                        <tr>
                            <th>四级</th>
                            <td>666</td>
                            <th>六级</th>
                            <td>666</td>
                        </tr>
                        <tr>
                            <th>计算机等级考试</th>
                            <td colspan="3">二级优秀</td>
                        </tr>
                        <tr>
                            <th>社会工作</th>
                            <td colspan="3">很多很多很多很多很多很多很多</td>
                        </tr>
                        <tr>
                            <th>获得奖项</th>
                            <td colspan="3"></td>
                        </tr>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>

    </div>

</div>


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
