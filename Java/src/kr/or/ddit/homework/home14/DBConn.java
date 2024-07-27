package kr.or.ddit.homework.home14;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	// jar 연동하고 conn 치면 다양한 보기가 뜬다.
	// jar파일에 있는 connection이라는 클래스가 있다.
	private static Connection conn;
	
	public static Connection getConnection() {
		String url  = "jdbc:oracle:thin:@localhost:8521/FREEPDB1";
		String user = "pc10"; // 본인 오라클 접속정보 입력
		String pwd  = "java";

		if(conn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	

}