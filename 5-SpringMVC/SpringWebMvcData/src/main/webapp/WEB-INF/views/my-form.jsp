<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Page</title>
</head>
<body>

	<h2>My Form</h2>
	<form action="submitForm" method="POST">
		Name : <input type="text" name="name" placeholder="Enter Name"/> <br/> <br/>
		Email : <input type="text" name="email" placeholder="Enter Email"/> <br/> <br/>
		Phone : <input type="text" name="phone" placeholder="Enter Phone"/> <br/> <br/>
		
		<input type="submit" Value="Submit Form"/>
	</form>
	
</body>
</html>