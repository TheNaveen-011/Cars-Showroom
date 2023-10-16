<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
div {
	size: 300px;
}

form {
	background: gray;
}

p {
	color: green;
	font-size: 50px;
	background: red;
}
</style>
</head>
<body>
	<div align="center">
		<p>Welcome to BEST CHOICE showroom</p>
		<hr>

		<form action="showByBrand" method="get">

			<h1>Choose a car ByBrand</h1>

			<select>
				<option>--None--</option>
				<option value="Mahindra">Mahindra</option>
				<option value="TATA">TATA</option>
			</select> <br> <br> <input type="submit" value="Enter">

		</form>
	</div>
</body>
</html>