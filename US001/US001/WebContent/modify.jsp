<%@page import="bean.Customerdetails"%>
<%-- <%@page import="Dao.AgentDao"%> --%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//Dtd HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href= "Style.css">
</head>
<body>

 


	<%Customerdetails cd=(Customerdetails)request.getAttribute("cd3"); %>
<form method ="post" action="updatecust">
<input type="hidden" name="source" value="update">
<table>
<tr>
	<td>Registration id:</td>
	<td><input type="text" name="regid" id="regide" value="<%=cd.getId()%>" readonly/></td>
	</tr>
	<tr>
	<td>FirstName(*)</td>
	<td><input type="text" name="txtFirstName" id="txtFirstName" value="<%=cd.getFirstname()%>" readonly/></td>
</tr>
<tr>
	<td>MiddleName(*)</td>
	<td><input type="text" name="txtMiddleName" id="txtMiddleName" value="<%=cd.getMiddlename() %>"/></td>
</tr>

<tr>
	<td>LastName(*)</td>
	<td><input type="text" name="txtLastName" id="txtLastName" value="<%=cd.getLastname() %>"/></td>
</tr>
<tr>
	<td>DateOfBirth(*)</td>
	<td><input type="text" name="dob" value="<%=cd.getDateofbirth() %>"/></td>
</tr>
<tr>
	<td>Gender(*)</td>
	<td><input type="radio" name="Gender" value="M">Male</td>
</tr>
<tr>
	<td>&nbsp;</td>
	<td><input type="radio" name="Gender" value="F">FeMale</td>
</tr>
<tr>
	<td>PermanentAddress(*)</td>
	<td><textarea rows="2" cols="20" name="Address" value="<%=cd.getPemanentaddress() %>"></textarea></td>
</tr>
<tr>
	<td align="left">PresentAddress(*)</td>
	<td>city : <input type="text" name=city value="<%=cd.getPresentaddress() %>"></td>
	<td> area : <input type="text" name=area></td>
	<td >zone : <input type="text" name=zone></td>
</tr>
<tr>
	<td>Occupation(*)</td>
	<td><input type="text" name="txtOccupation" id="txtOccupation" value="<%=cd.getOccupation() %>"/></td>
</tr>
<tr>
	<td>AnnualSalary:</td>
	<td><input type="text" name="txtAnnualSalary" id="txtAnnualSalary" value="<%=cd.getAnnualsalary() %>"/></td>
</tr>
<tr>
	<td>Marital Status(*)</td>
	<td><input type="radio" name="rdmarried" id="chkmarried"/>Single</td>
	<td><input type="radio" name="rdmarried" id="chkmarried"/>Married</td>
	<td><input type="radio" name="rdmarried" id="chkmarried"/>Divorcee</td>
</tr>
<tr>
	<td>Children:</td>
	<td><input type="radio" name="rdchildren" id="rdchildren"/>YES</td>
	<td><input type="radio" name="rdchildren" id="rdchildren"/>NO</td>
</tr>	
<tr>
	<td>Email(*)</td>
	<td><input type="text" name="email" value="<%=cd.getEmail()%>"/></td>
</tr>
<tr>
	<td>PhoneNumber(*)</td>
	<td><input type="text" name="phonenum" value="<%=cd.getPhonenumber() %>"/></td>
</tr>	
<tr>
	<td>Pancard(*)</td>
	<td><input type="text" name="txtPancard" id="txtPancard" value="<%=cd.getPancard() %>"/></td>
</tr>
<tr>
	<td>Upload Passport size Photo(*)</td>
	<td><input type="file" name="photo" id="photo"/></td>
</tr>
</table>
<input type="submit" value="add">
<input type="submit" value="clear">
</form>
</body>
</html>