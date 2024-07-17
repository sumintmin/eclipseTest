package kr.or.ddit.study06.sec02;

public class FieldMain {

	public static void main(String[] args) {
		FieldExample fe1 = new FieldExample();
		fe1.name = "양형운";
		fe1.age = 20;
		
		System.out.println(fe1.name+ ", " + fe1.age);
		
		// 클래스에 데이터를 담을 수 있다.
		// new는 heap 영역에 만들어진다.
		
		// fieldexample에는 데이터가 없고 new라고 써줘야 데이터가 담긴다.
		// 붕어빵 틀같이 쓰인다.
		// new를 한번 더 불러오면 데이터 또 만들 수 있다.
		
		FieldExample fe2 = new FieldExample(); // new 쓰면 heap메모리에 데이터를 담을 수 있는 공간이 생긴다.
		fe2.name= "조원근";
		fe2.age = 20;
		
		System.out.println(fe2.name+ ", " + fe2.age);
		
//		fe1
//		===========
//		String name;
//		Int age;
//		-----------------
//		fe2
//		=============
//		String name;
//		int age;
//		
		
		
//		int[] array = new int[2];
//		array[0] = 20;
//		array[1] = "양형운";

		
		
		
	}
}
