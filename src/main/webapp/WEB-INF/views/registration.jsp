<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employee Registration Form</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Employee Form</h2>
 
	<form:form method="POST" modelAttribute="employee">
		
		<table>
			<tr>
				<td><label for="id">ID: </label> </td>
				<td><form:input path="id" id="id"/></td>
		    </tr>
			<tr>
				<td><label for="firstName">First Name: </label> </td>
				<td><form:input path="firstName" id="firstName"/></td>
		    </tr>
			<tr>
				<td><label for="lastName">Last Name: </label> </td>
				<td><form:input path="lastName" id="lastName"/></td>
		    </tr>
	    
			<tr>
				<td><label for="department">Department: </label> </td>
				<td><form:input path="department" id="department"/></td>
		    </tr>
                    
			<tr>
				<td><label for="holiday">Holiday: </label> </td>
				<td><form:input path="holiday" id="holiday"/></td>
		    </tr>

			<tr>
				<td><label for="conHoliday">Confirm Holiday: </label> </td>
				<td><form:input path="conHoliday" id="conHoliday"/></td>
		    </tr>

			<tr>
				<td><label for="salary">Salary: </label> </td>
				<td><form:input path="salary" id="salary"/></td>
		    </tr>                    
                    
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/list' />">List of All Employees</a>
	<a href="<c:url value='/logout' />">Logout</a>
</body>
</html>