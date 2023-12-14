<%@page import="java.sql.ResultSet"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>
</head>
<body>
	<% 	
		// DB 연결
		// import해줘야함
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// select DB
		String query = "select * from `bookmark`";
		// ResultSet도 import
		ResultSet result = ms.select(query);
	%>
	<div class="container font-weight-bold">
		<h1>즐겨찾기 추가</h1>
		<form method="post" action="/lesson04/quiz01_insert">
			<label for="name">사이트명:</label>
			<input type="text" class="form-control col-3 mb-3" id="name" name="name">
			<label for="address">사이트 주소:</label>
			<input type="text" class="form-control col-7" id="address" name="address">
			
			<input type="submit" value="추가" class="btn btn-success mt-3">	
		</form>
	</div>

</body>
</html>