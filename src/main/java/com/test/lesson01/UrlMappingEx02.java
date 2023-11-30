package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex02") //xml에 이미 있는 거 쓰지않기, /로 시작 주소맵핑
public class UrlMappingEx02 extends HttpServlet {
	
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();// 위로 던진다
		// 서블릿(Servlet) : 자바 + html
		// 1 ~ 10 합계 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		// 합계: <b>결과값</b>
		out.println("<html><head><title>합계:</title></head><body>");
		out.print("합계: <b>" + sum + "</b>");
		out.print("</body></html>");
	}
}
