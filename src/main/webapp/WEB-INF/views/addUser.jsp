<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<%@ include file="header.jsp" %>
<link rel=" stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="panel"> 
			<div class="panel-default">
				<div class="row">
					<div class="col-md-2"></div>
							<div class="col-md-8 jumbotron">
								<form action ="save_user" method="post" class="form-horizontal"  enctype="multipart/form-data">
									<fieldset>
									<legend> User Registration Form</legend>
									 
									
									<div class="form-group">
									<label class="g" >User Name</label>
									<input type="text" name="userName" class="form-control">
									</div>
									
									<div class="form-group">
									<label class="g">Password</label>
									<input type="password" name="passWord" class="form-control">
									</div>
				
									<div class="form-group">
									<label>Email</label>
									<input type="email" name="email" class="form-control">
									</div>
									
									<div class="form-group">
									<label>MobileNumber</label>
									<input type="number" name="mobileNo" class="form-control">
									</div>
									
									<div class="form-group">
									<label>Gender</label>
									<input type="radio" name="gender" value="Male" class="form-check">Male
									<input type="radio" name="gender" value="Female" class="form-check">Female
									</div>
									
									<div class="form-group">
									<label>Hobbies</label>
									<input type="checkbox" name="hobbies" value="Reading" class="form-check">Reading
									<input type="checkbox" name="hobbies" value="Playing" class="form-check">Playing
									</div>
				
									<div class="form-group">
									<label> Verification Type</label>
									<select name ="verificationType" class="form-control">
									<option value="Citizenship">Citizenship</option>
									<option value="Passport">Passport</option>
									<option value="SSN">SSN</option>
									</select>
									</div>
				
									<div class="form-group">
									<label>DOB</label>
									<input type="date" name="dob" class="form-control">
									</div>
				
									<div>
									<div class="form-group">
									<label style="font-weight:bold;">Address</label><br>
									<label>City Name</label>
									<input type="text" name="address.cityName" class="form-control">
									</div>
									
									<div class="form-group">
									<label>Country Name</label>
									<input type="text" name="address.countryName" class="form-control">
									</div>
									</div>
									
									<div class="form-group">
									<label>Upload Photo</label>
									<input type="file" name="file" class="form-control">
									</div>
				
									<div class="form-group">
									<input type="submit" value="submit" class="btn btn-primary">
									</div>
				
								</fieldset>
							</form>
						</div>
							<div class="col-md-2"></div>
							</div>
						</div>
					</div>
				</div>

			</body>
</html>