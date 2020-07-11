<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College List</title>
<%@ include file="header.jsp" %>
</head>
<body>
<div>
<a href="add_college">Add College</a>
</div>


<c:if test="${!empty colleges }">
<table class="table table-striped">
	<thead>
	<tr>
		<th>SN</th>
	   <th>College Id</th>
	   <th>College Name </th>
	   <th>Password </th>
	   <th>College Email </th>
	   <th>Date of Establishment</th>
	   <th>College Phone Number</th>
	   <th>College Address</th>
	   <th>College Photo</th>
	   <th>College Courses</th>
	   <th>Actions</th>
	   
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${colleges}" var="college" varStatus="i">
	<tr>
	<td>${i.count}</td>
	<td>${college.collegeId }</td>
	<td>${college.collegeName }</td>
	<td>${college.passWord }</td>
	<td>${college.collegeEmail }</td>
	<td>${college.dateofEstablishment }</td>
	<td>${college.collegePhoneno }</td>
	<td>${college.collegeAddress} </td>
	<td><img src="image_display?id=${college.collegeId }" width="50px" height="50px" alt="no pic"/></td>
	<td>${college.collegeCourses} </td>
	<td><a href="edit_college?id=${college.collegeId}">Edit</a>|<a href="delete_college?id=${college.collegeId }">Delete</a></td>
	
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

</body>
</html>