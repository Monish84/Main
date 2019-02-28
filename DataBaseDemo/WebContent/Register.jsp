<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Register Page..</h3>
	<form action="RegisterServlet" method="post">
	
      	Name : <input type="text" name="name"><br>
     	DOB : <input type="text" name="dob"><br>
      	PassWord : <input type="password" name="pwd"><br>
      	Re-PassWord : <input type="password" name="pwd1"><br>
      	Address : <input type="text" name="addr"><br><br>
      				<input type="submit" value="Register"><br>
	</form><br>
	
	<form action="RegisterServlet" method="post">
      				<input type="submit" value="Update" >			
	</form>
</body>
</html>