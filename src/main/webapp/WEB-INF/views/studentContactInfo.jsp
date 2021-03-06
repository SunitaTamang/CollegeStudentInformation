<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Personal Info </title>
<%@ include file="studentHeader.jsp" %>
</head>
<body>

<c:if test="${!empty students }">
<table class="table table-striped">
	<thead>
	<tr>
		<th>SN</th>
	   <th>Student Id</th>
	   <th>Student Name </th>
	   <th>Student Email </th>
	   <th>Student Phone Number</th>
	   <th>Student Address</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${students}" var="student" varStatus="i">
	<tr>
	<td>${i.count}</td>
	<td>${student.studentId }</td>
	 <td>${student.studentName }</td>
	 <td>${student.studentEmail }</td>
	<td>${student.studentPhoneno }</td>
	<td>${student.studentAddress} </td>
	
	
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

</body>
</html>