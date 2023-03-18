<%@page import="bean.buypolicy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h2 align="center">Buy a Policy</h2>

<title>Buy a Policy</title>
</head>
<link rel="stylesheet" href="buypolicy.css">
<body>
<div class="form-style-5">
<form action="changenom" method="post">
<input type="hidden" name="source" value="BuyPolicy">
<%buypolicy cd=(buypolicy)request.getAttribute("cd1"); %>
<fieldset>
<center><span class="number"></span> Customer Info</center>

<table align="center">
<tr>
<td>Choose the type of Insurance</td><td>
<input type="text" value="<%=cd.getInsurance() %>" readonly/>
</td></tr>

<tr><td>Choose the Policy</td><td>
<input type="text" value="<%=cd.getPolicy() %>" readonly/>
</td><tr>

<tr><td>Tenure</td><td>
<input type="text" value="<%=cd.getTenure() %>" readonly/>
<!-- <select name="Tenure" readonly> 
<!-- <option></option>
	<option value="2 years">2 years</option> 
	<option value="5 years">5 years</option> 
	<option value="10 years">10 years</option> 
	<option value="15 years">15 years </option>
	<option value="20 years">20 years </option>
</select> --></td><tr> 
<tr><td>Nominee Name </td><td><input type="text" name="nomname" value="<%=cd.getNominee() %>"/></td><td>
<tr><td>Nominee relationship</td><td>
<select name="Nomineerel"> 
<option><%=cd.getNomineerel() %></option>
	<option value="Father">Father</option> 
	<option value="Mother">Mother</option>
	<option value="Husband">Husband</option>
	<option value="Wife">Wife</option> 
	<option value="Guardian">Guardian</option>
</select></td><tr>

<tr><td>Premium type</td><td>
<input type="text" value="<%=cd.getPremiumtype()%>" readonly/>
</td><tr>

<tr><td>Sum Assured</td><td>
<input type="text" value="<%=cd.getSumAssured() %>" readonly/>
</td><tr>

<tr><td>Premium Amount </td>
	<td><input type="text" name="PremiumAmount" value="<%=cd.getPremiumAmount() %>" readonly/></td>
	<td>
</td><tr>

<tr><td>Date of Birth</td><td>
<!-- <form action="/action_page.php"> -->
  <input type="file" name="birthproof" accept="jpg/pdf">
  <input type="submit" value="Upload">
</td><tr>

<tr><td>Unique Identification card</td><td>
<!-- <form action="/action_page.php"> -->
  <input type="file" name="identity" accept="application/pdf">
  <input type="submit" value="Upload">
</td><tr>
<tr><td>Medical Details</td><td>1.Do you have any vision defects?</td></tr>
<tr><td></td><td><input type="radio" name="medques1">Yes&nbsp&nbsp&nbsp<input type="radio" name="medques1">No
</td></tr>

<tr><td></td><td>2.Do you Suffering from HIV or Cancer?</td></tr>
<tr><td></td><td><input type="radio" name="medques2">Yes&nbsp&nbsp&nbsp<input type="radio" name="medques2">No
</td></tr>

<tr><td></td><td>3.Are you physically Challenged?</td></tr>
<tr><td></td><td><input type="radio" name="medques3">Yes&nbsp&nbsp&nbsp<input type="radio" name="medques3">No
</td></tr>

<tr><td>Agent id</td><td><input type="text" name="Agent id"/></td><tr>
<tr><td>Policy Initiation Date</td><td>
<input type="date" id="date" name="date" >
<script type="text/javascript">

 	 document.getElementById('date').value = Date();
  

</script></td><tr>
</table>

<br>
<center><input type="submit" value="update" /></center><br>
</fieldset>
</form>
</div>
</body>
</html>
