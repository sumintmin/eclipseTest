package kr.or.ddit.study06.sec04;

public class Method03 {
	public static void main(String[] args) {
		
	}
	
	public int method1() {
		
		System.out.println("aa"); // 얘를 return 밑에 쓰면 빨간줄...
		
		return 10; // int니까 10.0 이런거 못쓴다.
	}
	
	public double method2() {
		
		return 5.5;
	}
	
	public String method3() {
		
		return "aaa";
	}
	
	public int[] method4() {
		int[] arr = { 1,2,3};
		return arr;
	}
	
	public void method5() {
		
		int num = 2;
		if(num%2 == 0)	return ;
//		else return;
		
		System.out.println("ㅁㅁㅁㅁㅁ");
	}
	
}