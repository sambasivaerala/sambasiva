<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.title" /></title>
<link type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
<style>

body {
  background-color: #DCDCDC;
  
}

</style>
 <div class="container">
  <div class="row ">

   <div class= " col-sm-9" style="text-align: center;">
   
    <h2><spring:message code="label.heading"/></h2>
    <div class="row">
     <a href="?lang=en" style="padding-left: 20px" >English</a> <a href="?lang=fr" style="padding-left: 20px">French</a>
    <a href="?lang=vi" style="padding-left: 20px" >Vietnamese</a>
    
    </div>
     <br >
    <form class="form-horizontal" role="form" method="post" name="employeeForm" id="employeeForm">
     <div class="form-group"> 
      
      <label for="username" ><spring:message code="label.username" /></label>
       
      <div class="col-lg-4"><input type="text"  name="username" id="username" value="">
      </div>
     </div>
      <br >
     <div class="form-group">
      <label for="password" ><spring:message code="label.password" /></label>
      <div class="col-lg-4">
       <input type="password"  name="password" id="password" value="">
    <br >
      <button style="margin-top:10px " type ="button"><spring:message code="label.submit" /></button>
      
      </div>
     </div>     
    </form>
   </div>
  </div>
 </div>
</body>
</html>