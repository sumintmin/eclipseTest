package kr.or.ddit.study06.sec04;

public class Cal2 {
	
	public static void main(String[] args) {
		Cal2 c = new Cal2();
		
		int a = 10;
		int b = 10;
		int add = c.method1(a, b);
		int sub = c.method2(a, b);
		int mul = c.method3(a, b);
		int div = c.method4(a, b);
		System.out.printf("%d + %d = %d \n",a,b,add);
		System.out.printf("%d - %d = %d \n",a,b,sub);
		System.out.printf("%d * %d = %d \n",a,b,mul);
		System.out.printf("%d / %d = %d \n",a,b,div);
	}

	public int method1(int a, int b) {
		return (a + b); // void라고 써서 에러였음..
	}
	public int method2(int a, int b) {
		return a - b;
	}
	public int method3(int a, int b) {
		return a * b;
	}
	public int method4(int a, int b) {
		return a / b;
	}
	
	
}
