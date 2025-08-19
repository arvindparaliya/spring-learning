<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	
	<%
		String name ="Arjun Sharma";
		out.print(name); 
	%>
	
	<%
		session.setAttribute("key_name", "Ram Krushna");
	%>
	
	<form action="output.jsp" method="get">
		<input type="text" name="name1" placeholder="Enter Name"/>
		<input type="submit" value="Click Me"/>
	</form>

</body>
</html>