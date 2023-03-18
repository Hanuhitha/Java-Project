<%@page import="bean.Manager"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Manager Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
body {
	margin: 20px;
}
</style>
<body>
	<fieldset>
		<legend>Manager Details</legend>
		
			<%
				Manager Manager = (Manager) request.getAttribute("Manager1");
				if (Manager == null) {
			%><div class="container">
				<div class="well col-md-8 col-md-offset-2">
					<center>
						<div class="control-group">
							<h3>Manager Not Found</h3>
							<br>Return to Home<br> <br> <br>
							<div class="controls">
								<button class="btn ">
									<a href="ManagerHome.jsp">Home</a>
								</button>
								<button class="btn ">
									<a href="AddManager.jsp">AddManager</a>
								</button>
								<button class="btn ">
									<a href="ModifyManager.jsp">Back</a>
								</button>
							</div>
						</div>
				</div>
				</center>
			</div>


			<%
				} else {
			%>
<form action="Updated" method="post">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">Full Name</div>
					<div class="col-sm-10">
						<input type="text" value=<%=Manager.getFullName()%>
							name="Fullname" readonly>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">Date of Birth</div>
					<div class="col-sm-10">
						<input type="date" value=<%=Manager.getDob()%> name="dob" required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">Area</div>
					<div class="col-sm-10">
						<input type="text" value=<%=Manager.getArea()%> name="Area"
							required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">City</div>
					<div class="col-sm-10">
						<input type="text" value=<%=Manager.getCity()%> name="City"
							required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">StateZone</div>
					<div class="col-sm-10">
						<input type="text" value=<%=Manager.getStateZone()%>
							name="StateZone" required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">Designation</div>
					<div class="col-sm-10">
						 <select name="Designation"  required>
							<option><%=Manager.getDesignation()%></option>
							<option value="Area Manager">Area Manager</option>
							<option value="City Manager">City Manager</option>
							<option value="Zonal Manager">Zonal Manager</option>
						</select>
					</div>
				</div>
				<br> <br> <br> <br>

				<div class=col-sm-2>
					<button type="submit" class="btn">Update</button>
				</div>
				<div class=col-sm-2>
					<button type="reset" class="btn">Clear</button>
				</div>
				<div class=col-sm-2>
					<button class="btn" type="button">
						<a href="ManagerHome.jsp">Cancel</a>
					</button>
				</div>
			</div>
			</form>
			<%
					}
				%>

		

	</fieldset>
</body>
</html>