package kr.or.ddit.study06.sec01;

public class TvMain {
	public static void main(String[] args) {
		// Tv에 데이터 담고 출력하기 2개
		// 벽걸이 티비, 삼성, 100
		// 대형티비, LG, 150
		
		Tv tv = new Tv();
		tv.name = "벽걸이티비";
		tv.company = "samsung";
		tv.size = 80;
		
		
		Tv tv1 = new Tv();
		tv1.name = "벽걸이티비";
		tv1.company = "삼성";
		tv1.size = 100;
		
		Tv tv2 = new Tv();
		tv2.name = "대형티비";
		tv2.company = "LG";
		tv2.size = 150;
		
		System.out.println(tv.name + " " + tv.company + " " + tv.size);
		System.out.println(tv1.name + " " + tv1.company + " " + tv1.size);
		System.out.println(tv2.name + " " + tv2.company + " " + tv2.size);
		
		Tv Tv = new Tv();
		Tv.name = "벽걸이";
		Tv.company = "samsung";
		Tv.size = 100;
		System.out.println(Tv.name);
//		이름이 같으면 Duplicate local variable Tv라는 에러가 난다
//		Tv Tv = new Tv();
//		Tv.name = "별";
//		System.out.println(Tv.name);
//		
	}

}