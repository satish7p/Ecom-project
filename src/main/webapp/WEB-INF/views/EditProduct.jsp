<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Edit Product</h1>  
           <form:form method="POST" action="update">    
            <table >    
            <tr>  
            <td></td>    
             <td><form:hidden  path="pid" /></td>  
             </tr>   
             <tr>    
              <td>Product Name : </td>   
              <td><form:input path="pname"  /></td>  
             </tr>   
             <tr>
             <td>Product Availability : </td>   
              <td><form:input path="availability"  /></td>  
             </tr>    
             <tr>    
              <td>Product Description :</td>    
              <td><form:input path="pdesc" /></td>  
             </tr>   
             <tr>   
             <tr>    
              <td>Product Brand :</td>    
              <td><form:input path="pbrand" /></td>  
             </tr> 
              <tr>    
              <td>Product Rate:</td>    
              <td><form:input path="prate" /></td>  
             </tr>   
             
             <tr>    
              <td> </td>    
              <td><input type="submit" value="update" /></td>    
             </tr>    
            </table>    
           </form:form>    

</body>
</html>

    
           

