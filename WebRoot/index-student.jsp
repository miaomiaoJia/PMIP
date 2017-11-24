<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="student" class="com.data.bean.Person"></jsp:useBean>
<jsp:useBean id="gradetable" class="com.data.bean.Gradetable"></jsp:useBean>
<jsp:useBean id="material" class="com.data.bean.Material"></jsp:useBean>
<jsp:useBean id="massage" class="com.data.bean.Massage"></jsp:useBean>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>党员管理系统-学生端</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="assets/css/font-awesome.css">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/bootstrap-fileupload.min.css">

    <script src="assets/js/jquery-2.1.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
    <script src="assets/js/bootstrap-fileupload.js"></script>

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
                                    <a href="index-student.jsp"><h3>党员信息管理系统</h3></a>
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
                            <li><i class="fa fa-user"></i>当前用户：1506010123（学生）</li>
                            <li><a href="#">注销</a></li>
                        </ul>
                    </div>
                </div>
            </div><!-- .col-md-6 close -->
        </div><!-- .row close -->
        <div class="row ">
            <div class="col-md-4">
                <ul id="myTab" class="nav nav-tabs">
                    <li class="active">
                        <a href="#" data-toggle="tab" class="PersonalManagement">个人管理</a>
                    </li>
                    <li>
                        <a href="#" data-toggle="tab" class="MaterialManagement">材料管理</a>
                    </li>
                    <li>
                        <a href="#" data-toggle="tab" class="Alerts" class="badge pull-right"><span
                                class="badge pull-right">3</span>消息通知</a>
                    </li>
                </ul>
            </div>
        </div>
    </div><!-- .container close -->
</section><!-- #heder close -->


<div class="container">
    <div class="row">
        <div class="col-md-2">
            <ul class="nav nav-stacked nav-pills" id="LeftPM">
                <li>
                    <a href="#" class="PersonalInformation">个人信息</a>
                </li>
                <li>
                    <a href="#" class="PartyInformation">党籍信息</a>
                </li>
                <li>
                    <a href="#" class="RewardsAndPunishments">奖惩信息</a>
                </li>
            </ul>
            <ul class="nav nav-stacked nav-pills" id="LeftMM">
                <li>
                    <a href="#" class="UploadedMaterial">已上传材料</a>
                </li>
                <li>
                    <a href="#" class="UploadMaterial">材料上传</a>
                </li>
            </ul>
            <ul class="nav nav-stacked nav-pills" id="LeftAlerts">
                <li>
                    <a href="#" class="CommonFile">常用文件</a>
                </li>
                <li class="#">
                    <a href="#" class="Notification"><span class="badge pull-right">3</span>查看通知</a>
                </li>
            </ul>
        </div>
        <div class="col-md-8">
            <div class="MidPersonalInformation">
                <table class="table table-bordered">
                    <caption><h2>个人信息</h2></caption>
                    <tbody>
                    <tr>
                        <th>姓名</th>
                        <td>
                            <c:set target="${student}" property="studentname" value="李金桥"></c:set>
                            <c:out value="${student.studentname}"></c:out>
                        </td>
                        <th>性别</th>
                        <td>
                            <c:set target="${student}" property="sex" value="男"></c:set>
                            <c:out value="${student.sex}"></c:out>
                        </td>
                    </tr>
                    <tr>
                        <th>学号</th>
                        <td>
                            <c:set target="${student}" property="studentnumber" value="1506010518"></c:set>
                            <c:out value="${student.studentnumber}"></c:out>
                        </td>
                        <th>年级专业班级</th>
                        <td>暂无</td>
                    </tr>
                    <tr>
                        <th>政治面貌</th>
                        <td>
                            <c:set target="${student}" property="state" value="党员"></c:set>
                            <c:out value="${student.state}"></c:out>
                        </td>
                        <th>邮箱</th>
                        <td>
                            <c:set target="${student}" property="email" value="lijinqiao@hhu.com"></c:set>
                            <c:out value="${student.email}"></c:out>
                        </td>
                    </tr>
                    <tr>
                        <th>绩点</th>
                        <td>
                            <c:set target="${gradetable}" property="grade" value="3.0"></c:set>
                            <c:out value="${gradetable.grade}"></c:out>
                        </td>
                        <th>排名</th>
                        <td>暂无此数据</td>
                    </tr>
                    <tr>
                        <th>四级</th>
                        <td>
                            <c:set target="${gradetable}" property="cet4grade" value="424"></c:set>
                            <c:out value="${gradetable.cet4grade}"></c:out>
                        </td>
                        <th>六级</th>
                        <td>
                            <c:set target="${gradetable}" property="cet6grade" value="666"></c:set>
                            <c:out value="${gradetable.cet6grade}"></c:out>
                        </td>
                    </tr>
                    <tr>
                        <th>计算机等级考试</th>
                        <td>暂无此数据</td>
                    </tr>
                    <tr>
                        <th>社会工作</th>
                        <td>暂无此数据</td>
                    </tr>
                    <tr>
                        <th>获得奖项</th>
                        <td>暂无此数据</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="MidPartyInformation">
                <table class="table table-bordered">
                    <caption><h2>党籍信息</h2></caption>
                    <tbody>
                    <tr>
                        <th>时间</th>
                        <th>事件</th>
                    </tr>
                    <tr>
                        <td>
                            <c:set target="${student}" property="indirectingtime" value="2017"></c:set>
                            <c:out value="${student.indirectingtime}"></c:out>
                        </td>
                        <td>推优时间</td>
                    </tr>
                    <tr>
                        <td>
                            <c:set target="${student}" property="activisttime" value="2017"></c:set>
                            <c:out value="${student.activisttime}"></c:out>
                        </td>
                        <td>积极分子时间</td>
                    </tr>
                    <tr>
                        <td>
                            <c:set target="${student}" property="developementtime" value="2017"></c:set>
                            <c:out value="${student.developementtime}"></c:out>
                        </td>
                        <td>发展党员时间</td>
                    </tr>
                    <tr>
                        <td>
                            <c:set target="${student}" property="probationarytime" value="2017"></c:set>
                            <c:out value="${student.probationarytime}"></c:out>
                        </td>
                        <td>预备党员时间</td>
                    </tr>
                    <tr>
                        <td>
                            <c:set target="${student}" property="fullmembertime" value="2017"></c:set>
                            <c:out value="${student.fullmembertime}"></c:out>
                        </td>
                        <td>正式党员时间</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="MidRewardsAndPunishments">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h2 class="panel-title">
                            奖励
                        </h2>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered">
                            <tbody>
                            <tr>
                                <th>时间</th>
                                <th>称号</th>
                            </tr>
                            <tr>
                                <td>无数据</td>
                                <td>无数据</td>
                            </tr>
                            <tr>
                                <td>无数据</td>
                                <td>无数据</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h2 class="panel-title">
                            惩罚
                        </h2>
                    </div>
                    <div class="panel-body">
                        无数据
                    </div>
                </div>
            </div>
            <div class="MidUploadedMaterial">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h2 class="panel-title">
                            已上传材料
                        </h2>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered">
                            <tbody>
                            <tr>
                                <th>材料名称</th>
                                <th>查看材料</th>
                                <th>材料类别</th>
                                <th>材料状态</th>
                            </tr>

                            <tr>
                                <td><c:set target="${material}" property="materialname" value="优秀党员证明材料"></c:set>
                                    <c:out value="${material.materialname}"></c:out></td>
                                <td><c:set target="${material}" property="materialurl" value="www.baidu.com"></c:set>
                                    <a href="#">
                                        <c:out value="${material.materialurl}"></c:out>
                                    </a>
                                </td>
                                <td>暂无此数据</td>
                                <td><c:set target="${material}" property="state" value="审核中"></c:set>
                                    <c:out value="${material.state}"></c:out></td>
                                </td>
                            </tr>
                            <tr>
                            <tr>
                                <td><c:set target="${material}" property="materialname" value="社会工作证明材料"></c:set>
                                    <c:out value="${material.materialname}"></c:out></td>
                                <td><c:set target="${material}" property="materialurl" value="www.baidu.com"></c:set>
                                    <a href="#">
                                        <c:out value="${material.materialurl}"></c:out>
                                    </a>
                                </td>
                                <td>暂无此数据</td>
                                <td><c:set target="${material}" property="state" value="已通过"></c:set>
                                    <c:out value="${material.state}"></c:out></td>
                                </td>
                            </tr>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="MidUploadMaterial">
                <form role="form" action="${pageContext.request.contextPath }/student/login.action" method="post">
                    <div class="form-group">
                        <label for="name">材料名称</label>
                        <input type="text" class="form-control col-sm-8" id="name"
                               placeholder="请输入名称" name="materialname">
                    </div>
                    <div class="row" style="margin-top: 6%">
                        <div class="form-group col-sm-3" style="">

                            <label for="choosefile">选择分类</label>
                            <div style="width: 70%">
                                <select class="form-control selectChoice" id="department" >
                                    <option value="0">思想汇报</option>
                                    <option value="1">四级成绩</option>
                                    <option value="2">六级成绩</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group col-sm-5" >

                            <label for="inputfile">上传文件</label>

                            <div class="fileupload fileupload-new" data-provides="fileupload">
                                <span class="btn btn-file btn-default">
                                    <span class="fileupload-new">选择文件</span>
                                    <span class="fileupload-exists">更换文件</span>
                                    <input type="file" id="inputfile">
                                </span>
                                <span class="fileupload-preview"></span>
                                <a href="#" class="close fileupload-exists" data-dismiss="fileupload"
                                   style="float: none">×</a>
                            </div>
                        </div>
                    </div>

                    <div class="form-group ">
                        <button type="submit" class="btn btn-info">提交</button>
                    </div>

                </form>
            </div>
            <div class="MidCommonFile">
                <div class="col-md-12">
                    <a href="#" class="list-group-item ">
                        入党申请表格
                    </a>
                    <a href="#" class="list-group-item">积极分子申请表</a>
                    <a href="#" class="list-group-item">十九大开幕式总结</a>
                    <a href="#" class="list-group-item"></a>
                    <a href="#" class="list-group-item"></a>
                </div>
            </div>
            <div class="MidNotification">
                <div class="col-md-12">

                    <table class="table table-bordered">
                        <tbody>
                        <tr>
                            <th>标题</th>
                            <th>内容</th>
                            <th>时间</th>
                            <th>状态</th>
                        </tr>
                        <tr>
                            <td><c:set target="${massage}" property="newstitle" value="十九大报告"></c:set>
                                <c:out value="${massage.newstitle}"></c:out>
                            </td>
                            <td><c:set target="${massage}" property="newscontent" value="十九大报告分析"></c:set>
                                <a href="#"><c:out value="${massage.newscontent}"></c:out></a>
                            </td>
                            <td><c:set target="${massage}" property="newstime" value="2017.09.03"></c:set>
                                <c:out value="${massage.newstime}"></c:out>
                            </td>
                            <td><c:set target="${massage}" property="newstate" value="已读"></c:set>
                                <c:out value="${massage.newstate}"></c:out>
                            </td>
                        </tr>
                        <tr>
                        <tr>
                            <td><c:set target="${massage}" property="newstitle" value="党员培训通知"></c:set>
                                <c:out value="${massage.newstitle}"></c:out>
                            </td>
                            <td><c:set target="${massage}" property="newscontent" value="www.baidu.com"></c:set>
                                <a href="#"><c:out value="${massage.newscontent}"></c:out></a>
                            </td>
                            <td><c:set target="${massage}" property="newstime" value="2017.10.10"></c:set>
                                <c:out value="${massage.newstime}"></c:out>
                            </td>
                            <td><c:set target="${massage}" property="newstate" value="未读"></c:set>
                                <c:out value="${massage.newstate}"></c:out>
                            </td>
                        </tr>
                        </tr>

                        </tbody>
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
    <script src="assets/js/jquery-2.1.1.js"></script>
    <script src="assets/js/student.js"></script>
    <script src="assets/js/bootstrap.js"></script>
</div><!-- #footer -->

</body>
</html>
