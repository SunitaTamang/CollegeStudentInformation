<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix ="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Edit Form</title>
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
							<form action ="update_student" method="post" class="form-horizontal">
								<fieldset>
									<legend>Student Edit Form</legend>
										<div class="form-group">
											<label>StudentId</label>
											<input type="text" name="studentId" readonly="readonly" value="${student.studentId }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>Student Name</label>
											<input type="text" name="studentName" value="${student.studentName }" class="form-control">
										</div>
				
										<div class="form-group">
											<label>Student Email</label>
											<input type="email" name="studentEmail" value="${student.studentEmail }" class="form-control">
										</div>
										
										<div class="form-group">
											<label>Student Phone Number</label>
											<input type="number" name="studentPhoneno" value="${student.studentPhoneno }" class="form-control">
										</div>
										
										<div class="form-group">
											<label>Date of Birth</label>
											<input type="date" name="dateofBirth" value="${student.dateofBirth }" class="form-control">
										</div>
											
											<div class="form-group">
											<label>Student Address</label>
											<input type="text" name="studentAddress" value="${student.studentAddress }" class="form-control">
										</div>
											
									
									<div class="form-group">
											<label>Student Documents</label>
											<input type="checkbox" name="studentDocuments" value="Passport" class="form-check"
											<c:if test="${fn:contains(student.studentDocuments, 'Passport')}" >checked</c:if> 
												>Passport
											<input type="checkbox" name="studentDocuments" value="Bank_Statement" class="form-check"
											<c:if test="${fn:contains(student.studentDocuments, 'Bank_Statement')}" >checked</c:if> 
												 >Bank Statement
												 <input type="checkbox" name="studentDocuments" value="Property_Statement" class="form-check"
											<c:if test="${fn:contains(student.studentDocuments, 'Property_Statement')}" >checked</c:if> 
												 >Property Statement
										</div>
											
										<div class="form-group">
											<label>Student Documents</label>
											<select name ="studentProcessStatus" class="form-control">
												<option value="Processing"${student.studentProcessStatus=='Processing'?'checked':''}>Processing</option>
												<option value="ProcessCompleted"${student.studentProcessStatus=='ProcessCompleted'?'checked':''}>Process Completed</option>
												
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