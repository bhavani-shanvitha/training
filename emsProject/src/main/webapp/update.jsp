<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update page</title>
</head>
<body>
<!--  <h1>update details</h1>
<h2>${employee.getName() }</h2>
<h2>${employee.getEmail() }</h2>
<h2>${employee.getPhone() }</h2>
<h2>${employee.getPassword() }</h2>
<h2>${employee.getSal() }</h2>-->
<h2>update employee</h2>
	
	<form action="updateemp">
	<input value="${employee.getId() }" type="text" name="id" readonly="readonly">
	Name:<input  value=" ${employee.getName() }" type="text" name="name" placeholder="enter name"><br><br>
	Email:<input value=" ${employee.getEmail() }" type="text" name="email" placeholder="enter Email"><br><br>
	Phone:<input  value=" ${employee.getPhone() }" type="text" name="phone" placeholder="enter Phone"><br><br>
	Password:<input value=" ${employee.getPassword() }" type="text" name="password" placeholder="enter Password"><br><br>
	Salary:<input  value=" ${employee.getSal() }" type="text" name="sal" placeholder="enterSalary"><br><br>
	<button type="submit">update employee</button>
	</form>
	<br><br>
	<a href="index.jsp"><button type="button">Back</button></a>
	
	
	
	

</body>
</html>