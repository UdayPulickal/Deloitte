<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"
       uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<div align="center">
  <h1>Update Tasks</h1> </div>
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

					<tr>
<form:form action = "saveuser">
						<td><input type="text" name="userid" value=${userupdate.get().userid}></td>
						<td><input type="text" name="username" value=${userupdate.get().username}></td>
						<td><input type="text" name="description" value=${userupdate.get().description}></td>
						<td><input type="text" name="is_done" value=${userupdate.get().is_done}></td>
						<td><input type="text" name="target_date" value=${userupdate.get().target_date}></td>
				    <td><a type="submit" href="${pageContext.request.contextPath}/saveuser" onclick="/saveuser">Update</a></td>
					</tr>
</form:form>
</table>
<br><br>
<a href="${pageContext.request.contextPath}/adduser" onclick="/adduser">Go Home</a> </td>
	</div>
<br> <br> <br>
	</section>
</body>
</html>