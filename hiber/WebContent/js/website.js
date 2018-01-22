angular.module('website', ['ngRoute']).
    config(function ($routeProvider) {
        $routeProvider.
            when('/about', {templateUrl: 'partials/about.html'}).
            when('/ourVision', {templateUrl: 'partials/ourVision.html'}).
            when('/administration', {templateUrl: 'partials/administration.html'}).
            when('/gallery', {templateUrl: 'partials/gallery.html'}).
            when('/gphotos', {templateUrl: 'partials/gphotos.html'}).
            when('/gvideo', {templateUrl: 'partials/gvideo.html'}).
            when('/gmedia', {templateUrl: 'partials/gmedia.html'}).
            when('/gpress', {templateUrl: 'partials/gpress.html'}).
            when('/studentCorner', {templateUrl: 'partials/studentCorner.html'}).
            when('/contact', {templateUrl: 'partials/contact.html'}).
            when('/home', {templateUrl: 'partials/home.html', controller: 'HomeCtrl'}).
            when('/register', {templateUrl: 'partials/register.html', controller: 'regiCtrl'}).
            when('/regiSucess', {templateUrl: 'partials/regiSucess.html',controller: 'regiCtrlS'}).
            when('/regiFail', {templateUrl: 'partials/regiFail.html',controller: 'regiCtrlF'}).
            when('/guidance', {templateUrl: 'partials/guidance.html'}).
            otherwise({redirectTo: '/home'});
        
       
    })
   
    .controller('HomeCtrl', function ($scope) {
    	
        $scope.title = 'Home Page';
        $scope.body = 'This is the about home body';
        $scope.gallerybottom = true;
        $scope.logobottom = true;
        console.log("in home");
     
        $scope.myIndex = 0;
        carousel();
        
    })
    
    .controller('regiCtrl', function ($scope,$http,$location) {
        $scope.title = 'Registration';
        console.log("in regi");
        $scope.gallerybottom = false;
        $scope.logobottom = false;
        
        $scope.mobl_nm_p = /^\+?\d{10}$/;
        $scope.email_adr_p = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/;
        
       $scope.submit = function() {
            $scope.postdata = function (firstName, lastName, gender,email_adr,mobl_nm,
            		occupation,colg_nm,colg_join_year,adr_ln1,adr_ln2,district,state,univ_nm) {
            	var data = {
            			firstName: $scope.student.firstName,
            			lastName: $scope.student.lastName,
            			gender: $scope.student.gender,
            			email_adr: $scope.student.email_adr,
            			mobl_nm: $scope.student.mobl_nm,
            			occupation: $scope.student.occupation,
            			colg_nm: $scope.student.colg_nm,
            			colg_join_year: $scope.student.colg_join_year,
            			adr_ln1: $scope.student.adr_ln1,
            			adr_ln2: $scope.student.adr_ln2,
            			district: $scope.student.district,
            			state: $scope.student.state,
            			univ_nm: $scope.student.univ_nm
            			
            	};
            	var config= {
            			headers: {"Content-Type": "application/json"} 
            	}

            	//Call the services
            	$http.post('http://54.200.164.87:8080/hiber/register', JSON.stringify(data),config).then(function (response) {
            		if (response.data){
            			alert(response);
            			$scope.msg = "Post Data Submitted Successfully!";
            			$location.path("/regiSucess");
            			/*$window.location.host+ "/regiSucess";*/
            			
/*            			var url = "http://" + $window.location.host + "/regiSucess";
            	        console.log(url);
            	        $window.location.href = url;
*/            	        
            			
            		}

            	}, function (response) {
            		alert(response);
            		$scope.msg = "Service not Exists";
            		$location.path("/regiFail");
            		$scope.statusval = response.status;
            		$scope.statustext = response.statusText;
            		$scope.headers = response.headers();

            	});

            };
            $scope.postdata();

        };   
        })
        .controller('regiCtrlS', function ($scope) {
    	
        /*$scope.title = 'Home Page';
        $scope.body = 'This is the about home body';
        $scope.gallerybottom = false;
        $scope.logobottom = true;
       console.log("in home");
     
        $scope.myIndex = 0;
        carousel();*/
        
    })
        .controller('regiCtrlF', function ($scope) {
    	
        /*$scope.title = 'Home Page';
        $scope.body = 'This is the about home body';
        $scope.gallerybottom = false;
        $scope.logobottom = true;
       console.log("in home");
     
        $scope.myIndex = 0;
        carousel();*/
        
    })
   
     .directive('gotop', function(){
        var linker = function (scope, element, attrs) {
            element.on('click', function(){
                scope.goTop();
            })
        };

        var controller =  function($scope){
            $scope.goTop = function() {
                $scope.$apply(function(){
                    //
                	document.body.scrollTop = 0;
                    document.documentElement.scrollTop = 0;
                });
            };
        };

        return {
            scope: true,
            restrict: 'EA',
            /*template: '',*/
            link: linker,
            controller: controller
        }
    });

myIndex =0; 
function carousel() {
	
    var i;
    var x = document.getElementsByClassName("mySlides");
    if(x == undefined){		
		return;
	}
    if(myIndex == undefined){		
		return;
	}
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 10000); // Change image every 10 seconds
}

/*//goto top
window.onscroll = function() {scrollFunction()};*/

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("myBtn").style.display = "block";
    } else {
        document.getElementById("myBtn").style.display = "none";
    }
}
