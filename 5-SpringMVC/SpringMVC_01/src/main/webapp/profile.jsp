<%@page import="in.ap.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

	<%
		User user = (User) session.getAttribute("session_user");
	%>

	<h3>Welcome</h3>
	
	<h4> Name : <%= user.getName() %> </h4>
	<h4> Email : <%= user.getEmail() %> </h4>
	<h4> City : <%= user.getCity() %> </h4>
	
	<a href="logout">Logout</a>
	

</body>
</html>