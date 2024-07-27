package kr.or.ddit.study10;

import java.util.Scanner;

public class ClassException1 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ClassException1 obj = new ClassException1();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method4() {
		String str = null;
		try {
			if(str.equals("") && str == null) {
				System.out.println("값이 없다.");
			}
			
		} catch (Exception3 e) {
			System.out.println("널 포인트 에러");
		}
//		if(str.equals("") && str == null) {
//			System.out.println("값이 없다.");
//		}
	}
	
	public void method3() {
		
		int[] arr = new int[3];
//		for (int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		// 1. 에러 이유 찾기
		// 2. 에러 위치 찾기 		- 파란색 누르면 위치로 자동 이동됨, 맨 위에꺼가 실제 발생 위치
		// 에러는 나왔지만 꺼지면 안된다 -> try catch를 이용한다.
		try {
			
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
				}
		} catch (Exception3 e) {
			System.out.println("배열 범위를 벗어남"); // 예제를 위한 예제일 뿐 개발자 잘못이니까 코딩을 수정하자~
			// 맞게 쓰면 catch는 실행되지 않는다.
		}
		
	}
	
	public void method2() {
		// 실행 예외 (Runtime Exception)
		// 컴파일 과정에서 체크하지 않음
		// 실행시 예측할 수 없이 갑자기 발생함.
		
		// 실행 후 발생한 에러가 다 runtime exception이다. 컴파일 과정에서 체크되지 않는 오류들
		System.out.println("숫자 입력 : ");
		try {
			System.out.println("1");
			int num = sc.nextInt();
			System.out.println("2");
		} catch (Exception3 e) {
			// 에러 발생시 catch 구문으로 이동됨
			System.out.println("숫자만 입력해 주세요");
		}
		// try catch가 없으면 4만 실행됨
		// 그 페이지만 다시 접속하면 실행되게 해야지 홈페이지가 꺼지게 하면 안된다.
		System.out.println("4");
//		int num = sc.nextInt();
		
	}
	
	public void method1() {
		// 일반 예외
		// 컴파일러 체크 예외
		// 자바 소스 컴파일 과정에서 해당 예외 처리가 있는지 검사됨
		//Thread.sleep(10);을 치고 sleep에 커서 올리면 선택지 두개 뜨는데 surround 를 선택한다.
		// 문제는 일반예외가 아니라 런타임에러
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}