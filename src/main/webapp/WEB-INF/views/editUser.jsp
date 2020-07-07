<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix ="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Edit Form</title>
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
							<form action ="update_user" method="post" class="form-horizontal">
								<fieldset>
									<legend>User Edit Form</legend>
										<div class="form-group">
											<label>Id</label>
											<input type="text" name="id" readonly="readonly" value="${user.id }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>User Name</label>
											<input type="text" name="userName" value="${user.userName }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>Email</label>
											<input type="email" name="email" value="${user.email }" class="form-control">
										</div>
										
										<div class="form-group">
											<label>MobileNumber</label>
											<input type="number" name="mobileNo" value="${user.mobileNo }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>Gender</label>
											<input type="radio" name="gender" value="Male"${user.gender=='Male'?'checked':''} class="form-check" >Male
											<input type="radio" name="gender" value="Female"${user.gender=='Female'?'checked':''} class="form-check" >Female
										</div>
				
										<div class="form-group">
											<label>Hobbies</label>
											<input type="checkbox" name="hobbies" value="Reading" class="form-check"
											<c:if test="${fn:contains(user.hobbies, 'Reading')}" >checked</c:if> 
												>Reading
											<input type="checkbox" name="hobbies" value="Playing" class="form-check"
											<c:if test="${fn:contains(user.hobbies, 'Playing')}" >checked</c:if> 
												 >Playing
										</div>
				
										<div class="form-group">
											<label> Verification Type</label>
											<select name ="verificationType" class="form-control">
												<option value="Citizenship"${user.verificationType=='Citizenship'?'checked':''}>Citizenship</option>
												<option value="Passport"{user.verificationType=='Passport'?'checked':''}>Passport</option>
												<option value="SSN"{user.verificationType=='SSN'?'checked':''}>SSN</option>
											</select>
										</div>
				
										<div class="form-group">
											<label>DOB</label>
											<input type="date" name="dob" value="${user.dob }" class="form-control">
										</div>
				
										<div>
											<div class="form-group">
											<label style="font-weight:bold;">Address</label><br>
											<label>City Name</label>
											<input type="text" name="address.cityName" value="${user.address.cityName }" class="form-control">
											</div>
											
											<div class="form-group">
											<label>Country Name</label>
											<input type="text" name="address.countryName" value="${user.address.countryName }" class="form-control">
											</div>
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