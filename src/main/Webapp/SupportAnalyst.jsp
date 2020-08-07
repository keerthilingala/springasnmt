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


<div class="container-fluid">
<div class="row mainheader">
<div class="col-sm text-nowrap">

<span class="logo">Welcome</span>
</div>

<div class="col-sm">

<nav class="navbar navbar-expand-lg navbar-dark nav-default  navbarmenu">
  
  <button class="navbar-toggler navbutton" type="button" data-toggle="collapse" data-target="#menus" aria-controls="menus" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    
  </button>
  <div class="collapse navbar-collapse" id="menus">
    <div class="navbar-nav">
    <div align="center"> 
        <a href="admin">Admin </span></a>
      <a href="supportanalyst">User</a>
     
    </div>
  </div>
</nav>

</div>



</div>
<div class="row mainsection">
 <div class="col-sm">
 <span class="text-success">${message}</span>
<div align="center">   
<div class="card" style="width: 29rem;margin-top: 30px;border-radius: 10px;">
  
  <div class="card-body">
    <h5 class="card-title">User Registration</h5>
   <form:form action="supportanalystreg" method="post" modelAttribute="supportanalyst" onsubmit="return adminvalidation()">
   <div class="form-row">
   <div class="form-group col-md-6">
   <form:label path="firstName">First Name :</form:label>
   
   <form:input path="firstName" class="form-control input-sm" name="firstName" id="firstName"/>
   
   </div>
   
   
   <div class="form-group col-md-6">
   
   <form:label path="lastName">Last Name :</form:label>
   
   <form:input path="lastName" class="form-control input-sm" name="lastName" id="lastName"/>
   
   </div>
   </div>
   
   <div class="form-row">
   
   <div class="form-group col-md-6">
   <form:label path="analystId">User Name :</form:label>
   
   <form:input path="analystId" class="form-control input-sm" id="adminId" name="adminId"/>
   
   </div>
   
   
   <div class="form-group col-md-6">
   
   <form:label path="password">Password :</form:label>
   
   <form:password path="password" class="form-control input-sm" id="password" name="password"/>
   
   </div>
   
   
   <div class="form-group col-md-6">
   
   <form:label path="Conformpassword">Conformpassword :</form:label>
   
   <form:password path="Conformpassword" class="form-control input-sm" id="Conformpassword" name="password"/>
   
   </div>
   
   <div class="form-group col-md-6">
   
   <form:label path="contactNumber">Mobile Number :</form:label>
   
   <form:input path="contactNumber" class="form-control input-sm" id="contactNumber" name="contactNumber"/>
   
   </div>
   
   
   </div>
  
  
     <div class="form-row">
   
   <div class="form-group col-sm-12">
   
   
   <button class="btn btn-primary btn-lg">Register</button>
   
   
 
   </div>
   
   </div>
   
   </form:form> 
   

<span class="signup">Do you have Account?</span><a href="supportanalystlogin" class="signupbtn">Login</a>

  </div>
  
  </div>
   

 
</div>


</div>
</div>
</div>
<script src="validators.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>


    


    