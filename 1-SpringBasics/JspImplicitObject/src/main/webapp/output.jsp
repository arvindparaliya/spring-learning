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
		String myname = request.getParameter("name1");
		out.println(myname);
	%>
	<%
		String cname = (String) session.getAttribute("session_name");
		out.println("cname");
	
	%>
</body>
</html>