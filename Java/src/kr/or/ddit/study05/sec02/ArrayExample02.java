package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method4() {
		// 2차원 배열 반복문?? how
		
		
	}
	
	
	public void method3() {
		// 홍길동, 강감찬, 이순신
		// 국 영 수
		int[][] score = {	{90, 80, 77}, {84, 65, 49}, {97, 98, 94}	};
		
//		int[] hong = score[0];
//		int hongkor = hong[0];
//		 둘 다 같은 내용
		int hongKor = score[0][0]; // 0번째 배열의 0번째 값
		System.out.println("홍길동 국어 점수 : " + hongKor);
		
		// 강감찬 수학점수
		int gangMath = score[1][2];
		System.out.println("강감찬 수학 점수 : " + gangMath);
		
		int leeEng = score[2][1];
		System.out.println("이순신 영어 점수 : " + leeEng);
		
		// 홍길동 점수 평균
		double avg = (score[0][0] + score[0][1] + score[0][2])/3.0;
		System.out.println("hong avg = " + avg);
		
		int[] hong = score[0];
		int hongSum = 0;
		for (int i = 0; i < hong.length; i++) {
			hongSum += hong[i];
		}
		double hongAvg = hongSum / 3.0;
		System.out.println("홍길동 점수 평균 : " + hongAvg);
		
		// 국어 점수 평균
		int korSum = 0;
		for (int i = 0; i < score.length; i++) {
			int kor = score[i][0];
			korSum += kor;
//			int math = score[i][0]
		}
		double korAvg = korSum/3.0;
		System.out.println("국어 점수 평균" + korAvg);
		
		// 수학 점수 평균
		int mathSum = 0;
		for (int i = 0; i < score.length; i++) {
			int math = score[i][1];
			mathSum += math;
		}
		double mathAvg = mathSum/3.0;
		System.out.println("수학 점수 평균" + mathAvg);
		
		// 영어 점수 평균
		int engSum = 0;
		for (int i = 0; i < score.length; i++) {
			int eng = score[i][2];
			engSum += eng;
		}
		double engAvg = engSum/3.0;
		System.out.println("영어 점수 평균" + engAvg);
	}
	
	
	public void method2() {
		int[][] total1 = new int[2][3];
		int[][] total2 = {{1,2,3},{4,5,6}};
		int[][] total3 = new int[2][]; // 뒤 값을 적지 않는 것도 가능하다. 
		//new int[2][]: 3과목 응시하거나 2과목 응시하기도 하므로 동적으로 남겨두기도 함	
		
	}
	
	public void method1() {
		// 배열 -> 값을 꺼내면  ?
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		int[] arr3 = {7,8,9};
		
//		 상자에서 값을 꺼내면 왼쪽게 나옴
//		int[]라면 int, int[][]라면 int[]
		
		int[][] total = new int[2][3];
		
		total[0] = arr1;
		total[1] = arr2;
//		total[2] = arr3;
		
		// 주소값 출력
		System.out.println(total);
		System.out.println(total[0]);
		System.out.println(arr1);
		// 빈 배열에는 null이 들어있다.
//		|	|	|	|
//		|	|	|	|
//		| 1	| 2	| 3	|
		
		
		
	}

}
