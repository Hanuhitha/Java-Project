<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<h1 align="center">Delete customer</h1>
	<div style ="padding-bottom: 60px;">
<form method="post" action="deletecust">
<center>
<input type="hidden" name="source" value="modify">
	<font size="6px">Enter customer's user id:</font><input type="text" name="id"><br>
	<input type="submit" value="Delete">
	</center>
</form>
<footer>
	<%@ include file="footer.jsp" %>
	</footer>
</body>
</html>