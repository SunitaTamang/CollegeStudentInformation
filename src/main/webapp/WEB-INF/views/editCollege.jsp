<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix ="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Edit Form</title>
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
							<form action ="update_college" method="post" class="form-horizontal">
								<fieldset>
									<legend>College Edit Form</legend>
										<div class="form-group">
											<label>CollegeId</label>
											<input type="text" name="collegeId" readonly="readonly" value="${college.collegeId }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>College Name</label>
											<input type="text" name="collegeName" value="${college.collegeName }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>College Email</label>
											<input type="email" name="collegeEmail" value="${college.collegeEmail }" class="form-control">
										</div>
										
										<div class="form-group">
											<label>College Phone Number</label>
											<input type="number" name="collegePhoneno" value="${college.collegePhoneno }" class="form-control">
										</div>
										
										<div class="form-group">
											<label>Date of Establishment</label>
											<input type="date" name="dateofEstablishment" value="${college.dateofEstablishment }" class="form-control">
										</div>
											
											<div class="form-group">
											<label>College Address</label>
											<input type="text" name="collegeAddress" value="${college.collegeAddress }" class="form-control">
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