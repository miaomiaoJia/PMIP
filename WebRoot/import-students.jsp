<%@page contentType="text/html;charset=utf-8"%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>导入学生</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->


    <link rel="stylesheet" href="assets/css/font-awesome.css">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/bootstrap-fileupload.min.css">

    <script src="assets/js/jquery-2.1.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
    <script src="assets/js/bootstrap-fileupload.js"></script>
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
                            <li><a href="#">注销</a></li>
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
                <li>
                    <a href="add-students.jsp">添加学生</a>
                </li>
                <li  class="active">
                    <a href="import-students.jsp">导入学生资料</a>
                </li>


            </ul>
        </div>
        <div class="col-md-10">
            <div>
                <h3>
                    导入学生资料
                </h3>
                <form method="post" action="" class="form-horizontal">
                    <div class="form-group">
                        <label for="studentId" class="col-sm-2 text-right">学号:</label>
                        <div class="col-sm-3">
                            <input type="text" name="studentId" class="form-control col-sm-3" placeholder="1506010501"/>
                        </div>

                        <label for="studentName" class="col-sm-1 text-right" >姓名:</label>
                        <div class="col-sm-3">
                            <input type="text" name="studentName" class="form-control col-sm-3" placeholder="金培源"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="fileName" class="col-sm-2 text-right">导入文件:</label>
                        <div class="col-sm-10">
                            <div class="fileupload fileupload-new" data-provides="fileupload">
                                <span class="btn btn-file btn-default">
                                    <span class="fileupload-new">选择文件</span>
                                    <span class="fileupload-exists">Change</span>
                                    <input type="file" id="fileName">
                                </span>
                                <span class="fileupload-preview"></span>
                                <a href="#" class="close fileupload-exists" data-dismiss="fileupload" style="float: none">×</a>
                            </div>
                        </div>
                    </div>


                    <!--operator button-->
                    <div class="form-group ">

                        <div class="col-sm-6 col-sm-push-4 col-xs-5 ">
                            <button class="btn btn-info  center-block col-sm-2" type="submit">提交</button>
                        </div>


                        <div class="col-sm-6 ">
                            <button class="btn btn-danger col-sm-2 " type="reset">重置</button>
                        </div>
                    </div>
                </form>

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
