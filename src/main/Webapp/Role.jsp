<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<div class="container-fluid">
<div class="row mainheader">
<div class="col-sm text-nowrap">

</div>
</div>
</div>
</head>

<body>
<div class="header"/>

</div>

<div align="center"><br><br>
<h2>Role</h2>
<form:form onsubmit="return validate()" action="roles" modelAttribute="role" method="post">
<table border="1">
<tr>
</tr>
<th>Role Name</th><th>List Name</th><th>Is Admin</th></th>
<tr>
<td>SRG</td>
<td>-</td>
<td>Yes</td>
</tr>
<tr>
<td>Walmart Role Name</td>
<td>Walmart</td>
<td>No</td>
</tr>
<tr>
<td>Walmart Insurance</td>
<td>Walmart Insurance</td>
<td>No</td>
</tr>
<tr>
<td>Target Role Name</td>
<td>Target</td>
<td>No</td>
</tr>
</table>

</div>
<br>
<br>
<tr>
<div align="center">
<a href="AdminHome.jsp">Back</a>
</form:form>
</div>
<br><br>
${message }
<%
RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
rd.include(request,response);
%>
</body>
</html>