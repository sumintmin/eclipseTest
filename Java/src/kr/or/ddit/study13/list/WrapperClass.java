package kr.or.ddit.study13.list;

public class WrapperClass {
	public static void main(String[] args) {
		// 기본타입 < - > 클래스
		// 기본타입은 오브젝트에 담을 수 없어서 래퍼클래스에 담아줘요
		// 래퍼클래스는 기본타입을 클래스로 바꿔줘요
		// 그럼 그 클래스는 오브젝트에 담을 수 있어요
		
		// 언박싱 클래스 -> 기본타입 ( 클래스를 기본 타입에 담아주는 것)
		byte bte = new Byte("10");
		short sht = new Short("10");
		int i;
		char c;
		double d;
		long l;
		float f;
		boolean bo;
		
		// 박싱 기본타입 -> 클래스
		Integer i2 = 10;
//		i2. // 이거 뭐지 뭐 쓰다 만거지?
		
		
	}
}
