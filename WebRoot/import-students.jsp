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
    <link rel="stylesheet" href="assets/css/bootstrap-datetimepicker.css">
    <link rel="stylesheet" href="assets/css/bootstrap-fileupload.min.css">

    <script src="assets/js/jquery-2.1.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
    <script src="assets/js/bootstrap-fileupload.js"></script>
    <script src="assets/js/studentsInformation.js"></script>
    <script src="assets/js/bootstrap-datetimepicker.js"></script>
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
                <li>
                    <a href="add-students.jsp">添加学生</a>
                </li>
                <li  class="active">
                    <a href="import-students.jsp">导入学生资料</a>
                </li>


            </ul>
        </div>
        <div class="col-md-10">
       		 <div class="row-fluid" id="inputs">
                    <form method="post" action="" class="form-horizontal">
                        <div class="form-group">
                            <label for="studentName" class="col-sm-4 text-right">学生姓名:</label>
                            <div class="col-sm-8">
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="studentName" id="studentName" placeholder="金培源"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="studentId" class="col-sm-4 text-right">学生学号:</label>
                            <div class="col-sm-8">
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="studentId" id="studentId" placeholder="1506010512"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="materialName" class="col-sm-4 text-right">材料名称:</label>
                            <div class="col-sm-8">
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="materialName" id="materialName" placeholder="预备党员思想汇报"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="materialType" class="col-sm-4 text-right">材料类别:</label>
                            <div class="col-sm-8">
                                <div class="col-sm-6">
                                    <select class="form-control selectChoice" id="materialType" name="materialType">

                                    <option value="">思想汇报</option>
                                    <option value="">转正申请</option>
                                    <option value="">竞赛成果</option>
                                    <option value="">四六级成绩</option>
                                    <option value="">计算机等级成绩</option>
                                    <option value="">社会工作</option>
                                    <option value="">获得奖项</option>
                                </select>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="fileTime" class="col-sm-4 text-right">材料时间:</label>
                            <div class="col-sm-8">
                                <div class="col-sm-6">
                                    <div class="input-group date" id="date" data-date-viewmode="years" >
                                    <input type="text" class="form-control" readonly >
                                    <!--<span class="input-group-addon add-on"><i class="fa fa-remove"></i> </span>-->
                                    <span class="input-group-addon add-on"><i class="fa fa-calendar"></i></span>
                                </div>
                                </div>
                            </div>


                        </div>

                        <div class="form-group">
                            <label for="fileName" class="col-sm-4 text-right">相关文件&nbsp</label>
                            <div class="col-sm-8">
                                <div class="col-sm-12">
                                    <input type="file" id="fileName">
                                    	（支持格式jpg,gif,png,jpeg,bmp,zip,rar,doc,xls,ppt,docx,xlsx,pptx,pdf）
                                </div>
                            </div>
                        </div>

                        <!--operator button-->
                        <div class="form-group">
                            <div class="col-sm-6">
                                <button class="btn btn-info pull-right" type="submit">提交</button>
                            </div>

                            <div class="col-sm-6">
                                <button class="btn btn-danger" type="reset">重置</button>
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
