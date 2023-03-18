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

<title>Home</title>
<link rel="stylesheet" href= "style.css">
</head>
<style>
body{
margin:20px;
}
</style>
<body>
<div class ="header">
<center>
<h1><p> Admin Page</p></h1>
<p> </p>
</center>
</div>
<div class ="footer">

</div>

<div class ="form-group">
<fieldset>
<legend><font size="10px" color="green">Functions</font><br><br></legend>
<a href="deletecust.jsp">delete customer</a> <br><br>

<a href="AddManager.jsp">Add Manager</a> <br><br>
<a href="ModifyManager.jsp">Modify Manager</a> <br><br>
<a href="DeleteManager.jsp">Delete Manager</a> <br><br>
<font size="8px" color="green">Policies</font><br><br>
<a href="policyDetails.jsp">Add policy</a> <br><br>
<a href="searchModify.jsp">Modify policy</a> <br><br>
<a href="searchPolicy.jsp">view policy</a> <br><br>
<a href="policyDelete.jsp">Delete policy</a> <br><br>

</fieldset>
</div>
</body>
</html>

