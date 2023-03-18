<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="javascript/valid.js" type="text/javascript"></script>
</head>
<body>

<h1>Set Password</h1>
<form action="usercontroller" method="post" name="UserForm">
<input type="hidden" name="source" value="setpassword">

<table>

<tr>
<th align="left" >New Password</th>
<td>
<input type="text" name="newPassword" id="newPassword" onblur="chkNewPassword()"/>
</td>
</tr>

<tr>
<th align="left" >Confirm Password</th>
<td>
<input type="text" name="confirmPassword" id="confirmPassword" onblur="chkConfirmPassword()" />
</td>
</tr>

<tr>
<td></td>
<td>
<input type="submit" value="Change Password" onclick=""/>
</td>
</tr>

</table>
</form>
</body>
</html>