<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User</title>
<script src="javascript/valid.js" type="text/javascript"></script>
</head>
<body>

<h1>Forgot Password</h1>
<form action="forgot" method="post" name="UserForm">
<input type="hidden" name="source" value="checkuser">

<table>

<tr>
<th align="left" >User name</th>
<td>
<input type="text"  name="username" id="username" onblur="chkName()"/>
</td>
</tr>

<tr>
<th align="left" >Security Question</th>
<td>
<input type="text" name="securityQuestion" id="securityQuestion" />
</td>
</tr>

<tr>
<th align="left" >Security Answer</th>
<td>
<input type="text" name="securityAnswer" id="securityAnswer" />
</td>
</tr>

<tr>
<td></td>
<td>
<input type="submit" value="Retrieve Password"/>
</td>
</tr>

<tr>
<td></td>
<td>
<input type="reset" value="Clear" />
</td>
</tr>



</table>
</form>
</body>
</html>