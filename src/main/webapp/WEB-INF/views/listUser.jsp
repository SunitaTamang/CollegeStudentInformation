<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<%@ include file="header.jsp" %>
</head>
<body>
<div>
<a href="add_user">Add Student</a>
</div>
<div>
<h1>User List</h1>
</div>
<c:if test="${!empty users }">
<table class="table table-striped">
	<thead>
	<tr>
	   <th>SN</th>
	   <th>Id</th>
	   <th>User Name </th>
	   <th>Password </th>
	   <th> Gender</th>
	   <th> Hobbies</th>
	   <th> Email </th>
	   <th> Verification Type </th>
	   <th> DOB</th>
	   <th> Mobile Number</th>
	   <th>Address</th>
	   <th>Photo</th>
	   <th>Actions</th>
	   
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${users}" var="user" varStatus="i">
	<tr>
	<td>${i.count}</td>
	<td>${user.id }</td>
	<td>${user.userName }</td>
	<td>${user.passWord }</td>
	<td>${user.gender }</td>
	<td>${user.hobbies }</td>
	<td>${user.email }</td>
	<td>${user.verificationType }</td>
	<td>${user.dob }</td>
	<td>${user.mobileNo }</td>
	<td>${user.address.cityName},${user.address.countryName} </td>
	<td><img src="image_display?id=${user.id }" width="50px" height="50px" alt="no pic"/></td>
	<td><a href="edit_user?id=${user.id }">Edit</a>|<a href="delete_user?id=${user.id }">Delete</a></td>
	
	</tr>
	
	
	</c:forEach>
	
	</tbody>
</table>
</c:if>

</body>
</html>