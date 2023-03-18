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
<title>Modify</title>
</head>
<body>

   <%PolicyDetails pd=(PolicyDetails)request.getAttribute("pd3");  %>

<h1>Modify Details</h1>

<form action="PolicyModifyController" method="Post">
<input type="hidden" name="source1" value="modifyPolicy"/>

<table>

<tr>
<th align="left"><b>Policy ID</b></th>
<td>
<input type="text" name="policyid" value=<%=request.getParameter("policyid")%> readonly><br>
<!-- request.getParameter("policyid") -->
</td>
</tr>

<tr>
<th align="left"><b>Policy Name</b></th>
<td>
<input type="text" name="policyname" value=<%=pd.getPolicyname() %> readonly><br>
<!-- request.getParameter("policyname") -->
</td>
</tr>

<tr>
<th align="left"><b>Type of policy</b></th>
<td>
<select name="policytype" id="policytype" >
<option ><%=pd.getPolicytype() %></option>

</select>
</td>
</tr>

<tr>
<th align="left"><b>Number of Nominees Required</b><font color="red"><sup>*</sup></font>
</th>
<td>
<input type="text" name="nom_number" id="nom_number" value=<%=pd.getNom_number() %>/>
</td>
</tr>

<tr>
<th align="left"><b>Tenure(in years)</b>
</th>
<td>
<input type="text" name="tenure" id="tenure" value=<%=pd.getTenure() %> readonly /><!-- Home ownership -->

</td>
</tr>



<tr>
<th align="left"><b>Sum Assured</b>
</th>
<td>
<input type="text" name="sum" id="sum" value=<%=pd.getSum() %> readonly />
</td>
</tr>



<tr>
<th align="left"><b>Prerequisites</b>
</th>
<td>
<input type="text" name="prerequisites" id="prerequisites" value=<%=pd.getPrerequisites() %> readonly /><!-- Home ownership -->

</td>
</tr>




<tr>

<td align="right">
<input type="submit" value="update"  > 
</td>


<td align="left">
<input type="reset" value="Clear">
<input type="submit" value="Cancel" onclick="document.forms[0].action = 'index.jsp'; return true;">
</td>

</tr>



</table>

</form>

</body>
</html>