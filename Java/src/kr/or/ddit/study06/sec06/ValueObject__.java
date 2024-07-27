package kr.or.ddit.study06.sec06;

public class ValueObject__ {
////	
////	private String field1;
////	private int field2;
//	
//	// value object 는 줄여서 vo라고 한다.
//	// db 레이블을 여기에 담는다.
//	
//	// alt shift s 밑에서 2번째꺼 체크 빼고 기본 생성자 만든다.
//	
//	public ValueObject() {
////		super();
//		// 기본생성자
//		
//	}




	// alt shift s 밑에서 두번째꺼
	public ValueObject__(String field1, int field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}



	// alt shift s getter setter 생성
//	생성자가 하나라도 있으면 기본 생성자가 만들어지지 않으므로
	// 직접 만들어준다. 기본생성자를
	
	public String getField1() {
		return field1;
	}




	public void setField1(String field1) {
		this.field1 = field1;
	}




	public int getField2() {
		return field2;
	}




	public void setField2(int field2) {
		this.field2 = field2;
	}


	// alt shift s generate toString

	@Override
	public String toString() {
		return "ValueObject [field1=" + field1 + ", field2=" + field2 + "]";
	}
	
	
	
	
	
	

}