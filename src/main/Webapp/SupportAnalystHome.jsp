
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" type="text/css" href="/style.css"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>


<%
String userid =(String) session.getAttribute("username");
if(userid==null)
{
	response.sendRedirect("/supportanalyst/");
}
%>

	<div class="container-fluid">
<div class="row mainheader">
<div class="col-sm text-nowrap">

<div align="right">
<span class="userloginmessage"> <%=userid%></span><br>
 <a href="supportanalystlogout">Logout</a>
<div align="Center">
<h1>SRG</h1>
  </div>
</div>
 </div>
</div>
<div class="wrapper">
	<div class="Sidebar">
		<ul>
	    <li><a>Walmart</a></li>
	    <a  href="wr1">Walmart rpt1</a><br>
	    <a  href="wr2">Walmart rpt2</a>
	    
    <br>
    </ul>
 </div>
 </div>
 
</div>
<br>
<br>
 
</body>
</html>


    


    