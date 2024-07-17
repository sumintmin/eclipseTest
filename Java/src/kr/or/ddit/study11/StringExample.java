package kr.or.ddit.study11;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;

public class StringExample {

	// 프로그램은 데이터다
	// 데이터는 문자로 표현할 수 있다
	// 데이터들을 어떻게 쪼개느냐가 프로그램이다.
	// parser를 만든다고할 수도 있다.
	// db는 내부적으로 바이트코드가 들어가는데 그걸 쪼개고 쪼개는게 파싱이고
	// 프로그램은 데이터를 주고받고 그걸 쪼개는 과정이다.
	public static void main(String[] args) {
		StringExample se = new StringExample();
		// 클래스 이름이 StringExample이니까  SE하고 ctrl space 하면 자동완성됨
		// ex) SDF ctrl space -> string date format 됨
		se.process();
		
	}
	
	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();	
//		method6();
//		method7();
//		method8();
	}
	

	
	public void method8() {
		
		String abc = "abcdefg";
		System.out.println(abc.substring(3));
		System.out.println(abc.substring(3, 5));
		
		
		
	}
	
	public void method7() {
		System.out.println("계속 하시겠습니까?(y/n)");
		String yn = "Y";
		// toLowercase 해도되고 equals ignorecase해도 됨 대소문자 상관없이 y로 바꾸겠다~
//		yn = yn.toLowerCase();
//			if(yn.equals("y")) {
			
		if(yn.equalsIgnoreCase("y")) {
			System.out.println("진행");
		}
		if(yn.equalsIgnoreCase(yn, "y"));
		
		if(yn.equals("n")){
			System.out.println("종료");
		}
	
	}
	
	public boolean equalsIgnoreCase(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.equals(str2)) return true;
		return false;
		
	}
	
	
	public void method6() {
//		String test = "abcd";
		String test = "Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.";
		
		test = test.toLowerCase();
		
//		if(test.contains("Unless") || test.contains("unless")) {
		if( test.contains("unless")) {
			System.out.println("o o o");
		}
		
		
		
		
//		test = test.toUpperCase();
//		System.out.println(test);
//		
//		test = test.toLowerCase();
//		System.out.println(test);
	}
	
	
	public void method5() {
		String id = "abcd123 ";
		// id = 'abcd123 '
		id = id.trim();
		if(id.equals("abcd123")) {
			
		}
		String test = "     문자열 테스트      \n"; // \t도 처리가 된다~
//		test = test.trim();	// 공백이 사라졌다! trim : 앞 뒤 공백을 없애준다.
		// ex) 로그인 시 뒤에 공백, 엔터 등 입력하게되는 경우 필요없는 입력을 처리할 때 사용한다.
		System.out.println("==================");
		System.out.println(test);
		System.out.println("==================");
	
	}
	
	
	public void method4() { //에러 왜?
//		String str = new String(Files.readAllBytes(" "));
		// csv 파일
		String test = "1, 2, 3";
		String[] tokens = test.split(","); // 구분자에 따라서 
		for(String string : tokens) {
			string = string.trim();
			System.out.println(string);
		}
	}
	
	public void method3() {
		String test= "바보dsfsg";
		test = test.replace("바보", "**");
//		test = test.replace("바보", "");
		System.out.println(test);
		
		String test2 = "터키";
		
		test2 = test2.replace("터키", "튀르키예");
		System.out.println(test2);
	}
	
	public void method2() {
		
		String test = "문자열 테스트";
		if(test.startsWith("문자열")) {
			System.out.println("문자열로 시작합니다.");
		}
		if(test.endsWith("테스트")) { // 파일 확장자 검색 시에 활용
			System.out.println("테스트로 끝납니다.");
		}
		
		// 2024년으로 시작하는 xls 파일 검사
		File dir = new File("C:\\Users\\PC-09\\Downloads");
		for(File file : dir.listFiles()) {
			String name = file.getName();
			if(name.startsWith("2024")) continue;
			if(name.endsWith(".xls")) continue;
			System.out.println(name);
		}
		
	}
	
	public void method1(){
		
		String test = "문자열 테스트";
		if(test.equals("문자열 테스트")) {
			System.out.println("같은 문자열입니다.");
		}
		
		// 이런 알고리즘적인 것들 누군가 만들어놨다.
//		String a = "문자열";
//		boolean chk = false;
//		for(int i = 0; i < test.length(); i++) {
////			boolean chk = false;
//			int cnt = 0;
//			for(int j = 0; j< a.length(); j++) {
//				if(a.charAt(j) == test.charAt(i)) {
//					cnt++;
//				}
//			}
//			if(cnt == a.length()) chk = true;
//		}
		
		// like '%문자열%'; ★
		if(test.contains("문자열")) {
			System.out.println("'문자열' 이 포함되어 있습니다.");
		}
		
		
	}
}
