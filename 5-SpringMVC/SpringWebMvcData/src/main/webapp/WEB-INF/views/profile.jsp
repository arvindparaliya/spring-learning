<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
		<h2>Profile</h2>
		
		<h4>Name : ${user.getName()}</h4>
		<h4>Email : ${user.getEmail()}</h4>
		<h4>Phone No. : ${user.getPhone()}</h4> 
		
		<!--  <h4>Name : ${model_user.getName()}</h4>
		<h4>Email : ${model_user.getEmail()}</h4>
		<h4>Phone No. : ${model_user.getPhone()}</h4> -->
		
		<!--  <h4>Name : ${model_name}</h4>
		<h4>Email : ${model_email}</h4>
		<h4>Phone No. : ${model_phone}</h4> -->
</body>
</html>