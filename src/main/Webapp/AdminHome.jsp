<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" type="text/css" href="/style.css"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


</head>
<body>

<c:set var="income" scope="request" value="${sa}"/>
<%
String userid =(String) session.getAttribute("name");
if(userid==null)
{
	response.sendRedirect("/admin/");
}
%>


<div class="container-fluid">
<div class="row mainheader">
<div class="col-sm text-nowrap">

<div align="right">
 <span class="userloginmessage"><%=userid%></span><br>
 <a  href="adminLogout">Logout</a>
<div align="Center">
<h1>SRG</h1>
  </div>
 </div>
</div>
    </div>

<div class="wrapper">
	<div class="Sidebar">
	<ul>

    <li><a  href="role1">Role</a></li>
    <li><a  href="user1">User</a></li>
    <li><a  href="dash1">Dashboard</a></li>
    <li><a>Walmart</a></li>
    <a  href="walmart1">Walmart rpt1</a><br>
    <a  href="walmart2">Walmart rpt2</a>
    <li><a>Target</a></li>
    <a  href="trpt1">Target rpt1</a><br>
    <a  href="trpt2">Target rpt2</a>
    <br>
    </ul>
 </div>
</div>
</div>
</div>
 </div>
 


</body>
</html>


    


    