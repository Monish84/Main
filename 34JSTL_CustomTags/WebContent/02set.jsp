<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
	<c:set var="amount" scope="session" value="${4000*4}" />
	<c:out value="Amount is : ${amount}" />
</body>
</html>
