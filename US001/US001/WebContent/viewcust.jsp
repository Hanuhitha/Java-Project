<%@page import="bean.Customerdetails"%>
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
     <h1 align="center">viewcustomer</h1>
     <%Customerdetails cd2 = (Customerdetails)request.getAttribute("cd2");
     if(cd2==null)
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
	<table align="center" border="2">
	<tr>
	   <th>FirstName</th>
	   <th>MiddleName</th>
	   <th>LastName</th>
	   <th>DateOfBirth</th>
	   <th>Gender</th>
	   <th>PermanentAddress</th>
	   <th>PresentAddress</th>
	   <th>Occupation</th>
	   <th>AnnualSalary</th>
	   <th>Marital Status</th>
	   <th>Children</th>
	   <th>Email</th>
	   <th>PhoneNumber</th>
	   <th>Pancard</th>
	   </tr>
	   
	   <tr>
	   <td><%=cd2.getFirstname()%></td>
	   <td><%=cd2.getMiddlename()%></td>
	   <td><%=cd2.getLastname()%></td>
	   <td><%=cd2.getDateofbirth() %></td>
	   <td><%=cd2.getGender()%></td>
	   <td><%=cd2.getPemanentaddress()%></td>
	   <td><%=cd2.getPresentaddress() %></td>
	   <td><%=cd2.getOccupation()%></td>
	   <td><%=cd2.getAnnualsalary()%></td>
	   <td><%=cd2.getMaritalstatus() %></td>
	   <td><%=cd2.getChildren() %></td>
	   <td><%=cd2.getEmail() %></td>
	   <td><%=cd2.getPhonenumber() %></td>
	   <td><%=cd2.getPancard()%></td>
	      <%}%>
	      </tr>
	      </table>
	      </div>
	      <center>
	   <p align="centre" colspan="5">
		<a href="customer.jsp">Home</a>
		</p>
</center>
	 <footer>
	<%@ include file="footer.jsp" %>
	</footer>   
	 </form>
</body>
</html>