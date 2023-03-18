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
bgcolor:cyon;
}
</style>
<body>
<div class ="header">
<center>
<marquee><font size="12px">Welcome to the customer web page </font></marquee>
<p> </p>
</center>
</div>
<div class ="footer">

</div>

<div class ="form-group">
<fieldset>
<legend><font size="10px" color="green">Functions</font><br><br></legend>

	<a href="Registration.jsp">Register</a><br>
			<a href="modfycust.jsp">Modify </a><br>
			
			<a href="viewcustomer.jsp">view your form</a><br>
			<a href="Pay.jsp" onclick="certificate">Pay amount</a> <br><br>
		
</fieldset>
</div>
</body>
</html>





<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
	
	<div style ="padding-bottom: 60px;">
	<marquee><font size="12px">Welcome to the customer web page </font></marquee>
	<center><a href="Registration.jsp"><font size="12px">Register here</font></a><br>
			<a href="modfycust.jsp"><font size="12px">Modify </font></a><br>
			
			<a href="viewcustomer.jsp"><font size="12px">view your form</font></a><br>
			
		</center>
		<footer>
	<%@ include file="footer.jsp" %>
</body>
</html> --%>