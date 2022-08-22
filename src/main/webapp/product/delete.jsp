<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/22/2022
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
