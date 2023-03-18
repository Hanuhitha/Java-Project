<%@page import="bean.buypolicy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="Registration.jsp" method="get">
<%@ include file="header.jsp" %>
     <h1 align="center">view customer policy details</h1>
     <%buypolicy b = (buypolicy)request.getAttribute("b");
     if(b==null)
     {
    	 %><center><div style = "padding-bottom: 30px; color: red; font-weight: bold">Enter a valid Name</div>
			  <input type="text" name="n">
			 
			  <div  style = "padding-bottom: 288px;">
			  <input type = "submit" value = "view" ></div>
			 </center>
			  		<%
     }
     else
		{
			%>
	<div align ="center" style = "padding-bottom: 160px;">
	<table align="center">
	<tr>
	   <th>InsuranceType</th>
	   <th>Tenure</th>
	   <th>PremiumType</th>
	   <th>SumAssured</th>
	   <th>PremiumAmount</th>
	   <th>Nominee name</th>
	   <th>NomineeRel</th>
	   <th>Policy</th>
	  
	   
	   </tr>
	   
	   <tr>
	   <td><%=b.getInsurance()%></td>
	   <td><%=b.getTenure()%></td>
	   <td><%=b.getPremiumtype()%></td>
	   <td><%=b.getSumAssured() %></td>
	   <td><%=b.getPremiumAmount()%></td>
	   <td><%=b.getNominee()%></td>
	   <td><%=b.getNomineerel() %></td>
	   <td><%=b.getPolicy()%></td>
	   
	   
	      <%}%>
	      </tr>
	      </table>
	      </div>
	   <p align="centre" colspan="5">
		<a href="registration.jsp">return to registercustomer</a>
		</p>

	 <footer>
	<%@ include file="footer.jsp" %>
	</footer>   
	 </form>
</body>
</html>