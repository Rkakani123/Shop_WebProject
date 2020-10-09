<%@page import="Com.Model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Design1.css">
<title>Customer Details</title>
</head>
<body>
	<h1>Welcome To Super Mart</h1>
	<h4>Shop No.111, Near Mount Vellay, Fort, Mumbai - 13</h4>
	<hr color="white">	
	
	<form action="CustomerController" method="post">
		<div class="tab1"><b>Customer Id :-</b>
			<input type="number" name="cid" style="margin-left: 42px"></div>
		<div class="tab1"><b>Customer Name :-</b>
			<input type="text" name="cname" style="margin-left: 13px"></div>
		<div class="tab1"><b>Address :-</b>
			<input type="text" name="caddress" style="margin-left: 72px"></div>
		<div class="tab1"><b>Mobile No :-</b>
			<input type="number" name="cmob" style="margin-left: 60px"></div>
		<div class="tab1">
			<input type="submit" value="Next" style="margin-top: 25px; width: 100px; height: 30px;">
			<button style="margin-top: 25px; width: 100px; height: 30px; margin-left:157px; ">
				<a href="Product.jsp">Back</a>
			</button>
		</div>
		
	<br><hr color="white" style="margin-top: 15px;" >
	</form>
</body>
</html>