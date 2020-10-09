<%@page import="Com.Model.Customer"%>
<%@page import="Com.Model.Product"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Design1.css">
<title>Billing Page</title>
</head>
<body>

<h1>Welcome To Super Mart</h1>
<h4>Shop No.111, Near Mount Vellay, Fort, Mumbai - 13</h4>
<hr color="white">	

<div class="tab3" style="margin-left: 560px;">
	<h3>Customer Id :-<c:out value="${requestScope.Bill.cId}"/><br>
	Customer Name :-<c:out value="${requestScope.Bill.cName}"/><br>
	Address :-<c:out value="${requestScope.Bill.cAddress}"/><br>
	Mobile No. :-<c:out value="${requestScope.Bill.cMob}"/></h3><br>
</div><br><br>

<table align="center" bgcolor="white" border="1">
<tbody>
<tr><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th><th>Amount</th></tr>
<c:forEach items="${requestScope.Bill.lst}" var="bill">
<tr><td><c:out value="${bill.prodId}"></c:out></td>
<td><c:out value="${bill.prodName}"></c:out></td>
<td><c:out value="${bill.prodPrice}"></c:out></td>
<td><c:out value="${bill.prodQty}"></c:out></td>
<td><c:out value="${bill.prodAmt}"></c:out></td></tr>
</c:forEach>
</tbody>
</table><br><hr color="white">

<form action="PayController">
	<center><input type="submit" value="Buy"></center>
</form>
</body>
</html>
