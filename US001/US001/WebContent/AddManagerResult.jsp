<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title></title>
</head>
<style>
body{
margin:20px;
}
</style>
<body>

<div align="center" style = "padding-bottom: 320px; margin-top: 50px;">

<h2><%=request.getAttribute("resultMessage")%></h2>


<a href="AddManager.jsp">Return to Add Manager</a><br>
<a href="ViewManager.jsp"> View Manager</a>



</div>
</body>
</html>