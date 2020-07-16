<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Name</title>
<%@ include file="studentHeader.jsp" %>
</head>
<body>

<c:if test="${!empty students }">
<table class="table table-striped">
	<thead>
	<tr>
		<th>SN</th>
	   <th>Student Name </th>
	   
	   
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${students}" var="student" varStatus="i">
	<tr>
	<td>${i.count}</td>
	<td>${student.studentName }</td>
	
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

</body>
</html>