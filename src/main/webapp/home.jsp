<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>User Task Assign</h1>
<form action="adduser">
<table style="with: 80%">
  <tr>
<td>UserName</td>
<td><input type="text" title="username" name="username"/></td>
</tr>
</tr>
<td>Description</td>
<td><input type="text" title="description" name="description"></td>
</tr>
<tr>
<td>Date</td>
<td><input type="text" title="targetDate" name="target_date"/></td>
</tr>
<tr>
<td>Status</td>
<td><input type="text" title="status" name="is_done"></td>
</tr>
</table>
<input type="submit" onClick="gotoMsg()">
<input type="button" value="logout" onClick="/logout">
<input type="button" value="ViewallTasks" onClick="gotoShowlltasks()">
</form>
</div>
<script type="text/javascript">
function gotoShowlltasks()
{
    window.location.href="/showalltasks";
}
</script>
<script type="text/javascript">
function gotoMsg()
{
    alert("Data Submitted Successfully");
}

</script>

</body>
</html>