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
	<h1 align="center">Add New Agent</h1>
	<div style ="padding-bottom: 60px;">
	<h3>Enter Agent Details</h3>
	<form action="agentpage" method="get" name="agentform" onsubmit="return validateAgent()">
	<input type="hidden" name="source" value="addagent">
	<table align="center">
		<tr>
			<th> First Name<font color="red"><sup>*</sup></font></th>
			<td><input type = "text" name="firstname"></td>
		</tr>
		<tr>
			<th>Middle Name</th>
			<td><input type = "text" name="middlename"></td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td><input type = "text" name="lastname"></td>
		</tr>
		<tr>
			<th>Date Of Birth<font color="red"><sup>*</sup></font></th>
			<td>
			<select name="dobmonth">
			<option> - Month - </option>
				<option value="January">January</option>
				<option value="Febuary">February</option>
				<option value="March">March</option>
				<option value="April">April</option>
				<option value="May">May</option>
				<option value="June">June</option>
				<option value="July">July</option>
				<option value="August">August</option>
				<option value="September">September</option>
				<option value="October">October</option>
				<option value="November">November</option>
				<option value="December">December</option>
	    		</select>
	    		
	    		<select name="dobday">
			<option> - Day - </option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>
				<option value="16">16</option>
				<option value="17">17</option>
				<option value="18">18</option>
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>
				<option value="23">23</option>
				<option value="24">24</option>
				<option value="25">25</option>
				<option value="26">26</option>
				<option value="27">27</option>
				<option value="28">28</option>
				<option value="29">29</option>
				<option value="30">30</option>
				<option value="31">31</option>
				</select>
			    <select name="dobyear">
			<option> - Year - </option>
				<option value="2002">2002</option>
				<option value="2001">2001</option>
				<option value="2000">2000</option>
				<option value="1999">1999</option>
				<option value="1998">1998</option>
				<option value="1997">1997</option>
				<option value="1996">1996</option>
				<option value="1995">1995</option>
				<option value="1994">1994</option>
				<option value="1993">1993</option>
				<option value="1992">1992</option>
				<option value="1991">1991</option>
				<option value="1990">1990</option>
				<option value="1989">1989</option>
				<option value="1988">1988</option>
				<option value="1987">1987</option>
				<option value="1985">1985</option>
				<option value="1984">1984</option>
				<option value="1983">1983</option>
				<option value="1982">1982</option>
				<option value="1981">1981</option>
				<option value="1980">1980</option>
				<option value="1979">1979</option>
				<option value="1978">1978</option>
				<option value="1977">1977</option>
				<option value="1976">1976</option>
				<option value="1975">1975</option>
				<option value="1974">1974</option>
				<option value="1973">1973</option>
				<option value="1972">1972</option>
				<option value="1971">1971</option>
				<option value="1970">1970</option>
				<option value="1969">1969</option>
				<option value="1968">1968</option>
				<option value="1967">1967</option>
				<option value="1966">1966</option>
				<option value="1965">1965</option>
				<option value="1964">1964</option>
				<option value="1963">1963</option>
				<option value="1962">1962</option>
				<option value="1961">1961</option>
				<option value="1960">1960</option>
				<option value="1959">1959</option>
				<option value="1958">1958</option>
				<option value="1957">1957</option>
				<option value="1956">1956</option>
				<option value="1955">1955</option>
				<option value="1954">1954</option>
				<option value="1953">1953</option>
				<option value="1952">1952</option>
				<option value="1951">1951</option>
				<option value="1950">1950</option>
				<option value="1949">1949</option>
				<option value="1948">1948</option>
				<option value="1947">1947</option>
	
				</select></td>
					
		</tr>
		<tr>
			<th>Address<font color="red"><sup>*</sup></font></th>
			<td><input type = "text" row="3" name="address"></td>
		</tr>
		<tr>
			<th>Email<font color="red"><sup>*</sup></font></th>
			<td><input type = "text" name="email"></td>
		</tr>
			<tr>
			<th>Phone Number<font color="red"><sup>*</sup></font></th>
			<td><input type = "text" name="phonenumber"></td>
		</tr>
			<tr>
			<th>Years Of Experience<font color="red"><sup>*</sup></font></th>
			<td><input type = "text" name="yearsofexperience" max="40" min="0"></td>
		</tr>
		</tr>
			<tr>
			<th>Reference By</th>
			<td><input type = "text" name="referenceby"></td>
		</tr>
		</tr>
			<tr>
			<th>Pan Number<font color="red"><sup>*</sup></font></th>
			<td><input type = "text" name="pancard"></td>
		</tr>
		<tr>
			<th>Zone</th>
			<td><select name = "zone">
			<option value="0">--select--</option>
					<option value="Hyderabad">Hyderabad</option>
					<option value="Chennai">Chennai</option>
					<option value="Banglore">Banglore</option>
					<option value="Kolkata">kolkata</option>
					<option value="Trivendrum">trivendrum</option>
					<option value="Bombay">Bombay</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><input type = "submit" name="btnsubmit" id="btnsubmit" value = "Add" >
			<td colspan="1" align="left"><input type = "reset" name="btnclear" id="btnreset" value = "Reset" ></td></td></tr>
			<td>
			<a href="searchAgent.jsp" align="centre" colspan="2">Search Agent</a>  </td>
		
	</table>
	</form>
	</div>
	
	
<footer>
	<%@ include file="footer.jsp" %>
	</footer>
	<script src="Agent.js"></script>
</body>
</html>