<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<!--  Header Section -->
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
	<!--  Content Section -->
	<div class="jumbotron">
		<div class="container">
			<div id="context_container">
				<h1>About</h1>
				<br>
				<p>This web application shows my five favourite locations in
					Google Map.</p>
				<p>Just hover on red marker to know about each location, so you
					will get the hint.</p>
				<br>
				<p>
					<a class="btn btn-lg btn-primary"
						href="${pageContext.request.contextPath}/map/showMap"
						role="button">Go to Map &raquo;</a>
				</p>
			</div>
			<div id="img_container">
				<img
					src="${pageContext.request.contextPath}/resources/img/image.png" />
			</div>
		</div>
	</div>
	<footer id="site_footer">
		<p>
			&copy;<a href="mailto:suba.11@cse.mrt.ac.lk"> Sudharma Subasinghe</a>,Spring
			MVC-My Map,2018
		</p>
	</footer>
</body>
</html>

