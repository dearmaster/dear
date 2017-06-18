<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = request.getContextPath();
%>
<html>

<head>
    <title>dearmaster</title>
    <link rel="stylesheet" href="<%= ctx%>/css/bootstrap.css">
    <link rel="stylesheet" href="<%= ctx%>/css/ash.css">
</head>

<body ng-app="RouteConfigApp">

    <div id="frame-main-container">
        <div id="frame-banner">
            <div id="log-reg">
                <a href="#/user/login">登录</a>
                |
                <a href="#/user/register">注册</a>
            </div>
        </div>
        <div id="frame-nav">
            <ul class="nav nav-pills">
                <li><a href="#/">我的博客</a></li>
                <li><a href="#/resource-navigating">资源导航</a></li>
                <li><a href="#/utility">实用小工具</a></li>
                <li><a href="#/leave-a-message">留言板</a></li>
                <li><a href="#/about">关于</a></li>
            </ul>
        </div>
        <div id="frame-foot">
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
