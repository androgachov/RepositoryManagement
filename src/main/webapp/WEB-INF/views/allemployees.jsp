<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employees List</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Employees</h2>	
	<table>
		<tr>
			<td>id</td><td>First Name</td><td>Last Name</td><td>Department</td>
                        <td>Holiday</td><td>ConHoliday</td><td>Salary</td>
                        <td></td><td></td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
			<td>${employee.id}</td>
			<td>${employee.firstName}</td>
			<td>${employee.lastName}</td>
			<td>${employee.department}</td>
                        <td>${employee.holiday}</td>
                        <td>${employee.conHoliday}</td>
                        <td>${employee.salary}</td>                        
			<td><a href="<c:url value='/edit-employee-${employee.id}' />">edit</a></td>
			<td><a href="<c:url value='/delete-employee-${employee.id}' />">delete</a></td>
                      
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/logout' />">Logout</a>
</body>
</html>