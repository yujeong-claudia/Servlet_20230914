 package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01_insert")
public class InsertQuiz01 extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 사용자 정보 request params 꺼내기
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance(); //객체일뿐
		ms.connect(); // 연결을 따로 해줘야함, 실질적인 DB연결, 꼭 있어
		
		// DB Insert 쿼리수행
		String insertQuery="insert into `bookmark`"
	 			+ "(`name`, `address`)"
				+ "values"
				+ "('" + name + "', '" + address + "')";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 해제
		ms.disconnect();
		
		// 사용자 목록 화면으로 이동 => Redirect 302번호로 내려오게 됨
		response.sendRedirect("/lesson04/quiz01/quiz01.jsp"); //예외처리 위로 던진다.
		
	}
}
