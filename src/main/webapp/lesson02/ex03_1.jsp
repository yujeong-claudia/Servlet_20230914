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
		String nickname = request.getParameter("nickname");
		String hobby = request.getParameter("hobby");
		String animal = request.getParameter("animal");
		String fruit = request.getParameter("fruit");
		String[] foodArr = request.getParameterValues("food"); //여러개가 넘어오는 경우
	%>
	
	<table border="1">
		<tr>
			<th>별명</th> <!-- 제목칸 -->
			<td><%= nickname %></td> <!-- 일반칸 -->
		</tr>
		<tr>
			<th>취미</th> <!-- 제목칸 -->
			<td><%= hobby %></td> <!-- 일반칸 -->
		</tr>
		<tr>
			<th>선호하는 동물</th> <!-- 제목칸 -->
			<td><%= animal %></td> <!-- 일반칸 -->
		</tr>
		<tr>
			<th>좋아하는 과일</th> <!-- 제목칸 -->
			<td><%= fruit %></td> <!-- 일반칸 -->
		</tr>
		<tr>
			<th>선호하는 음식</th> <!-- 제목칸 -->
			<td><%-- <%= foodArr --%>
			
			<%	
				String result = "";
				if (foodArr != null) {
					for (String food : foodArr) {
						result += food + ",";
					}
					// 마지막에 붙어있는 콤마를 제거하겠다
					result = result.substring(0, result.length() - 1);
					out.print(result);
				}
			%>
			
			</td> <!-- 일반칸 -->
			
		</tr>
	</table>
</body>
</html>