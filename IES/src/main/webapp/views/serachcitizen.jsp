<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: blue">

	
	<h2>Citizen Create Case</h2>

         <form action="getCitizen" method="post">

		<table>
			<tr>
				<td>AppNo:</td>
				<td><input type="text" name="appNo" /></td>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>

		</table>
	</form>
	
</body>
</html>