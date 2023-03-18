<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<link rel="stylesheet" href= "Style.css">
<body>
<%@ include file="header.jsp" %>
	<h1 align="center">Add New Agent</h1>
	<div style ="padding-bottom: 60px;">
	<center><h3>Login Page</h3></center>
</div>
<form action="Login" method="post">

<input type="hidden" name="source" value="login">
<table align="center" cellpadding=10>


<tr>
<td>User id</td> 
<td> <input type="text" name="userid" required minlength="8"></input></td>
</tr>
<tr>
<td>Password</td>
<td> <input type="password" name="password"></input></td>
</tr>
<tr>
<td> Role</td><td> <select name="Role">
<option>admin</option>
<option>customer</option>
<option>manager</option>
<option>agent</option>
</select>
</tr>
<tr>
<td><input type="submit" value="Signin"></input></td>
</tr>
<tr><td><input type="submit" value="logout" onclick="logout.jsp"></input></td></tr>
<tr>
<td> <a href="signin.jsp">New User </a>&nbsp</td><td><a href="new_user.jsp">Forgot Password</a></td>
</tr>
</table>
</form>
<footer>
	<%@ include file="footer.jsp" %>
	</footer>

</div>
</body>
</html>