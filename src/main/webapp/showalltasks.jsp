<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"
       uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<div align="center">
  <h1>Todo List</h1> </div>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
</head>
<div align="center">
<body style="background-color:#F0F3F4;">
				<c:set var="count" value="0" scope="page" /><br>
				<table border="1" style="border: 1px solid black;">
					<tr>
						<th>TaskID</th>
						<th>Username</th>
						<th>Description</th>
						<th>Status</th>
						<th>Target Date</th>
						<th>Modify</th>
					</tr>
			<c:choose>
				<c:when test="${not empty showalltasks}">
				<c:forEach var="thetask" items="${showalltasks}">
				<c:set var="count" value="${count + 1}" scope="page"/>
					<tr>
						<td>${thetask.userid}</td>
						<td> ${thetask.username} </td>
						<td> ${thetask.description} </td>
						<td> ${thetask.is_done} </td>
						<td> ${thetask.target_date} </td>
						<td> <a href="updatetask/${thetask.userid}"
						onclick="updatetask/${thetask.userid}">Update</a> |
						 <a href="${pageContext.request.contextPath}/deletetask/${thetask.userid}" onclick="return confirm('Are you sure you want to delete ${thetask.userid}">Delete</a>
						  |<a href="${pageContext.request.contextPath}/adduser" onclick="/adduser">AddTask</a></td>
					</tr>
				</c:forEach>
				</c:when>
				<c:otherwise>
					<center><h1>No Task Found.</h1></center>
				</c:otherwise>
			</c:choose>
</table>
<br><br>
<a href="${pageContext.request.contextPath}/adduser" onclick="/adduser">Go Home</a> </td>
	</div>
<br> <br> <br>
	</section>
</body>
</html>