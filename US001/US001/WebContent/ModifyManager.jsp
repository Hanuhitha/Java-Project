<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Manager</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
	margin:150px;
}
input{
width: 40%;
padding:8px 4px;
border-radius:5px;

}
</style>
</head>
<body>
	<form action="ModifyManager" method="post" >
		<div class="container">
			<div class="well col-md-8 col-md-offset-2">
			<center>
				<div class="control-group">
				<label class=" col-md-8 col-md-offset-4  ">Full Name <font color="red"><sup>*</sup></font></label>	
				
					<div class="controls">
						<input placeholder="Name" type="text" name="Fullname" required >
					</div>
					<br>
				</div>
				<div class="control-group">
					<div class="controls">
						<button type="submit" class="btn btn-primary" name="action" value="view">View</button>
						<button type="submit" class="btn btn-primary" name="action" value="update">Update</button>
						<button type="submit" class="btn btn-primary" name="action" value="delete">Delete</button>
					</div>
					<br>
				</div>
				<div class="control-group">
					<div class="controls">
						<a href="ViewManager.jsp" class="form-group">View all Managers</a>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<a href="ManagerHome.jsp" class="form-group">Home</a>
						
					</div>
				</div>
				</center>
			</div>
		</div>

</form>
</body>
</html>