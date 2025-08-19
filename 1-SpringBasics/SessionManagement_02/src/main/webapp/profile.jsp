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
		String myname = (String) session.getAttribute("key_name"); //3
	%>
	
	<h3>Welcome <%= myname %></h3> <br/> <br/>
	
	<a href="home.jsp">Home</a> &nbsp; &nbsp; 
	<a href="about-us.jsp">About Us</a> &nbsp; &nbsp; 
	<a href="logout">Logout</a>
	
	
</body>
</html>