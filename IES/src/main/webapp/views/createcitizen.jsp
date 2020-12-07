<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow">

	<h2 align="center" style="color: red">APPLICATION REGISTRATION</h2>
     <form:form action="handlecitizen" method="POST"
		modelAttribute="citizen">
		<h2><font align="center" color='red'>${failure}</font></h2>
		<h3 align="center"><font  color='green'>${sucess}</font></h3>
		<table align="center" border="10" style="background-color: cyan">

			<tr>
				<td style="color: blue">First Name :</td>
				<td><form:input path="firstName" /></td>
				<form:hidden path="appNo"/>
				

			</tr>
			<tr>
				<td style="color: blue">Last Name :</td>
				<td><form:input path="lastName" /></td>
			</tr>
			
			<tr>
				<td style="color: blue">DateOfBirth :</td>
				<td><form:input path="dob" /></td>
			</tr>

			<tr>
				<td style="color: blue">Gender :</td>
				<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
						path="gender" value="F" />Fe-Male</td>
			</tr>
			<tr>
				<td style="color: blue">SSN No :</td>
				<td><form:input path="ssnNo" /></td>
			</tr>
			<tr>
				<td style="color: blue">Contact Number :</td>
				<td><form:input path="mobNo" /></td>
			</tr>
			<tr>
				<td style="color: blue">Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			
            <tr>
				<td align="center"><input align="center" style="color: red"
					type="submit" align="center" value="Register" /></td>
			</tr>
       </table>
	</form:form>
   <h3 align="center" style="color: red"><a href="viewCitizens">VIEW CITIZEN ACCOUNTS</a></h3>
</body>
</html>