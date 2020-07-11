<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
<%@ include file="header.jsp" %>
</head>
<body>
<div>
<a href="add_student">Add Student</a>
</div>


<c:if test="${!empty students }">
<table class="table table-striped">
	<thead>
	<tr>
		<th>SN</th>
	   <th>Student Id</th>
	   <th>Student Name </th>
	   <th>Student Email </th>
	   <th>Date of Birth</th>
	   <th>Student Phone Number</th>
	   <th>Student Address</th>
	   <th>Student Documents</th>
	   <th>Student Process Status</th>
	   <th>Actions</th>
	   
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${students}" var="student" varStatus="i">
	<tr>
	<td>${i.count}</td>
	<td>${student.studentId }</td>
	<td>${student.studentName }</td>
	<td>${student.studentEmail }</td>
	<td>${student.dateofBirth }</td>
	<td>${student.studentPhoneno }</td>
	<td>${student.studentAddress} </td>
	<td>${student.studentDocuments} </td>
	<td>${student.studentProcessStatus} </td>
	<td><a href="edit_student?id=${student.studentId}">Edit</a>|<a href="delete_student?id=${student.studentId }">Delete</a></td>
	
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

</body>
</html>