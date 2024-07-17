package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class NullExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		NullExample obj = new NullExample();
		obj.process();

	}

	public void process() {
		String str1 = "";
		String str2 = null; // heap 영역이랑 연결되지 않는 상태
		
//		if(str1.equals("") || str1 == null) {
//			System.out.println("값이 없다.");
//		}
		
		if(str2.equals("")|| str2 == null) {
			System.out.println("값이 없다.");
		}
		// null은 연결되지 않아서 에러남 heap메모리에 연결 안됨
		if(str2 == null || str2.equals("")) { // 에러가 안난다! null이 먼저 확인해서 뒤를 체크하지않기 때문에!
		// 됐다 안됐다 한다고 한다!
			System.out.println("값이 없다.");
		}
	}
}

// 스택: Str1 = 주소값 10; str2 = x; 
// 힙: heap()
