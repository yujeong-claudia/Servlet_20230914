package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지- response header
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");

		//out.print("현재 시간은 ");
				
		Date now = new Date();
		//out.println(now);
		
		//한줄로 간단하게!
		SimpleDateFormat sdf = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		PrintWriter out = response.getWriter(); //예외처리 위로 던지기
		out.println(sdf.format(now));
		
	}
}
