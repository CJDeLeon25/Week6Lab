<%-- 
    Document   : shoppingList
    Created on : 25-Oct-2020, 1:59:58 PM
    Author     : 798676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <h3>Hello, ${username} <a href="
        <c:url value = 'ShoppingList?action=logout'/>">Logout<a/> </h3>
        <h2>List</h2>
        <form method = "post">
            Add item:<input type ="text" name ="item"> <input type ="submit" value = "Add"><br>
            <input type ="hidden" value ="add" name ="action"> 
            <c:forEach items = "${itemList}" var = "item">
                <tr>
                    <td>${item}</td>
                    
                </tr>
            </c:forEach>
        </form>
        
    </body>
</html>
