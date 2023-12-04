<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이변환</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>길이 변환</h1>
		<form method="post" action="/lesson02/quiz04_1.jsp">
			<div class="d-flex align-items-end">
				<input type="text" class="form-control col-3 mr-2" name="number" placeholder="cm를 입력하세요.">
				<div>cm</div>
			</div>
			
			<div class="mt-2">  
				<label for="in">인치</label>
				<input type="checkbox" id="in" name="length" value="인치">
				<label for="yd">야드</label>
				<input type="checkbox" id="yd" name="length" value="야드">
				<label for="ft">피트</label>
				<input type="checkbox" id="ft" name="length" value="피트">
				<label for="m">미터</label>
				<input type="checkbox" id="m" name="length" value="미터">
				<br>
				<input type="submit" value="변환하기" class="form-control btn btn-success col-2">
			</div>
		</form>
	</div>	
</body>
</html>