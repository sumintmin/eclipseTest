package kr.or.ddit.study06.sec06;

public class TriangleMain {
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0,0,10,0,0,10);
//		t1.area = 0; // 필드에 프라이빗 붙이면 원칙적으로 입력 막아버림
//		System.out.println(t1.area);
		// private은 근데 출력도 안돼버림
		System.out.println(t1.getArea());
		
	}

}