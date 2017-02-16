var app = angular.module("ForJenkin", [ "ui.router","ngFileUpload" ,"ngCookies"]).config(
		function($stateProvider, $urlRouterProvider) {
			$stateProvider.state("login", {
				url : "/login",
				templateUrl : "login.html"
			})
			$urlRouterProvider.otherwise("/login");
		});