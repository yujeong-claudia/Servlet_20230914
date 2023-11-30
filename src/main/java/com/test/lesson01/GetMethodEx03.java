package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// add comment
		
		response.setCharacterEncoding("utf-8");
		//response.setContentType("text/plain");
		response.setContentType("text/json");
		
		// request parameter를 받아온다
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age")); // int로 변환
		
		PrintWriter out = response.getWriter();
//		out.println("결과");
//		out.println("user_id:" + userId);
//		out.println("name:" + name);
//		out.println("age:" + age);
		
		// {"user_id":"yjkim2", "name":"김유정", "age":27}
		out.print("{\"user_id\":\"" + userId + 
				"\", \"name\":\"" + name + 
				"\", \"age\":" + age + "}");
		
		
	}
}
