package kr.or.ddit.study06.sec04;

public class Method01 {
	
	
	public static void main(String[] args) {
		Method01 m = new Method01();
		m.method1();
		m.method1(10,10);
	}
	
	
	// 메소드 이름이 같고 파라미터가 다를 때 메소드 오버로딩
	public void method1() {
		System.out.println("void method1()");
	}
	public void method1(int a, int b) {
		System.out.println("void method1(int a, int b)");
	}
	
	
	
	
}