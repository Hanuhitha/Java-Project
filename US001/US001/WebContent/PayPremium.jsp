<%@page import="com.certificate"%>
    <%@page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="cardstyle.css">
<link rel="stylesheet" href="cardstyle.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Pay Premium</title>
</head>
<body>

<%ArrayList<String> al=(ArrayList<String>)request.getAttribute("al1");%>
	<div class="container">
		<div class="well col-md-8 col-md-offset-2">
			<div class="col-md-12 ">
				<form class="form-horizontal" action="certificate" method="post">
					<input type="hidden" name="source" value="PayPremium">
					<div id="legend">
						<legend class="Heading">
							<h2>Payment</h2>
						</legend>
					</div>
			</div>

			<!-- Policy ID -->
			<div class="control-group">
				<label class="control-label" for="password">Policy Name</label>
				<div class="controls">
					<select class="span3" name="pname" id="pname">
						<option>-Select-</option>
						<option value="0">--select--</option> 
						
			<%for(int i=0;i<al.size();i++)
				{
				%>
				<option ><%=al.get(i) %></option>
				
				<%
				}%>

					</select>
				</div>
			</div>
			<br>
			<!-- Amount -->
			
			<br>
			<!-- Payment Mode -->
			<div class="control-group">
				<div class="controls">
					<label class="control-label" for="password">Payment Mode</label><br>
					<input type="radio" name="medques3" value="NetBanking">&nbsp&nbspNetBanking&nbsp&nbsp&nbsp<input
						type="radio" name="medques3" value="card">&nbsp&nbspCreditCard
				</div>
			</div>
			<br>
			<br>
			<!-- Submit -->
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary">Confirm</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>