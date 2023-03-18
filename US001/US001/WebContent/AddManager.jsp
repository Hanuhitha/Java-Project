<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>




<title>Add Manager</title>

</head>
<style>
body{
margin:20px;
}
</style>
<body>
<fieldset>
<legend>Manager</legend>
	<form action="AddManager" method="post">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						Full Name<font color="red"><sup>*</sup></font>
					</div>
					<div class="col-sm-10">
						<input placeholder="Name" type="text" name="Fullname" required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">
						Date of Birth<font color="red"><sup>*</sup></font>
					</div>
					<div class="col-sm-10">
						<input placeholder="Area" type="date" name="Dob" required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">
						Area<font color="red"><sup>*</sup></font>
					</div>
					<div class="col-sm-10">
						<input placeholder="Area" type="text" name="Area" required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">
						City<font color="red"><sup>*</sup></font>
					</div>
					<div class="col-sm-10">
						<input placeholder="City" type="text" name="City" required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">
						StateZone<font color="red"><sup>*</sup></font>
					</div>
					<div class="col-sm-10">
						<input placeholder="StateZone" type="text" name="StateZone"
							required>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2">
						Designation<font color="red"><sup>*</sup></font>
					</div>
					<div class="col-sm-10">
						<select name="Designation" required>
							<option>- Designation -</option>
							<option value="Area Manager">Area Manager</option>
							<option value="City Manager">City Manager</option>
							<option value="Zonal Manager">Zonal Manager</option>
						</select>
					</div>
					<br><br>	<br><br>	
					
					<div class="row">
						<div class=col-sm-2>
							<button type="submit" class="btn">Add</button>
						</div>
						<div class=col-sm-2>
							<button type="reset" class="btn">Clear</button>
						</div>
						<div class=col-sm-2>
							<button  class="btn" type="button"><a href="ManagerHome.jsp">Cancel</a></button>
						</div>
					</div>
				</div>
			</div>
	</form>
	</fieldset>
</body>
</html>

