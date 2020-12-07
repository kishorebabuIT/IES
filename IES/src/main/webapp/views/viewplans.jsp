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
		confirm("Are You Sure To Delete Plan Account!");
	}
</script>
</head>
<body style="background-color: green">
	<h1 align="center" style="color: red">VIEW PLANS</h1>
	<h3 align="center" style="color: blue">
		<a href="planpage">ADD NEW PLAN</a>
	</h3>
	
     <table align="center" border="5" style="background-color: cyan">
		<tr>
		    <th style="color: red">Plan_ID</th>
			<th style="color: red">Plan_Name</th>
			<th style="color: red">Plan_Desc</th>
			<th style="color: red">StartDate</th>
			<th style="color: red">EndDate</th>
			<th style="color: red">Action</th>
		</tr>

		<c:forEach items="${plans}" var="plan">

			<tr>
			    <td>${plan.planId}</td>
				<td>${plan.planName}</td>
				<td>${plan.planDesc}</td>
				<td>${plan.planStartDate}</td>
				<td>${plan.planEndDate}</td>
			    <td><a style="color: blue" href="editPlan?planId=${plan.planId}">EDIT</a> 
					<a style="color: red" href="#">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>