<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>申请审核</title>
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
                                    <a href="index.html"><h3>党员信息管理系统</h3></a>
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
                    <li class="active">
                        <a href="#">资料审核</a>
                    </li>
                    <li>
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
                    <a href="index-manager.jsp">材料审核<span class="badge pull-right">4</span></a>
                </li>
                <li class="active">
                    <a href="#">申请审核<span class="badge pull-right">4</span></a>
                </li>


            </ul>
        </div>
        <div class="col-md-10 table-responsive">
            <h3>
                申请审核
            </h3>
            <table class="table table-bordered table-striped table-hover tb-stu">
                <thead>
                <tr>

                    <th><i class="fa fa-bookmark"></i>学号</th>
                    <th><i class="fa fa-user"></i>姓名</th>
                    <th><i class="fa fa-file"></i>申请名称</th>
                    <th><i class="fa fa-tags"></i>申请类别</th>
                    <th><i class="fa fa-clock-o"></i>申请时间</th>
                    <th><i class="fa fa-globe"></i>状态(点击下载附件)</th>
                </tr>
                </thead>

                <tbody>
                 <tr>
                    <th>1506010512222
                    <th>金培源金培源金培源</th>
                    <th>党员思想汇报党员思想汇报党员思想汇报</th>
                    <th>材料类别</th>
                    <th>2016-12-08 18:13</th>
                    <th><a href="#">待审核</a></th>
                </tr>
                <tr>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>党员思想汇报</th>
                    <th>材料类别</th>
                    <th>2016-12-08 18:13</th>
                    <th><a href="#">待审核</a></th>
                </tr>


                </tbody>
            </table>
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
