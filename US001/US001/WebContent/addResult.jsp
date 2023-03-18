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
<div align="center" style = "padding-bottom: 320px; margin-top: 50px;">

<h2><%=request.getAttribute("resultMessage")%></h2>
<h2>Agent details sent for validation</h2>

<a href="addAgent.jsp">Return to Home</a>
<a href="searchAgent.jsp"> View Agents</a>


</div>
<footer>
	<%@ include file="footer.jsp" %>
	</footer>
</body>
</html>