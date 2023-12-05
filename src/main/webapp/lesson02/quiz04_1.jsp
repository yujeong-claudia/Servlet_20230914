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
	int number = Integer.valueOf(request.getParameter("number"));
	String[] lengthArr = request.getParameterValues("length");
	
	%>
	
	<%
	String result = "";
	if (result != null) {
		for (String length : lengthArr) {
			if (length.equals("in")) {
				double in = number / 2.54;
				result += in + "in"+ "<br>";
			}
			if (length.equals("yd")) {
				double yd = number / 91.44;
				result += yd + "yd" + "<br>";
			}
			if (length.equals("ft")) {
				double ft = number / 30.48;
				result += ft + "ft" + "<br>";
			}
			if (length.equals("m")) {
				double m = number / 100.0;	
				result += m + "m" + "<br>";
			}
			
		}
	}
	
	
	%>
	
	<div class="container">
		<h2>길이 변환 결과</h2>
		<b><%= number %>cm</b>
		<hr>
		<b> <%= result %></b>
		<br>
	</div>
	
</body>
</html>