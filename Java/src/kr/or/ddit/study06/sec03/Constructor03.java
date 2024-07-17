package kr.or.ddit.study06.sec03;

public class Constructor03 {

	public Constructor03() {
		System.out.println("기본 생성자");
	}
	
	public Constructor03(String a) {
		this();
		System.out.println("생성자1 String a");
	}
	
	public Constructor03(String a, String b) {
		this(a); // 위를 호출하고
		System.out.println("생성자2 String b");
	}
	
//	public Constructor03(String a, int b) {
//		this(a,b); // 위를 호출하고
//		System.out.println("생성자3 String a, int b");
//	}
	
	public Constructor03(String a, String b, String c) {
		this(a,b); // 위를 호출해서
		// this를 사용하여 다른 생성자를 호출할 수 있다.
		// 결론적으로 위에서 아래로 호출하게 됨.. 신기하당
		System.out.println("생성자 String a, String b, String c");
	}
	
	
}