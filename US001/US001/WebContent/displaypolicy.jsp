<%@page import="bean.PolicyDetails"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%PolicyDetails pd=(PolicyDetails)request.getAttribute("pd2");  %>

<form action="PolicySearchController" method="get">

<center><h1><b><font color=red> POLICY </font></b></h1></center>

<b>Policy ID : </b><%=pd.getPolicyid()%><br><br>
<b>Policy Name : </b><%=pd.getPolicyname() %><br><br>
<b>Type of policy : </b><%=pd.getPolicytype() %><br><br>
<b>Number of Nominees Required : </b><%=pd.getNom_number()  %> <br><br>
<b>Tenure(in years) : </b><%=pd.getTenure() %> <br><br>
<b>Sum Assured : </b><%=pd.getSum() %><br><br>
<b>Pre-requisites : </b><%=pd.getPrerequisites() %>
<br><br>

<input type="submit" value="OK" onclick="document.forms[0].action = 'ManagerHome.jsp'; return true;">
</form>

</body>
</html>