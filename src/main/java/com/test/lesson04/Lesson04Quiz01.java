package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Lesson04Quiz01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 응답값 plain
		response.setContentType("text/plain");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance(); //그냥 객체를 들고 온 것
		ms.connect(); // 실질적인 연결코드. (꼭 넣어야함!!!!!!!)
	
		// DB 인서트
		String insertQuery = "insert into `real_estate`\r\n"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)\r\n"
				+ "values\r\n"
				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, null)";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 셀렉트 & 출력
		PrintWriter out = response.getWriter();
		String selectQuery = "select `address`, `area`, `type` from `real_estate` \r\n"
				+ "order by `id` desc \r\n"
				+ "limit 10;";
		try {
			ms.select(selectQuery);
			ResultSet res = ms.select(selectQuery);
			while (res.next()) {
				String address = res.getString("address");
				int area = res.getInt("area");
				String type = res.getString("type");
				out.println("매물 주소:" + address + ", 면적:" + area + ", 타입:" + type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// DB 연결 해제
		ms.disconnect(); 
		
	}// doGet
	
}// class