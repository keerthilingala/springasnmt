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
<div align="center">
<br><br>
<h2>User</h2>
<table border="1">
<tr>
<th>Name</th><th>Password</th><th>Role</th></tr><tr>
<td>SRG User2</td>
<td>**Password**</td>
<td>SRG</td>
</tr>
<tr>
<td>SRG User1</td>
<td>**Password**</td>
<td>SRG</td>
</tr>
<tr>
<td>Walmart User1</td>
<td>**Password**</td>
<td>Walmart Role Name</td>
</tr>
<tr>
<td>Walmart User2</td>
<td>**Password**</td>
<td>Walmart Role Name</td>
</tr>
<tr>
<td>Target User1</td>
<td>**Password**</td>
<td>Target Role Name</td>
</tr>
</table>

</div>
<br>
<br>
<tr>
<div align="center">
<a href="AdminHome.jsp" >Back</a>

</div>
<br><br>
${message }
<%
RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
rd.include(request,response);
%>
</body>
</html>