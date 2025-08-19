<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

	<h3>Welcome User</h3>
	
	<h4> Name  : ${user.getName()}</h4>
	<h4> Email : ${user.getEmail()}</h4>
	<h4> Phone : ${user.getPhone()}</h4>
	
	
<!--  	<h4> Name  : ${model_user.getName()}</h4>
	<h4> Email : ${model_user.getEmail()}</h4>
	<h4> Phone : ${model_user.getPhone()}</h4> -->
	
	
<!--  	<h4> Name  : ${model_name}</h4>
	<h4> Email : ${mode_email}</h4>
	<h4> Phone : ${model_phone}</h4> -->

</body>
</html>