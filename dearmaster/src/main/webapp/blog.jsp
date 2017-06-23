<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%= ctx%>/css/bootstrap.css">
    <%--<link rel="stylesheet" href="<%= ctx%>/css/main.css">--%>
</head>
<body ng-app="RouteConfigApp">

    <div>
        <div id="nav">
            <ul class="nav nav-pills">
                <li><a href="#/">首页</a></li>
                <li><a href="#/blog/load">博客</a></li>
                <li><a href="#/transaction">交易管理</a></li>
                <li><a href="#/report">报表管理</a></li>
                <li><a href="#/other">其他</a></li>
            </ul>
        </div>
        <div class="panel panel-primary" id="main-container">
            <div class="panel-heading" data-toggle="collapse" href="#content">
                <%--<h3 class="panel-title">所有用户</h3>--%>
            </div>
            <div class="panel-body panel-collapse collapse in" id="content">
                <div ng-view></div>
            </div>
        </div>
    </div>

    <script src="<%= ctx%>/js/angular.js"></script>
    <script src="<%= ctx%>/js/angular-route.js"></script>
    <script src="<%= ctx%>/js/RouteConfigApp.js"></script>
    <script src="<%= ctx%>/js/jquery-2.1.1.js"></script>
    <script src="<%= ctx%>/js/bootstrap.js"></script>
    <script src="<%= ctx%>/controller/BlogController.js"></script>

</body>
</html>
