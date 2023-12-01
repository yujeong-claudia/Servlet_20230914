<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<!-- HTML 주석 -->
	<%-- JSP 주석 --%>
<%
	// 자바문법 시작
	// scriptlet (스프링에서는 쓰면 안된다)
	
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
	}
%>	
	<b>합계:</b>
	<input type="text" value="<%= sum %>"> 
	<br>
	
<%! 
	// 선언문 - 클래스 같은 느낌
	
	// 필드
	private int num = 100;
	
	// 메소드
	public String getHelloWorld() {
		return "Hello world";
	}
%>

<%= getHelloWorld() %><br>
<%= num + 20 %>	

<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
%>
</body>
</html>