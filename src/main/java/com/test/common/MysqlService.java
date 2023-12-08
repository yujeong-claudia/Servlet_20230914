package com.test.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	private static MysqlService mysqlService = null;
	
	// 도메인 뒤에 접속할 데이터베이스명까지 적는다.
	private static final String url = "jdbc:mysql://localhost:3306/test_230914";
	private static final String id = "root";
	private static final String password = "root";
	
	private Connection conn = null;
	private Statement statement;
	private ResultSet res;
	
	// Singleton 패턴: MysqlService 라는 객체가 단 하나만 생성되도록 하는 디자인 패턴
	// 	DB 연결을 여러 객체에서 하지 않도록
	public static MysqlService getInstance() {
		if (mysqlService == null) {
			mysqlService = new MysqlService();
		}
		
		return mysqlService;
	}
	
	// DB 접속
	public void connect() { //try-catch 내가 책임진다는 뜻의 예외처리
		try {
			// 1. 드라이버를 메모리에 로딩한다.
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			// 2. DB Connection
			conn = DriverManager.getConnection(url, id, password);
			
			// 3. 쿼러 실행 준비 => statement
			statement = conn.createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// DB 연결 해제
	public void disconnect() {
		try {
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// CUD 
	// cud를 하다가 에러가 떴다면 예외처리를 위로 던진다.
	// 나한테 요청한 쪽이 잘못한 것
	public void update(String query) throws SQLException { 
		statement.executeUpdate(query);
	}
	
	// R
	// 에러뜰시 쿼리문을 작성한 사람이 잘못이므로 예외처리를 위로 던진다.
	public ResultSet select(String query) throws SQLException {
		res = statement.executeQuery(query);
		return res;
	}
}
