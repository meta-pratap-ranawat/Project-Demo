var topbarApp = angular.module('topbarApp', ['dataFactory', 'dataShareFactory']);

window.addEventListener('storage', function(event) {

	console.log('storage event', event);

	if (event.key == 'getSessionStorage') {
		// Some tab asked for the sessionStorage -> send it

		localStorage.setItem('sessionStorage', JSON.stringify(sessionStorage));
		

	} else if (event.key == 'sessionStorage' && !sessionStorage.length) {
		// sessionStorage is empty -> fill it

		var data = JSON.parse(event.newValue),
					value;

		for (key in data) {
			sessionStorage.setItem(key, data[key]);
		}
	}
});

topbarApp.controller('topbarCtrl', function($scope, $window, userDetails, utilityFunctions) {
    $scope.currentUser = userDetails.getCurrentUser();
    $scope.signOut = function() {
		console.log("Called");
		utilityFunctions.performSignOut();
	}
});
