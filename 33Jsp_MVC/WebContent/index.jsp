<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function go(){
		 var y = document.getElementById("name").value;
		    if (y == null || y == "") {
		        alert("User Name must be filled out");
		        return false;
		    }
		var x = document.getElementById("pass").value;
	    if (x == null || x == "") {
	        alert("Password must be filled out");
	        return false;
	    }
	}
	
</script>

</head>
<body>
<h3>Login Page...</h3>
	<form action="hello" method="post">
		Name:<input type="text" name="name" id = "name"><br> 
		Password:<input type="password" name="password" id="pass"><br> 
		<input type="submit" value="login" onclick="return go()">
	</form>
</body>
</html>