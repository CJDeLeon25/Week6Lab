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
        <h3>Hello,${username}</h3>
        <h2>List</h2>
        <form action = "post">
            Add item:<input type ="text" name ="item"> <input type ="submit" value = "Add"><br>
            <input type ="hidden" value ="add" name ="action"> 
           
        </form>
        
    </body>
</html>
