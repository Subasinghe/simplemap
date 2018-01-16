// Function to load the map with markers for each location.
function loadMap(markerLat, markerLong, markerHint) {
	var marker, n, i, map;
	// Labels for each marker.
	var labels = 'ABCDE';
	var labelIndex = 0;
	
	// Define initial location which is centered and define it as the center of the map.
	var initloc = new google.maps.LatLng(6.60458741, 80.70968628);
	var mapOptions = {
		zoom : 10,
		center : initloc,
		mapTypeId : google.maps.MapTypeId.ROADMAP
	};

	// initialize the map
	var map = new google.maps.Map(document.getElementById("map_container"),
			mapOptions);

	// Loop for each location and load the marker for them.
	for (i = 0; i < markerLat.length; i++) {
		marker = new google.maps.Marker({
			position : new google.maps.LatLng(markerLat[i], markerLong[i]),
			map : map,
			label: labels[labelIndex++ % labels.length],
			title : markerHint[i]
		});
	}
}