<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="ob" class="com.test.Cube"></jsp:useBean> 
	<%
		int x = ob.go(4);
		int x1 = ob.go(2);
		int x2 = ob.go(5);
	%>

	<%=x %>
	<%=x1 %>
	<%=x2 %>
</body>
</html>