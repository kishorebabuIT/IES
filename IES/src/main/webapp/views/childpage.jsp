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

	<h2 align="center" style="color: red">CHILD PLAN REGISTRATION</h2>
     <form:form action="handlechildplan" method="POST"
		modelAttribute="childaccount">
		<h2><font align="center" color='red'>${failure}</font></h2>
		<h3 align="center"><font  color='green'>${sucess}</font></h3>
		<table align="center" border="10" style="background-color: cyan">

			<tr>
				<td style="color: blue">Case Id :</td>
				<td><form:input path="caseId" /></td>
			</tr>
			<tr>
				<td style="color: blue">Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td style="color: blue">Child Name :</td>
				<td><form:input path="childName" /></td>
			</tr>
			<tr>
				<td style="color: blue">Child DOB :</td>
				<td><form:input path="childDob" /></td>
			</tr>
			<tr>
				<td style="color: blue">Gender :</td>
				<td><form:radiobutton path="gender" value="M" />Male 
				<form:radiobutton path="gender" value="F" />Fe-Male</td>
			</tr>
			<tr>
				<td style="color: blue">Child SSN No :</td>
				<td><form:input path="childSsnNo" /></td>
			</tr>
			

			<tr>
				<td align="center"><input align="center" style="color: red"
					type="submit" align="center" value="ADD" /></td>
			</tr>


		</table>
	</form:form>
	
	 
</body>
</html>