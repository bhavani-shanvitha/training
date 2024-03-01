<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All employees page</title>
</head>
<body>
<h1>All employees</h1>
<hr>
	<table border="4" cellpadding="10">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Email</th>
	<th>Phone</th>
	<th>Password</th>
	<th>Salary</th>
	<th>Delete</th>
	<th>Update</th>
	</tr>
	
	<c:forEach var="emp" items="${employees }"  >
		<tr>
		<td>${emp.getId() }</td>
		<td>${emp.getName() }</td>
		<td>${emp.getEmail() }</td>
		<td>${emp.getPhone() }</td>
		<td>${emp.getPassword()}</td>
		<td>${emp.getSal() }</td>
		
		<td><a href="delete?id=${emp.getId() }"><button type="button">Delete</button></a></td>
		<td><a href="update?id=${emp.getId() }"><button type="button">Update</button></a></td>
		</tr>
	</c:forEach>
	</table>
	<h4>
	<a href="index.jsp"><button type="button">Back</button></a>
	</h4>
</body>
</html>