<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Simple Map</title>

<!-- Reference Bootstrap files -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<!--  Reference for Google Map API -->
<script type="text/javascript"
	src="http://maps.googleapis.com/maps/api/js?key=AIzaSyBgdnUeFym2Ny7zCUhdjgDCRIt99A9rins"></script>

<script src="<c:url value="/resources/js/map.js" />"></script>

<!-- To pass location list which comes from Model to the javascript function, it is
converted into javascript array in Server side -->
<script>
	var markerLat, markerLong, markerHint;
    markerLat = [
                 <c:forEach var="loc" items="${listLoc}">
                     <c:out value="${loc.latitude}"/>,
                 </c:forEach>
             ];
    markerLong = [
               <c:forEach var="loc" items="${listLoc}">
                   <c:out value="${loc.longitude}"/>,
               </c:forEach>
             ];
    markerHint = [
	        <c:forEach var="loc" items="${listLoc}">
	            "<c:out value="${loc.hint}"/>",
	        </c:forEach>
      		 ];
</script>
</head>
<body onload="loadMap(markerLat, markerLong, markerHint);">
	<div id="wrapper">
		<div id="header">
			<div class="navbar-header" id="header_context">
				<h1>
					<b>My Map - My Favourite Locations</b>
				</h1>
			</div>
			<div class="navbar-collapse collapse">
				<form:form action="${pageContext.request.contextPath}/logout"
					method="POST" class="navbar-form navbar-right">
					<div class="form-group">
						<input type="submit" value="Log out" class="btn btn-lg btn-info" />
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<div id="map_container"></div>
	<footer id="site_footer">
		<p>
			&copy;<a href="mailto:suba.11@cse.mrt.ac.lk"> Sudharma Subasinghe</a>,Spring
			MVC-My Map,2018
		</p>
	</footer>
</body>
</html>

