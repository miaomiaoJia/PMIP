<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>学生管理</title>
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
                        <a href="index-manager.jsp">资料审核</a>
                    </li>
                    <li  class="active">
                        <a href="#">学生管理</a>
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
                    <a href="#">查看学生资料</a>
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
        <div class="col-md-10 table-responsive" id="studentsFundmentalMaterial">
            <h3>
                学生资料
            </h3>
            <table class="table table-bordered table-striped table-hover tb-stu">
                <thead>
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

                <tbody>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="view-students.jsp">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                <tr>
                    <th>计算机与信息学院</th>
                    <th>2015级</th>
                    <th>计算机科学与技术</th>
                    <th>5</th>
                    <th>1506010512</th>
                    <th>金培源</th>
                    <th>男</th>
                    <th>预备党员</th>
                    <th>5.0</th>
                    <th><a href="#">更多<i class="fa fa-angle-double-right [&#xf101;]"></i> </a></th>
                </tr>
                </tbody>
            </table>

            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-7">
                    <div class="container">
                        <ul class="pagination">
                            <li class="active"><a href="#">首页</a> </li>
                            <li><a href="#">上一页</a> </li>
                            <li><a href="#">1</a> </li>
                            <li><a href="#">2</a> </li>
                            <li class="disabled"><a href="#">……</a> </li>
                            <li><a href="#">8</a> </li>
                            <li><a href="#">下一页</a></li>
                            <li><a href="#">尾页</a> </li>
                        </ul>
                    </div>
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
