<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<%@ include file="studentHeader.jsp" %>
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
								<form action ="save_student" method="post" class="form-horizontal"  enctype="multipart/form-data">
									<fieldset>
									<legend> Student Registration Form</legend>
									 
									
									<div class="form-group">
									<label class="g" >Student Name</label>
									<input type="text" name="studentName" class="form-control">
									</div>
									
									<div class="form-group">
									<label class="g">Password</label>
									<input type="password" name="spassWord" class="form-control">
									</div>
									
									<div class="form-group">
									<label>Student Email</label>
									<input type="email" name="studentEmail" class="form-control">
									</div>
									
									<div class="form-group">
									<label>Student Phone Number</label>
									<input type="number" name="studentPhoneno" class="form-control">
									</div>
				
									<div class="form-group">
									<label>Date of Birth</label>
									<input type="date" name="dateofBirth" class="form-control">
									</div>
				
									
									<div class="form-group">
									<label>Student Address</label>
									<input type="text" name="studentAddress" class="form-control">
									</div>
									
									<div class="form-group">
									<label> Student Documents</label>
									<input type="checkbox" name="studentDocuments" value="Passport" class="form-check">Passport
									<input type="checkbox" name="studentDocuments" value="Bank_Statement" class="form-check">Bank Statement
									<input type="checkbox" name="studentDocuments" value="Property_Statement" class="form-check">Property Statement
									</div>
									
									
									<div class="form-group">
									<label> Student Process Status</label>
									<select name ="studentProcessStatus" class="form-control">
									<option value="Processing">Processing</option>
									<option value="ProcessCompleted">ProcessCompleted</option>
									</select>
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