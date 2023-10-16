<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
label {
	color: aqua;
}
</style>
</head>
<body>
	<h1 align="center">Fill DETAILS</h1>
	<hr>
	<div align="center">
		<form:form action="saveData" method="POST" modelAttribute="modelAtt">
			<label>Enter Brand</label>
			<form:input path="brand" />

			<br>
			<br>
			<label>Enter Fuel Type:</label>
			<form:radiobutton path="fuel" value="Petrol" />Petrol
			<form:radiobutton path="fuel" value="Diesel" />Diesel
			<form:radiobutton path="fuel" value="Electrial" />Electrial
		<br>
			<br>
			<label>Enter Model</label>
			<form:input path="model" />
			<br>
			<br>

			<label>No of KM</label>
			<form:input path="noofKM" type="number" />
			<br>
			<br>
			<label>Enter Price</label>
			<form:input path="price" type="number" />
			<br>
			<br>
			<label>Enter Year</label>
			<form:input type="number" path="year" />
			<br>
			<br>
			<input type="submit" value="Enter">

		</form:form>

	</div>
</body>
</html>