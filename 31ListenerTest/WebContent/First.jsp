<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
    	System.out.println("Adding attribute to Session...");
    	request.getSession().setAttribute("test", "test");
    	System.out.println("Adding attribute to Session completed!");
         
    	System.out.println("Removing Session...");
    	request.getSession().invalidate();
    	System.out.println("Removing Session completed!");      
         
    	out.println("Successfully adding and removing attributes from Session");    
	%>
</body>
</html>