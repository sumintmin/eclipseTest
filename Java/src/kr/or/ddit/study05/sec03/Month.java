package kr.or.ddit.study05.sec03;

public enum Month {
//	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
	JAN("1월"), FEB("2월"), MAR("3월"), APR("4월"), MAY("5월"), JUN("6월"),
	JUL("7월"), AUG("8월"), SEP("9월"), OCT("10월"), NOV("11월"), DEC("12월");
	
	// semicolon 없어도 동작됨
	
	// enum에 생성자 넣고 파라미터로 1월 2월 등 써주었다
	
	
	
	String num;			// 필드값
	Month(String num){ // 생성자
		this.num = num;
		
	}
}