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
<title>Card Payment</title>
</head>
<br>
<body>
<%Integer amt=(Integer)request.getAttribute("amount");%>
	<div class="container">
		<div class="well col-md-8 col-md-offset-2" >
			<div class="col-md-6 col-md-offset-3">
				<form class="form-horizontal" action="" method="post">
				<div class="control-group">
				<label class="control-label" for="password_confirm">Premium
					Amount</label>
				<div class="controls">
					<input type="text" id="password_confirm"
						name="pamt" placeholder="Amount" class="span2 inp" value="<%=amt %>" readonly>
				</div>
			</div>
					<fieldset>
						<div id="legend">
							<legend class="Heading">
								<h2>Card Details</h2>
							</legend>
						</div>

						<!-- Name -->
						<div class="control-group">
							<label class="control-label" for="username">Card Holder's
								Name</label>

							<div class="controls">
								<input required type="text" id="username" name="username"
									placeholder="Enter Card Holder Name" class="input-xlarge inp">
							</div>
						</div>

						<!-- Card Number -->
						<div class="control-group">
							<label class="control-label" for="email">Card Number</label>
							<div class="controls">
								<input required type="text" id="email" name="email"
									placeholder="Enter the 16 digit card number"
									class="input-xlarge inp">
							</div>
						</div>

						<!-- Expiry-->
						<div class="control-group">
							<label class="control-label" for="password">Card Expiry
								Date</label>
							<div class="controls">
								<select required class="span3" name="expiry_month" id="expiry_month">
									<option>Month</option>
									<option value="01">Jan (01)</option>
									<option value="02">Feb (02)</option>
									<option value="03">Mar (03)</option>
									<option value="04">Apr (04)</option>
									<option value="05">May (05)</option>
									<option value="06">June (06)</option>
									<option value="07">July (07)</option>
									<option value="08">Aug (08)</option>
									<option value="09">Sep (09)</option>
									<option value="10">Oct (10)</option>
									<option value="11">Nov (11)</option>
									<option value="12">Dec (12)</option>
								</select> 
								<select required class="span2" name="expiry_year">
									<option>Year</option>

									<option value="17">2017</option>
									<option value="18">2018</option>
									<option value="19">2019</option>
									<option value="20">2020</option>
									<option value="21">2021</option>
									<option value="22">2022</option>
									<option value="23">2023</option>
									<option value="24">2024</option>
									<option value="25">2025</option>
									<option value="26">2026</option>
									<option value="27">2027</option>
									<option value="28">2028</option>
									<option value="29">2029</option>
									<option value="30">2030</option>

								</select>
							</div>
						</div>

						<!-- CVV -->
						<div class="control-group">
							<label class="control-label" for="password_confirm">Card
								CVV</label>
							<div class="controls">
								<input required type="password" id="password_confirm"
									name="password_confirm" placeholder="CVV" class="span2 inp ">
							</div>
						</div>


						<!-- Save card -->
						<div></div>
						<div class="control-group">
							<div class="controls">
								<label class="checkbox" for="save_card"> <input
									type="checkbox" id="save_card" value="option1"> Save
									card on file?
								</label>

							</div>
						</div>
						<br>
						<!-- Submit -->
						<div class="control-group">
							<div class="controls">
								<button class="btn btn-primary">Pay Now</button>
							</div>
						</div>

					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>