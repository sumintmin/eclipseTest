package kr.or.ddit.study06.sec02;

public class StudentMain {
	public static void main(String[] args) {
		// 학생 3명 만들고 이름, 점수 입력
		Student st1 = new Student();
//		new Student();만 쓰면 메모리만 만들어지고 불러올 수가 없다
		st1.name = "hello";
		st1.eng = 56;
		st1.kor = 32;
		st1.math = 34;
		st1.sum = st1.kor + st1.math + st1.eng;
		st1.avg = st1.sum/3.0;
//		System.out.println(st1.avg);
		
		Student st2 = new Student();
		st2.eng = 32;
		st2.math = 12;
		st2.kor = 54;
		st2.name = "홍길";
		st2.sum = st2.kor + st2.math + st2.eng;
		st2.avg = st2.sum/3.0;		
		
		Student st3 = new Student();
		st3.name = "nancy";
		st3.eng = 45;
		st3.kor = 12;
		st3.math = 46;
		st3.sum = st3.kor + st3.math + st3.eng;
		st3.avg = st3.sum/3.0;
		
		
		System.out.println("이름 : " + st1.name + " 국어 : " + st1.kor + " 영어 : " + st1.eng + " 수학 : " + st1.math + " 총점 : " + st1.sum + " 평균 : " + st1.avg);
		System.out.println("이름 : " + st2.name + " 국어 : " + st2.kor + " 영어 : " + st2.eng + " 수학 : " + st2.math + " 총점 : " + st2.sum + " 평균 : " + st2.avg);
		System.out.println("이름 : " + st3.name + " 국어 : " + st3.kor + " 영어 : " + st3.eng + " 수학 : " + st3.math + " 총점 : " + st3.sum + " 평균 : " + st3.avg);
	
		System.out.println("");
		
		System.out.println("스택 영역에 있는 주소값 출력");
		System.out.println("하지만 generate toString을 한다면?");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	
	
	}
}
