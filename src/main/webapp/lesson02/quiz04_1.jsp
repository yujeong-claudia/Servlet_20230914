<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<%
	int in = Integer.valueOf(request.getParameter("in"));
	int yd = Integer.valueOf(request.getParameter("yd"));
	int ft = Integer.valueOf(request.getParameter("ft"));
	int m = Integer.valueOf(request.getParameter("m"));
	String[] lengthArr = request.getParameterValues("length");
	
	%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		
		<hr>
		
	</div>
	
</body>
</html>