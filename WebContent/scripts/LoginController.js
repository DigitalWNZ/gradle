"use strict";
app.controller("LoginController", function($scope, $rootScope,$http,$cookies, $state,$location){
	$scope.title=""
		
	$scope.display = function() {
		$http({
			method:"GET",
			url: $cookies.get("url")+"/textservice"
		}).success(function(data){
			$scope.title = data.text;
		});
	}

	$scope.getPath=function(){
		var pathName = document.location.href;
		var index = pathName.substr(1).indexOf("#");
		var result = pathName.substr(0,index);
		$cookies.put("url", result);
	}	
	
	$scope.getPath();
	$scope.display();
});