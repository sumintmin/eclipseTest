package kr.or.ddit.study10;

import java.util.Scanner;

public class Exception2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception2 obj = new Exception2();
		obj.process();

	}

	public void process() {
		method1();// method1()치고 f2누르면 create로 자동 생성됨 이걸 이제 알려주냠-_-
	}
	
	public void method1() {
		int[] arr = {1, 2, 0};
		System.out.println("배열 번호 입력");
		// 파란줄에 뜬 부분을 try catch에 넣는다
		try {
			int num = sc.nextInt();
			// int num을 밑으로 내렸더니 다른 에러가 발생하죠? 출력 안되고 종료됐죠?
			int result = 10/arr[num];
		}
		
		// catch에 exception을 맨 위에 쓸 경우 모든 에러가 포함되기 때문에 아래의 arrayindexoutof구문이 다 에러난다.
		catch (ArrayIndexOutOfBoundsException e || ArithmeticException e2) {
			System.out.println("배열 범위를 벗어남");
			// 에러 메세지 출력
//			e.printStackTrace(); 
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
			// 에러 메세지 출력
//			e.printStackTrace(); 
		}
		
		catch (Exception e) {
			System.out.println("예외 발생");
		}
		// java.lang.ArrayIndexOutOfBoundsException	배열범위 벗어남
		// 2 입력시 10을 0으로 나눌 수 없어서 에러가 일어남
		// java.lang.ArithmeticException 			/ by zero
		
		System.out.println("실행");
		
		
	}

}