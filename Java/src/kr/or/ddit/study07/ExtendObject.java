package kr.or.ddit.study07;

public class ExtendObject extends SuperObject{
	
	public static void main(String[] args) {
		ExtendObject eo = new ExtendObject();
//		eo.field1 = 10;
		eo.method1();
//		System.out.println(eo.field1);
		System.out.println(eo);
	}
	
	public ExtendObject() {
		this(10);
	}
	
	public ExtendObject(int field) {
		super(field); // 생성자?
	}
	@Override
	public void method1() { // 필드와 메소드의 메소드
		// super 부모클래스를 의미함
		System.out.println("자식 메소드");
//		super.method1(); // 부모 메소드를 쓰겠다.
	}
	
	@Override
	public String toString() {
		return "field1 = " + field1;
	}

}