<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
<link rel=" stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<form action ="reset_college_password" method="post" class="form-horizontal">
	<fieldset>
		<legend> Reset Password</legend>
		<span style="color:red">${message}</span>
 			<div class="container">
				<div class="form-group">
					<label class="g">OldPassword</label>
					<input type="password" name="passWord" class="form-control">
				</div>
			
				<div class="form-group">
				 	<label class="g">NewPassword</label>
					<input type="password" name="newPassword" class="form-control">
				</div>
				
			
				<div class="form-group">
				
					<input type="submit" value="Confirm" class="btn btn-primary">
				</div>
									
		</div>					
</fieldset>
</form>
						
			
				
</body>
</html>