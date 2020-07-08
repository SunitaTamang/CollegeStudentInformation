<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Registration Form</title>
<%@ include file="header.jsp" %>
<link rel=" stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<link rel=" stylesheet" href="resources/bootstrap/style.css"/>
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
								<form action ="save_college" method="post" class="form-horizontal"  enctype="multipart/form-data">
									<fieldset>
									<legend> College Registration Form</legend>
									 
									
									<div class="form-group">
									<label class="g" >College Name</label>
									<input type="text" name="collegeName" class="form-control">
									</div>
									
									
									<div class="form-group">
									<label>College Email</label>
									<input type="email" name="collegeEmail" class="form-control">
									</div>
									
									<div class="form-group">
									<label>College Phone Number</label>
									<input type="number" name="collegePhoneno" class="form-control">
									</div>
				
									<div class="form-group">
									<label>Date of Establishment</label>
									<input type="date" name="dateofEstablishment" class="form-control">
									</div>
				
									
									<div class="form-group">
									<label>College Address</label>
									<input type="text" name="collegeAddress" class="form-control">
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