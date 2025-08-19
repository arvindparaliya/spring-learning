<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>

	<form action="regForm" method="post">
		Name     : <input type="text" name="name1"/> <br/> <br/>
		Email    : <input type="text" name="email1"/> <br/> <br/>
		Password : <input type="password" name="pass1"/> <br/> <br/>
		Gender   : <input type="radio" name="gender1" value="Male"/>Male 
                   <input type="radio" name="gender1" value="Female"/>Female <br/> <br/>
		City     : <select name="city1">
						<option value="">Select City</option>
						<option value="Delhi">Delhi</option>
						<option value="Bombay">Bombay</option>
						<option value="Pune">Pune</option>
						<option value="Bangalore">Bangalore</option>
						<option value="Rajkot">Rajkot</option>
					</select> <br/><br/>
		  <input type="Submit" value="Register"/>
	</form>

</body>
</html>

</html>