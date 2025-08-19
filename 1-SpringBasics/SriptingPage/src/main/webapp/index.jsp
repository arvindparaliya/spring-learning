<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int a=10;
		String name ="Deepak";
		int square(){
			return a*a;
		}
	%>
	
	<%
		out.println("a :" + a);
		out.println("Name : "+ name);
		out.println("Square : "+ square());
		
		int b=20;
		
		if(b>100){
			out.println("B is grater than 100.");
		}else{
			out.println("B is less than 100");
		}
		for(int i=0; i<5; i++){
			out.println(i);
		}
		
		//String name = request.getParameter(".....");
		
	%>
	
	<%=name %>
	<%=a %>
	<%= square() %>
	<%= LocalDate.now() %>
	<%= Math.random() %>
</body>
</html>