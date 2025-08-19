<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>

	<%!
		int a = 10;
		String name = "Ram";
		
		int area(){
			return a*a;
		}
	
	%>
	
	<%
		out.println(name);
		out.println(a);
		out.println(area());
		
		if(a>100){
			out.println("a is greater than 100");
		}else{
			out.println("a i less than 100");
		}
	%>
	
	<%= a %>
	<%= name %>
	<%= area() %>
	<%= Math.random() %>


</body>
</html>