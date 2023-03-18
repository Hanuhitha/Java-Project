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
	
	<div style ="padding-bottom: 60px;">
	<marquee><font size="12px">Welcome to the customer web page </font></marquee>
	<center><a href="BuyPolicy.jsp"><font size="12px">Buy policy</font></a><br>
			<a href="changenom.jsp"><font size="12px">Change nominee</font></a><br>
			<a href="viewpolicy.jsp"><font size="12px">view your policydetails</font></a><br>
			
		</center>
		<footer>
	<%@ include file="footer.jsp" %>
</body>
</html>