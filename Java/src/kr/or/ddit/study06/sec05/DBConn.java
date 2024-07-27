package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	// jar 연동하면 conn 치면 다양한 보기가 뜸! jar파일에 있는 connection이라는 클래스가 있따.
	private static Connection conn;
	
	public static Connection getConnection() {
		// local host 내 아이피 ipconfig에서 확인가능함
		// 8521이란!
		// docker란? 컨테이너?
		// 윈도우 깔고 자바도 깔고 설치하기 불편함. 다 깔아진 상태의 파일을 묶어서 처리
		// 윈도우 + 한글 + 자바 설치를 컴 설치시마다 실행하고싶은겨 귀찮지 여러대 계속설치하기가
		// 이걸 묶어서 패키징된걸 설치해서 쓸 수 있는 게 도커이다.
		// 자바 1.81v 업데이트로 1.81을 못구하면 찾으러 다녀서 세팅하거나 1.82도 되는지 보고
		// 안되기도 하니 버전 통일이 좋다.
		// tomcat 8버전.. 버전별로 세팅함 묶어서 설치시 얘만 실행하면 웹사이트 자동으로 실행
		// 이 도커는 오라클이 설치된 상태의 도커이다.
		// 오라클이 설치된 상태를 묶은게 이 도커이ㅏㄷ.
		
		// 하나의 컴퓨터를 내 컴에 설치한거랑 같음
		// 가상머신, 폰게임을 컴퓨터에서 하는 그런 느낌 (가상머신)
		// cd를 없지만 가상으로 올리는 것 . 가상머신은 죄다 도커는 아님. vm option 활성화 하면 가상머신을 사용가능
		// 가상머신 사용방법 중 하나  = 도커
		// 도커는 포맷 안해도 삭제하고 다시 넣으면 됨. 
		// 갱당이 펼리함
		
		// 도커가 가볍기 때문에 좋다.
		// 아이피 건물주소 포트 상세주소
		// 실제 통신 주고받는건 포트에서 주고받는다.
		// 건물주소, 포트(401호)
		// 이 컴터에는 아이피랑 포트가 존재하는데, 얘도 컴퓨터이기에 아이피랑 포트가 있다.
		// 로컬호스트는 내 아이피
		// a로컬호스트 외치면 b아이피를 줌
		// 랜선 꽂으면 가상으로 아이피를 하나 더 만들음
		// ipconfig하면 가상 아이피가 하나 더 나옴
		// 로컬 1521과 8522를 연결시킴
		// 내컴퓨터 8522랑 b컴퓨터의 1521이랑 1대1로 매핑시킨다.
		// 버전들고와서 그 상태로 저장해두는게 도커다
		
		
		//xe가 아니라 서비스 이름으로 바꾸기 freepdb1
		// xe : 서비스 이름/
		String url  = "jdbc:oracle:thin:@localhost:8521/FREEPDB1";
		String user = "pc10"; // 본인 오라클 접속정보 입력
		String pwd  = "java";
		// 싱글톤과 같은 패턴
		// 접속을 한개만 허용할 수 있다.
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