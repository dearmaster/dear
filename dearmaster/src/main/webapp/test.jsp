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
<body>

    <div ng-app="myApp" ng-controller="myCtrl">

        名: <input type="text" ng-model="firstName"><br>
        姓: <input type="text" ng-model="lastName"><br>
        <br>
        姓名: {{firstName + " " + lastName}}

    </div>

    <script src="<%= ctx%>/js/angular.js"></script>
    <script src="<%= ctx%>/js/angular-route.js"></script>
    <script src="<%= ctx%>/js/jquery-2.1.1.js"></script>
    <script src="<%= ctx%>/js/bootstrap.js"></script>

    <script>
        var app = angular.module('myApp', []);
        app.controller('myCtrl', function($scope, $http) {
            $scope.firstName = "John";
            $scope.lastName = "Doe";

            var actionUrl = 'mvc/user/load';

            $http.get(actionUrl)
                    .then(function(response) {
                        console.log('111111');
                        if(response.data!=null && response.data.length > 0) {
                            $scope.hasModels = true;
                            console.log('$scope.hasModels = true');
                            $scope.clients = response.data;
                        }
                    });

        });
    </script>
</body>
</html>
