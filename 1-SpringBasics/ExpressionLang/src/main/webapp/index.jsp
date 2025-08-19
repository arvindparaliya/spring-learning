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
		//request.setAttribute("request_name", "Arvind Paraliya");
		//out.println(request.getAttribute("request_name"));
	%>
		
	<h3>Hello : ${requestScope.request_name}</h3>
	
	<%
		//session.setAttribute("Company_name", "XYZ");
		//out.println(session.getAttribute("Company_name"));
	//%>
	
	//<h3>Company Name :${Company_name} </h3>
	
	<form action="output.jsp" method="get">
		<input type="text" name="name1" placeholder="Enter the name"/>
		<input type= "submit" placeholder= "Click me!"/>
	</form>
	
	
	
</body>
</html>