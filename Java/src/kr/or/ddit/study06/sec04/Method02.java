package kr.or.ddit.study06.sec04;

public class Method02 {
	
	public static void main(String[] args) {
		Method02 m = new Method02();
		m.method1(10);
		
		m.method2("hello world");
		
		m.method3("hello world ", "nice to meet you u u u u like it's magenetic uuuuuuuu super 이끌림");
	}

	public void method1(int a) {
		System.out.println("외부에서 준 파라미터 값 " + a);
		
	}
	
	public void method2(String str) {
		System.out.println("외부에서 준 파라미터 값 " + str);
	}
	
	public void method3(String str, String str2) {
		System.out.println("외부에서 준 파라미터 값 " + str + str2);
	}
}