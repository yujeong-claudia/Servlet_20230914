package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex02_insert")
public class InsertEx02 extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 응답을 직접 내리지 않기 때문에 response header에 세팅하는 content type 과정 생략
		
		// 사용자 정보 request params 꺼내기
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance(); //객체일뿐
		ms.connect(); // 연결을 따로 해줘야함, 실질적인 DB연결, 꼭 있어야한다.
		
		// DB Insert 쿼리수행
		String insertQuery="insert into `new_user`"
				+ "(`name`, `yyyymmdd`, `email`, `introduce`)"
				+ "values"
				+ "('" + name + "', '" + yyyymmdd
				+ "', '" + email + "', '" + introduce + "')";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB 연결 해제
		ms.disconnect();
		
		// 사용자 목록 화면으로 이동 => Redirect 302번호로 내려오게 됨
		response.sendRedirect("/lesson04/ex02/ex02_1.jsp"); //예외처리 위로 던진다.
		
	}
}
