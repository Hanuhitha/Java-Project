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
<h1 align = "center">Search Policy</h1>
<div style = "padding-bottom: 208px;">
<form action="policy" method="Post" >
<input type="hidden" name="source" value="changenom">
	<table align="center">
		<tr><td>Choose the Policy</td><td>
<select name="Policy" > 
<option>-select-</option>
	<option value="Accidental Policy">Accidental Policy</option> 
	<option value="Whole life Policy">Whole life Policy</option> 
	<option value="Term Policy">Term Policy</option> 
	<option value="Pension scheme Policy">Pension scheme Policy </option>
</select></td><tr>
		<tr>
			<td colspan="2" align="center"><input type = "submit" value = "change" ></td>
		</tr>
	</table>
	</form>

</div>	
<footer>
	<%@ include file="footer.jsp" %>
	</footer>
	<script src="Agent.js"></script>
</body>
</html>