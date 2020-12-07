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

	<h2 align="center" style="color: red">PLAN REGISTRATION</h2>
     <form:form action="handleplan" method="POST"
		modelAttribute="planAccount">
		<h2><font align="center" color='red'>${failure}</font></h2>
		<h3 align="center"><font  color='green'>${sucess}</font></h3>
		<table align="center" border="10" style="background-color: cyan">

			<tr>
				<td style="color: blue">Plan Name :</td>
				<td><form:input path="planName" /></td>
				<form:hidden path="planId"/>
			</tr>
			<tr>
				<td style="color: blue">Plan Desc :</td>
				<td><form:input path="planDesc" /></td>
			</tr>
			<tr>
				<td style="color: blue">StartDate :</td>
				<td><form:input path="planStartDate" /></td>
			</tr>
			<tr>
				<td style="color: blue">EndDate :</td>
				<td><form:input path="planEndDate" /></td>
			</tr>
			

			<tr>
				<td align="center"><input align="center" style="color: red"
					type="submit" align="center" value="Register" /></td>
			</tr>


		</table>
	</form:form>
	<h3 align="center" style="color: red"><a href="getplans">VIEW PLANS</a></h3>
	 
</body>
</html>