<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<%
	int number = Integer.valueOf(request.getParameter("number"));
	String[] lengthArr = request.getParameterValues("length");
	
	%>
	
	
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h3><%= number %>cm</h3>
		<hr>
		<h2>
		<%
			for (String length : lengthArr) {
				if (length.equals("in")) {
					double in = number * 0.393701;
					out.print(in + "in"+ "<br>");
					//result += in + "in"+ "<br>";
				} else if (length.equals("yd")) {
					double yd = number * 0.0109361;
					out.print(yd + "yd"+ "<br>");
					//result += yd + "yd" + "<br>";
				} else if (length.equals("ft")) {
					double ft = number * 0.0328084;
					out.print(ft + "ft"+ "<br>");
					//result += ft + "ft" + "<br>";
				} else if (length.equals("m")) {
					double m = number / 100.0;	
					//result += m + "m" + "<br>";
					out.print(m + "m"+ "<br>");
				}
				
			}
		
		%>
		</h2>
		<br>
	</div>
	
</body>
</html>