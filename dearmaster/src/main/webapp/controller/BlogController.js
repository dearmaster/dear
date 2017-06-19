RouteConfigApp.controller('BlogController', function ($scope, $http) {

    var actionUrl = 'mvc/blogCategory/load';

    $http.get(actionUrl)
        .then(function(response) {
            if(response.data!=null && response.data.length > 0) {
                $scope.hasModels = true;
                $scope.clients = response.data;
            }
        });
});