<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="justSave" method="post">
	<tr>
	<td>PgtNum</td>
	<td> <input name="pgt" type="text" maxlength="10" value="heloo" onchange='isInteger(this.value.pgt)'> </td>
	
	</tr>
	<input type="submit" value="Enter">
</form>
<script type="text/javascript">


function isInteger(form) {
	i=0;
	do{
	if(form.value.charAt(i) >= 0 && form.value.charAt(i) <= 9 ){
		
	}else{
		alert("Enter a Number")
		value = "";
		return false;
	}
	i++;
	}while (i < form.value.length) 
		return true;
	
	
}

</script>

</body>
</html>