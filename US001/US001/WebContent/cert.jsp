<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.policy"%>
    <%@page import ="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1 align = "center">select policy name</h1>
<div style="padding-bottom:208px;">
<%ArrayList<Integer> al=(ArrayList<Integer>)request.getAttribute("al");%>
<%-- <%for(int i=0;i<al.size();i++)
{
				
	out.println(al.get(i));
				
				
				}%> --%>
<form method="get" action="certificate.jsp">
<table align="center">
		<tr>
			<th>Policy ID :</th>
			<td><select name="policyid" id="policyid">
			<option value="0">--select--</option> 
			<%for(int i=0;i<al.size();i++)
				{
				%>
				<option ><%=al.get(i) %></option>
				
				<%
				}%>
				
            <!-- <option value="0">Saab</option>
            <option value="0">Mercedes</option>
            <option value="0">Audi</option> -->
            </select>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type = "submit" value = "generate certificate" ></td>
		</tr>
	</table>

</form>
</body>
</html>