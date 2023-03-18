<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Policy Details</title>
</head>
<body>

<form action="PolicyController" method="post">
<input type="hidden" name="source" value="addPolicy"/>

<table>

<caption><b><font color="brown">Policy Details</font></b></caption>

<tr>
<th align="left"><b>Policy Name</b><font color="red"><sup>*</sup></font>
</th>
<td>
<input type="text" name="policyname" id="policyname" />
</td>
</tr>

<tr>
<th align="left"><b>Policy Type</b><font color="red"><sup>*</sup></font>
</th>
<td>
<select name="policytype" id="policytype">
<option value="0">--select--</option>
<option value="accidental">Accidental</option>
<option value="wholelife">Whole Life</option>
<option value="term">Term</option>
<option value="pensionscheme">Pension Scheme</option>
</select>
</td>
</tr>


<tr>
<th align="left"><b>Number of Nominees Required</b><font color="red"><sup>*</sup></font>
</th>
<td>
<input type="text" name="nom_number" id="number"/>
</td>
</tr>


<tr>
<th align="left"><b>Tenure(in years)</b><font color="red"><sup>*</sup></font>
</th>
<td>
<select name="tenure" id="tenure">
<option value="0">--select--</option>
<option value="5">5 years</option>
<option value="10">10 years</option>
<option value="15">15 years</option>
<option value="20">20 years</option>
</select>
</td>
</tr>


<tr>
<th align="left"><b>Sum Assured</b><font color="red"><sup>*</sup></font>
</th>
<td>
<select name="sum" id="sum">
<option value="0">--select--</option>
<option value="100000">1 Lakh</option>
<option value="500000">5 Lakh</option>
<option value="2000000">20 Lakh</option>
<option value="5000000">50 Lakh</option>
</select>
</td>
</tr>



<tr>
<th align="left"><b>Pre-requisites</b>
</th>
<td>
<select name="prerequisites" id="prerequisites">
<option value="0">--select--</option>
<option value="Nominee_should_be_wife">Nominee_should_be_wife</option>
<option value="Age_is_not_less_than_30_years">Age_is_not_less_than_30_years</option>
<option value="The_kid's_age_should_be_less_than_5_years">The_kid's_age_should_be_less_than_5_years</option>
</select>
 </td>
</tr>

<tr>

<td align="right">
<input type="submit" value="Add"   > 
</td>
 <!--  onclick="document.forms[0].action = 'validate()'; return true;"-->

<td align="left">
<input type="reset" value="Clear">
<input type="submit" value="Cancel" onclick="document.forms[0].action = 'searchPolicy.jsp'; return true;">
</td>

</tr>

</table>



</form>

</body>
</html>