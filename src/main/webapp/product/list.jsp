<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/22/2022
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Product</h1>
    <p>
        <a href="/products?action=create">Create new product</a>
    </p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>productprice</td>
        <td>describe</td>
        <td>producer</td>
        <td>Edit</td>
        <td>Detele</td>
    </tr>
    <c:forEach items='${requestScope["product"]}' var="products">
        <tr>
            <td><a href="/products?action=view&id=${products.getId()}">${products.getName()}</a></td>
            <td>${products.getProductprice()}</td>
            <td>${products.getDescribe()}</td>
            <td>${products.getProducer()}</td>
            <td><a href="/products?action=edit&id=${products.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${products.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
