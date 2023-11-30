package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// 한글 깨짐 방지- response header
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");

		//PrintWriter out = response.getWriter();
		//out.print("오늘의 날짜는 ");
		
		Date now = new Date();
		//out.println(now);
		// "오늘의 날짜는 2021년 5월 20일")
		
		//한번에 출력하는 게 더 간단하다!
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 dd일");
		PrintWriter out = response.getWriter();
		out.println(sdf.format(now));
	}
}
