<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page import="util.PolicyDatabase"%>
<%@page import="com.certificate"%>
    <%@page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h2 align="center">Buy a Policy</h2>

<title>Buy a Policy</title>
<script type="text/javascript">


/* getSelectedRow=function()
{
    db.transaction(function(transaction) {
          transaction.executeSql('SELECT Policyid FROM policydetails where policytype = "Accidental";',[], selectedRowValues, errorHandler);

    });
};
selectedRowValues = function(transaction,results)
{
     for(var i = 0; i < results.rows.length; i++)
     {
         var row = results.rows.item(i);
         alert(row['Policyid']);
                          
     }
}; */
var Policies = [ ];
var x=[];
<%      
Connection con=PolicyDatabase.getConnection();

Statement st = null;
ResultSet rs = null;
PreparedStatement ps=null;
try
{
	
	ps=con.prepareStatement("select policyid from policydetails where policytype=?");
	
	ps.setString(1,"accidental");
	rs=ps.executeQuery(); 
	
	%>
	<% 
	while(rs.next())
	{
		int i=0; %>
		 x[i]= "<%= rs.getInt(1)%>";
			
		<%  i++;} %>
<%}finally
{}
%>
sor(va)
Policies["database"]=x;
Policies["Accidental"]   = ["A1","A2","A3","A4"];
Policies["Wholelife"] = ["W1","W2","W3","W4", "W5"];
Policies["Term"] = ["T1", "T2", "T3", "T4", "T5"];
Policies["Pension scheme"]     = ["P1","P2","P3","P4"];


function switchInsurance(selInsurance) 
{
	var PolicySel = selInsurance.form.Policy;
	for ( var s = PolicySel.options.length-1; s > 0; --s )  
	{
		PolicySel.options[s] = null;
	}

	var chosen = selInsurance.options[selInsurance.selectedIndex].text;
	var cList = Policies[chosen];
	if ( cList != null )   
	{
		for ( var i = 0; i < cList.length; ++i )  
		{
			PolicySel.options[i+1] = new Option(cList[i],cList[i]);
		}
	}

}

function showSelection() 
{
	var Insurance = document.getElementById('Insurance').value;
	var Policy = document.getElementById('Policy').value;
	if (Policy != "") 
	{
		alert ("You selected " + Policy + " in " + Insurance);
	}
}

</script>

</head>

<link rel="stylesheet" href="buypolicy.css">
<body>
<div class="form-style-5">
<form action="policy" method="post">
<input type="hidden" name="source" value="BuyPolicy">
<fieldset>
<center><span class="number"></span> Customer Info</center>

<table align="center">
<tr>
<td>Choose the type of Insurance</td><td>
<select name="Insurance" id="Insurance" onchange="switchInsurance(this);"> 
	<option>-select-</option> 
	<option value="database">Database</option>
	<option value="Accidental">Accidental</option> 
	<option value="Whole life">Whole life</option> 
	<option value="Term">Term</option> 
	<option value="Pension scheme">Pension scheme </option> 
</select></td></tr>

<tr><td>Choose the Policy</td><td>
<select name="Policy" onchange = "showSelection()"> 

<option>-select-</option>
	<!-- <option value="Accidental Policy">Accidental Policy</option> 
	<option value="Whole life Policy">Whole life Policy</option> 
	<option value="Term Policy">Term Policy</option> 
	<option value="Pension scheme Policy">Pension scheme Policy </option> -->
</select>
</td><tr>
<tr><td>Tenure</td><td>
<select name="Tenure" id="Tenure"> 
<option>-select-</option>
	<option value="2">2 years</option> 
	<option value="5">5 years</option> 
	<option value="10">10 years</option> 
	<option value="15">15 years </option>
	<option value="20">20 years </option>
</select></td><tr>
<tr><td>Nominee Name </td><td><input type="text" name="nomname"/></td><td>
<tr><td>Nominee relationship</td><td>
<select name="Nomineerel"> 
<option>-select-</option>
	<option value="Father">Father</option> 
	<option value="Mother">Mother</option>
	<option value="Husband">Husband</option>
	<option value="Wife">Wife</option> 
	<option value="Guardian">Guardian</option>
</select></td><tr>

<tr><td>Premium type</td><td>
<select name="Premiumtype">
<option>-select-</option>
<option value="0.25">Quarterly</option> 
	<option value="0.5">Half-yearly</option> 
	<option value="1">Annually</option> 
</select></td><tr>

<tr><td>Sum Assured</td><td>
<select name="SumAssured" id="SumAssured"> 
<option>-select-</option>
	<option value="100000">1 Lakhs</option> 
	<option value="500000">5 lakhs</option> 
	<option value="200000">20 lakhs</option> 
	<option value="500000">50 lakhs</option>
</select></td><tr>

<tr><td>Premium Amount </td><td><input type="text" name="PremiumAmount" id="PremiumAmount" onfocus="premamount()"/>
	<script type="text/javascript">
	function premamount()
	{
	var tenure=document.getElementById('Tenure').value;
	//alert(tenure);
	
	var sum=document.getElementById('SumAssured').value;
 	 document.getElementById('PremiumAmount').value = (parseInt(tenure))*(parseInt(sum)); 
	}

</script>
</td><td>
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
<tr><td></td><td><input type="radio" name="medques1" value="yes">Yes&nbsp&nbsp&nbsp<input type="radio" name="medques1" value="No">No
</td></tr>

<tr><td></td><td>2.Are you Suffering from HIV or Cancer?</td></tr>
<tr><td></td><td><input type="radio" name="medques2" value="yes">Yes&nbsp&nbsp&nbsp<input type="radio" name="medques2" value="No">No
</td></tr>

<tr><td></td><td>3.Are you physically Challenged?</td></tr>
<tr><td></td><td><input type="radio" name="medques3" value="yes">Yes&nbsp&nbsp&nbsp<input type="radio" name="medques3" value="No">No
</td></tr>

<tr><td>Agent id</td><td><input type="text" name="Agentid"/></td><tr>
<tr><td>Policy Initiation Date</td><td>
<input type="date" id="date" name="date" >
<script type="text/javascript">

 	 document.getElementById('date').value = Date();
  

</script></td><tr>
</table>

<br>
<center><input type="submit" value="Confirm" /></center><br>
</fieldset>
</form>
</div>
</body>
</html>
