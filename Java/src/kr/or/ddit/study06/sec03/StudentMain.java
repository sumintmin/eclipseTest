package kr.or.ddit.study06.sec03;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("육수민", 25);
		System.out.println(s1.name + s1.age);
		Student s2 = new Student("302", "nihao", 32);
		System.out.println(s2.age + s2.roomNo + s2.name);
		
		
		// 401호 학생 3명 입력
		Student st1 = new Student("김김김", 23);
		Student st2 = new Student("이이이", 32);
		Student st3 = new Student("치ㅊ최최", 31);
		System.out.println(st1.roomNo + " " + st1.name + " " + st1.age);
		System.out.println(st2.roomNo + " " + st2.name + " " + st2.age);
		System.out.println(st3.roomNo + " " + st3.name + " " + st3.age);
		
		// 402호 학생 1명 입력
		
		Student anotherstu = new Student("402호", "김김", 32);
		System.out.println(anotherstu.roomNo +  anotherstu.name + anotherstu.age );
		// 일본 국적 학생 1명 입력
		
		Student japan = new Student("japan", "320호" , "kirimochi" , 32);
		System.out.println(japan.nation + japan.roomNo + japan.name + japan.age);
		// 입력 레벨에 따라 쉽게 처리를 할 수 있다
	}
}
