<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<%
		String myname = (String) session.getAttribute("key_name");
	%>
	
	<h3>Welcome <%= myname %></h3> <br/> <br/>
	
	<a href="index.html">Login</a> <br/>
	<a href="about-us.jsp">About Us</a>

</body>
</html>