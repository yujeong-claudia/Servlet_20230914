package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01_delete")
public class DeleteQuiz01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// request parameter 가 id인 것을 받아온다
		int id = Integer.valueOf(request.getParameter("id"));
				
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// DB 삭제쿼리
		String deleteQuery="delete from `bookmark` where `id` = " + id;
		try {
			ms.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		// DB 연결해제
		ms.disconnect();
		
		// 출력 화면으로 302 redirect => 200ok
		response.sendRedirect("/lesson04/quiz01/quiz01.jsp");
	}
}
