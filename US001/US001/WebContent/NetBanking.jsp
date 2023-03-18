<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="cardstyle.css">

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
	margin: 70px;
}
</style>
<title>NetBanking</title>
</head>
<body>
<%Integer amt=(Integer)request.getAttribute("amount");%>
	<div class="container ">

		<!-- NetBanking -->

		<div class="well col-md-8 col-md-offset-2">
			<h2 class="page-header">NetBanking</h2>
			<form class="form-horizontal" action="banking" method="post">
			<div class="control-group">
				<label class="control-label" for="password_confirm">Premium
					Amount</label>
				<div class="controls">
					<input type="text" id="password_confirm"
						name="pamt" placeholder="Amount" class="span2 inp" value="<%=amt %>" readonly>
				</div>
			</div>
				<!-- IFSC -->
				<div class="control-group">
					<label class="control-label" for="username">IFSC code</label>
					<div class="controls">
						<input required type="text" id="ifsc" name="ifsc"
							placeholder="IFSC" class="input-xlarge inp">
					</div>
				</div>


				<b class="col-md-10 col-md-offset-4">-OR-</b>

				<!-- Select Bank -->
				<div class="control-group">
					<label class="control-label" for="BankName">Select Bank</label>
					<div class="controls">
						<select name="bank">
							<option>Select Bank</option>
							<option value="Axis Bank">Axis Bank</option>
							<option value="Canara Bank">Canara Bank</option>
							<option value="CITI Bank">CITI Bank</option>
							<option value="ICICI Bank">ICICI Bank</option>
							<option value="HDFC Bank">HDFC Bank</option>
							<option value="Standard Chartered">Standard Chartered</option>
							<option value="SBI">State Bank of India</option>
							
						</select>
					</div>
				</div>


				<!-- Account Number -->
				<hr>
				<div class="control-group">
					<label class="control-label" for="username">Account Number</label>
					<div class="controls">
						<input required type="text" id="accno" name="accno"
							placeholder="Account Number" class="input-xlarge inp">
					</div>
				</div>

				<!-- Select Branch -->
				<div class="control-group">
					<label class="control-label" for="BankName">Branch</label>
					<div class="controls">
						<select name="branch">
							<option>Select Branch</option>
							<option value="Andhra Pradesh">Andhra Pradesh</option>
							<option value="Arunachal Pradesh">Arunachal Pradesh</option>
							<option value="Assam">Assam</option>
							<option value="Bihar">Bihar</option>
							<option value="Chattisgarh">Chattisgarh</option>
							<option>Daman&Diu</option>
							<option>Goa</option>
							<option>Gujrat</option>
							<option>Haryana</option>
							<option>Himachal Pradesh</option>
							<option>Jharkand</option>
							<option>Jammu&kashmir</option>
							<option>Karnataka</option>
							<option>Kerala</option>
							<option>Manipur</option>
							<option>Madhya Pradesh</option>
							<option>Maharashtra</option>
							<option>Nagaland</option>
							<option>NewDelhi</option>
							<option>Orissa</option>
							<option>Punjab</option>
							<option>Pondicherry</option>
							<option>Rajasthan</option>
							<option>Sikkim</option>
							<option>Telangana</option>
							<option>TamilNadu</option>
							<option>Tripura</option>
							<option>Uttar Pradesh</option>
							<option>West Bengal</option>
						</select>

					</div>
				</div>

				<!-- CVV -->
				<hr>
				<div class="control-group">
					<label class="control-label" for="username">Amount</label>
					<div class="controls">
						<input required type="text" id="amount" name="amount"
							placeholder="cvv" class="input-xlarge inp">
					</div>
				</div>
				<!-- Pay -->
				<br>
				<hr>
				<div class="control-group">
					<div class="controls">
						<button class="btn btn-primary">Pay Now</button>
					</div>
				</div>
		</div>



	</div>
</body>
</html>