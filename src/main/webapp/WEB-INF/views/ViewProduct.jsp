
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<jsp:include page="CommonHeader.jsp"></jsp:include>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<br>
<br>
<br>
<br>
<div style="margin:60px">
<h1>List of Items</h1>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="15%">Product ID</th>
<th width="15%">Product Name</th>
<th width="10%">Product Brand</th>
<th width="10%">Product Description</th>
<th width="10%">Product Rate</th>
<th width="10%">Product Availability</th>
<th width="10%">Action</th>
</tr>
</thead>
<tbody>
<div class="my-nav">
         <div class="navbar navbar-default navbar-fixed-top scrollspy_menu mnav navbar__initial" role="navigation">
            <div class="container">
               <div class="navbar-header mnav">
                  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                  <a class="navbar-brand mnav" href="#"><i class="fa fa-pied-piper-alt"></i> Brand <i class="fa fa-pied-piper-pp"></i></a> 
               </div>
               <div class="navbar-collapse collapse">
                  <ul class="fullpage__nav nav navbar-nav navbar-right mnav">
                     <li><a href="#home">Home</a></li>
                     <li><a href="Register">Register</a></li>
                     <li><a href="#service">Our Services</a></li>
                     <li><a href="#product">Products</a></li>
                     <li><a href="#portfolio">Portfolio</a></li>
                     <li><a href="#plan">Your Account</a></li>
                     <li><a href="#contact">Contact Us</a></li>
                      <li><a href="Product">Add </a></li>
                  </ul>
               </div>
               <!--/.nav-collapse --> 
            </div>
         </div>
      </div>
<c:forEach var="list" items="${lists}">
<tr>
    <td><c:out value="${list.pid}"/></td>
    <td><c:out value="${list.pname}"/></td>
    <td><c:out value="${list.pbrand}"/></td>
    <td><c:out value="${list.pdesc}"/></td>
    <td><c:out value="${list.prate}"/></td>
    <td><c:out value="${list.availability}"/></td>
    <td>
 
 

 
<form method="get" action="EditProduct/${list.pid}">
  <button type="submit"  class="link-button">
Edit
  </button>
</form>
<form method="post" action="delete/${list.pid}" >
  <button type="submit"  class="link-button">
Delete
  </button>
</form>

    </td>
</tr>
</c:forEach>
</tbody>
</table>
</div>