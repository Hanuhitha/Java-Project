<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>

<script src="javascript/valid_sign_up.js" type="text/javascript"></script>

</head>
<body>

<form action="Signservlet" method="post">
	<center>
	
	<table><caption>Enter your personal details</caption>
	
	<tr><td align="right">first name:</td>
		<td align="left">
		<input type="text" name="fname" id="fname" onblur=chkFirstName()></td>
	</tr>
	
	<tr><td align="right">Last name:</td>
		<td align="left">
		<input type="text" name="lname" id="lname" onblur="chkLastName()"></td>
	</tr>
	
	<tr><td align="right">Date of birth:</td>
		<td align="left">
		<input type="text" name="dob" id="dob" onblur="chkDateOfBirth()"></td>
	</tr>
	
	<tr><td align="right">Email:</td>
		<td align="left">
		<input type="text" name="email" id="email" onblur="chkEmail()" onblur="chkNumber()"></td>
	</tr>
	
	<tr><td align="right">Phone No:</td>
		<td align="left">
		<input type="text" name="phno" id="phno" onblur="chkNumber()"></td>
	</tr>
	
	</table>
	</center>
	
	
	
	<center>
	<table>
	<caption>Set your Credentials</caption>
	
	<tr><td>UserId:</td>
		<td align="left">
		<input type="text" name="userid" id="userid" onblur="chkUserId()"></td>
	</tr>
	
	<tr><td>Secret question:</td>
		<td align="left">
		<input type="text" name="squestion" id="squestion" onblur="chkSQun()"></td>
	</tr>
	
	<tr><td>Secret answer:</td>
		<td align="left">
		<input type="text" name="sans" id="sans" onblur="chkSAns()"></td>
	</tr>
	
	<tr><td>Password:</td>
		<td align="left">
		<input type="password" name="password" id="password" onblur="chkPassword()"></td>
	</tr> 
	
	<tr><td>Confirm Password:</td>
		<td align="left">
		<input type="password" name="confirmpassword" id="confirmpassword"></td>
	</tr>
	
	<tr>
	<td>Role:</td>
		<td align="left">
		<select name="role" id="role" onblur="chkRole()">
			<option value="0">--select--</option>
			<option value="agent">agent</option>
			<option value="customer">customer</option>
				<option value="admin">admin</option>	
				<option value="Manager">manager</option>			
		</select>
	</td>
	</tr>
							
	</table>
	</center>
	<center><input type="submit" value="Submit">
			<input type="reset" value="Reset"></center>
	</form>
	
</body>
</html>