
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<jsp:include page="CommonHeader.jsp"></jsp:include>
<head></head>
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