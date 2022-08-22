<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/22/2022
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>productprice: </td>
        <td>${requestScope["product"].getProductprice()}</td>
    </tr>
    <tr>
        <td>describe: </td>
        <td>${requestScope["product"].getDescribe()}</td>
    </tr>
    <tr>
        <td>producer: </td>
        <td>${requestScope["product"].getProducer()}</td>
    </tr>
</table>
</body>
</html>
