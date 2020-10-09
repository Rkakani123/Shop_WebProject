<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Design1.css">
<title>Add To Cart</title>
</head>
<body>
	<h1>Welcome To Super Mart</h1>
	<h4>Shop No.111, Near Mount Vellay, Fort, Mumbai - 13</h4>
	<hr color="white">	
	
	<form action="ProductController" method="post">
	
	<div class="tab1"><b>Product Id :-</b>
		<input type="number" name="pid" style="margin-left: 45px"></div>
	<div class="tab1"><b>Product Name :-</b>
		<input type="text" name="pname" style="margin-left: 15px"></div>
	<div class="tab1"><b>Price :-</b>
		<input type="number" name="pprice" style="margin-left: 85px"></div>
	<div class="tab1"><b>Quantity :-</b>
		<input type="number" name="pqty" style="margin-left: 60px"></div>
	<div class="tab1">
		<input type="submit" value="Add To Cart" style="margin-top: 25px; width: 100px; height: 30px;">
		<button style="margin-top: 25px; width: 100px; height: 30px; margin-left:145px; ">
			<a href="Customer.jsp">Bill</a>
		</button>
	</div>
	
	</form>
	<br><hr color="white" style="margin-top: 15px;" >	
</body>
</html>