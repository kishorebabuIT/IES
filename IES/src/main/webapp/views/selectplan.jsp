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

	<h2 align="center" style="color: red">SELECT PLAN REGISTRATION</h2>
     <form:form action="handleplan" method="POST"
		modelAttribute="citizenplan">
		<

		<table align="center" border="10" style="background-color: cyan">

			<tr>
				<td style="color: blue">Case Id :</td>
				<td><form:input path="caseId" /></td>
			</tr>
			<tr>
				<td style="color: blue">First Name :</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td style="color: blue">Last Name :</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td style="color: blue">Select Plan :</td>
				<td><form:select name="Select" path="selectPlan">
						<form:option value="">->Select<-</form:option>
						<form:option value="Caseworker">SNAP</form:option>
						<form:option value="Admin">CCAP</form:option>
					</form:select></td>
			</tr>

			<tr>
				<td align="center"><input align="center" style="color: red"
					type="submit" align="center" value="Next" /></td>
			</tr>


		</table>
	</form:form>
</body>
</html>