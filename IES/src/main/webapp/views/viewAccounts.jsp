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
	<h1 align="center" style="color: red">VIEW ACCOUNTS</h1>
	<h3 align="center" style="color: blue">
		<a href="welcomepage">ADD NEW ACCOUNT</a>
	</h3>
	<h3 align="right"><form style="color: red" action = "#">
     Search : <input  type="text" length="5">
    </form></h3>
    
    <h3 align="left"><form style="color: red" action="#">
    Select Role : <select>
                 <option value="">-Select-</option>
                 <option>CaseWorker</option>
                 <option>Admin</option>
                 </select>
     </form></h3>
     <table align="center" border="5" style="background-color: cyan">
		<tr>
			<th style="color: red">First_Name</th>
			<th style="color: red">Last_Name</th>
			<th style="color: red">Email</th>
			<th style="color: red">Password</th>
			<th style="color: red">DOB</th>
			<th style="color: red">Gender</th>
			<th style="color: red">Number</th>
			<th style="color: red">SSN_No</th>
			<th style="color: red">Role</th>
			<th style="color: red">Action</th>
		</tr>

		<c:forEach items="${accounts}" var="account">

			<tr>
				<td>${account.firstName}</td>
				<td>${account.lastName}</td>
				<td>${account.email}</td>
				<td>${account.password}</td>
				<td>${account.dob}</td>
				<td>${account.gender}</td>
				<td>${account.mobNo}</td>
				<td>${account.ssnNo}</td>
				<td>${account.role}</td>
				<td><a style="color: blue"
					href="editAccount?accId=${account.accId}">EDIT</a> <a
					style="color: red" href="deleteAccount?accId=${account.accId}"
					onclick="myFunction()">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>