<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Profile </title>
</head>
<body>

	<% 
		String myname = request.getParameter("name1");
		out.println(myname);
	
		
		String s1 =(String) session.getAttribute("key_name");
		out.print(s1);
	%>

</body>
</html>