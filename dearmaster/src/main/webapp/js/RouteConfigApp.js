if (typeof angular === 'undefined') {
    throw new Error('requires angular');
}

var routeConfig = function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'view/blog.html',
            controller: 'BlogController'
        })
        .when('/resource-navigating', {
            templateUrl: 'view/resource_navigating.html',
            controller: 'ResourceNavigatingController'
        })
        .when('/utility', {
            templateUrl: 'view/transaction.html',
            controller: 'UtilityController'
        })
        .when('/leave-a-message', {
            templateUrl: 'view/report.html',
            controller: 'LeaveAMessageController'
        })
        .when('/about', {
            templateUrl: 'view/transaction.html',
            controller: 'AboutController'
        })
        .when('/user/login', {
            templateUrl: 'view/login.html',
            controller: 'UserLoginController'
        })
        .when('/user/register', {
            templateUrl: 'view/register.html',
            controller: 'UserRegistrationController'
        })
        .otherwise({redirectTo: '/'});
};

var RouteConfigApp = angular.module('RouteConfigApp',['ngRoute'] ).config(routeConfig);