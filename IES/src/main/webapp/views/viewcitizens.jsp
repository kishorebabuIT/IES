<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function myFunction() {
		confirm("Are You Sure To delete Account!");
	}
</script>
</head>
<body style="background-color: green">
	<h1 align="center" style="color: red">VIEW CITIZEN ACCOUNTS</h1>
	<h3 align="center" style="color: blue">
		<a href="citizenpage">ADD NEW CITIZEN</a>
	</h3>
	
     <table align="center" border="5" style="background-color: cyan">
		<tr>
		    <th style="color: red">Application_No</th>
			<th style="color: red">First_Name</th>
			<th style="color: red">Last_Name</th>
			<th style="color: red">Email</th>
		    <th style="color: red">DOB</th>
			<th style="color: red">Gender</th>
			<th style="color: red">Number</th>
			<th style="color: red">SSN_No</th>
			<th style="color: red">Action</th>
		</tr>

		<c:forEach items="${citizens}" var="citizenAccount">

			<tr>
			    <td>${citizenAccount.appNo}</td>
				<td>${citizenAccount.firstName}</td>
				<td>${citizenAccount.lastName}</td>
				<td>${citizenAccount.email}</td>
				<td>${citizenAccount.dob}</td>
				<td>${citizenAccount.gender}</td>
				<td>${citizenAccount.mobNo}</td>
				<td>${citizenAccount.ssnNo}</td>
				

				<td><a style="color: blue"
					href="editCitizen?appNo=${citizenAccount.appNo}">EDIT</a> <a
					style="color: red" href="deleteAccount?accId=${account.accId}"
					onclick="myFunction()">DEACTIVATE</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>