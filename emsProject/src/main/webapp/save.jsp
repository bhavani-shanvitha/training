<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<titl>Save Employee page</title>
</head>
<body>
	<h2>save employee</h2>
	
	<form action="save" method="get">
	Name:<input type="text" name="name" placeholder="enter name"><br><br>
	Email:<input type="text" name="email" placeholder="enter Email"><br><br>
	Phone:<input type="text" name="phone" placeholder="enter Phone"><br><br>
	Password:<input type="text" name="password" placeholder="enter Password"><br><br>
	Salary:<input type="text" name="sal" placeholder="enterSalary"><br><br>
	<button type="submit">save employee</button>
	</form>
	<br><br>
	<a href="index.jsp"><button type="button">Back</button></a>
</body>
</html>