<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<%
		String myname = (String) request.getAttribute("name_key");
		if(myname == null) myname = "Guest";
	%>
	
		<h3>Welcome : <%= myname %></h3>

</body>
</html>