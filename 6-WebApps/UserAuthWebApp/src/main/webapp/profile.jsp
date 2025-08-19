<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="in.sp.model.User" %>  <%-- ✅ Import User class --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

	<%
		User user = (User) session.getAttribute("session_user");
		if(user == null){
			response.sendRedirect("login.html");
			return;
		}
	%>

	<h2 style='color:green'>Welcome</h2>

	<div style='color:blue'>Name : <%= user.getName() %></div> 
	<div style='color:blue'>Email : <%= user.getEmail() %></div> 
	<div style='color:blue'>City : <%= user.getCity() %></div><br>

	<a href="logout" style='color:black'>Logout</a>

</body>
</html>
