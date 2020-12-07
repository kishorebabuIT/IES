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


   <h2>Create Case</h2>
    <form:form action="handleAccount" method="POST" modelAttribute="caseAccount">
      <table>
          <tr>
             <td>App Id :</td>
             <td><form:input path="appId"/></td>
            </tr>
           <tr>
             <td>Case Name :</td>
             <td><form:input path="caseName"/></td>
           </tr>
           <tr>
             <td>DOB :</td>
             <td><form:input path="dob"/></td>
           </tr>
            <tr>
             <td>Gneder :</td>
             <td><form:input path="gender"/></td>
            </tr>
           <tr>
             <td>SSNNo :</td>
             <td><form:input path="ssnNo"/></td>
           </tr>
           <tr>
             <td>Contact Number :</td>
             <td><form:input path="mobNo"/></td>
           </tr>
           
           <tr>
             <td><input type="submit"  value="Create"/></td>
             </tr>
      </table>
   
    </form:form>
  
</body>
</html>