if (typeof angular === 'undefined') {
    throw new Error('requires angular');
}

var routeConfig = function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'view/home.html',
            controller: 'HomeController'
        })
        .when('/blog/load', {
            templateUrl: 'view/blog.html',
            controller: 'BlogController'
        })
        .otherwise({redirectTo: '/'});
};

var RouteConfigApp = angular.module('RouteConfigApp',['ngRoute'] ).config(routeConfig);