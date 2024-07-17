package kr.or.ddit.study05.sec02;

import java.util.Arrays; // Arrays.sort()
import java.util.Collections;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
//		method11();
//		method12();
		method13();
	}
	
	public void method13() {
//		int[] arr = {68,75,42,90,61};
		Integer[] arr = {68,75,42,90,61};
		
		// 배열 정렬
		// 퀵 정렬로 이루어짐
		Arrays.sort(arr, Collections.reverseOrder()); // 사기잖아~~~~
		
		// Arrays.toString
		// 배열 -> 문자 열 변환
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public void method12() {
		
//		int[] arr = {68, 75, 42, 90, 61};
		int[] arr = {90, 75, 68, 61, 42}; // 정렬이 완료된 상태인 경우
		
		
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length -1; i++) {
			boolean chk = true;
			for (int j = 0; j < arr.length-1; j++) {
				cnt++;
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					chk = false;
				}
			}
			if(chk) break; // 바뀐 값이 하나라도 있으면 반복문을 종료하지 않는다.
		}
		System.out.println("반복문 시행 횟수 : " + cnt);
		
		
	}
	
	public void method11() {
		String[] strArray = new String[3];
		
		String str1 = "abc";
		String str2 = "def";
		String str3 = "ghi";
		
		strArray[0] = str1;
		
//		왼쪽(stack)									오른쪽(heap)
//		String[] strArray = 주소값1					new String[3]
//											그림:		1|	|	|	|
//		String str1 = abc주소값					    	|abc|
//		String str2 = def주소값						    |def|
//		String str3 = ghi주소값							|ghi|
//													1|abc주소값|	|	|
		
//		
		
		
	}
	// null - 자체가 힙에 연결되지 않았다.
	public void method10() {
		// 로또 생성 프로그램
		
		int[] temp = new int[45];
		
		// temp에 1~45 숫자 담기
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		
		// temp 값 섞기
		for (int i = 0; i < 10000; i++) {
			int ran = (int)(Math.random()*45);
			int t = temp[0];
			temp[0] = temp[ran];
			temp[ran] = t;
		}
		
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i] + " ");
//		}

//		System.out.println(temp);
		
		// 6자리 로또 값에 temp 값 0~5까지의 값 복사
		
		int[] lotto = new int[6];
		System.arraycopy(temp, 0, lotto, 0, 6);
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
		// 숫자 정렬해보기
		
		for (int i = 0; i < lotto.length-1; i++) { // 97이 맨 끝에 있을 경우 맨앞까지 오는데 4번이므로length - 1회
			for (int j = 0; j < lotto.length-1; j++) { // 부등호 반대로 하면 작은숫자부터 출력
				// 80과 94중 큰 값을 바꾸겠다
				// 80 94	// 80 97
				if(lotto[j] < lotto[j+1]) {
					int tem = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tem;
				}
			}
		}
		
		
		//출력
		System.out.print("[");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print( lotto[i] + " ");
		}
		System.out.print("]");
		
	}
	// 주로 버블정렬과 선택정렬을 공부함
	public void method9() {
		
		// 버블정렬
		// 귕장히 느림?
		int cnt = 0;
		int[] array = {80, 94, 97, 64, 49};
		for (int i = 0; i < array.length-1; i++) { // 97이 맨 끝에 있을 경우 맨앞까지 오는데 4번이므로length - 1회
			for (int j = 0; j < array.length-1; j++) { // 부등호 반대로 하면 작은숫자부터 출력
				// 80과 94중 큰 값을 바꾸겠다
				// 80 94	// 80 97
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					cnt++;
				}
				
			}
		}
		System.out.println("cnt = " + cnt);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public void method8() {
		// 깊은 복사(deep copy)	 :	배열공간을 별도로 확보
		// 1. 반복문을 이용
		// 2. System.arraycopy()
		// 3. clone()
		
		int[] source = {1,2,3,4,5};
//		int[] target = new int[5];
		
//		// 1. 반복문 이용
//		for(int i = 0; i<source.length; i++) {
//			target[i] = source[i];
//		} // 별도의 배열이므로 바뀌지 않는다~!
		// 값을 2배로 복사는 반복문이 맞는데 
		// 자르기는 arraycopy쓰는게 훨씬 쉽고 
		// 단순복사만은 clone하면 별도 공간없어도 되므로 편하다~
		
		// 2. System.arraycopy()
		// 얘도 똑같이 복사가 된다~
		// 복사될 변수, 시작점, 복사하는 변수, 시작점, 복사개수
//		System.arraycopy(source, 0, target, 0, target.length);
//		System.arraycopy(source, 1, target, 1, 4);
		// 0번째는 비워두고 복사함
//		System.arraycopy(source, 2, target, 1, 3);
		// 1번부터, 2? 03450 출력
		
		
		// 3. clone
		int[] target = source.clone();
		
		target[2] = 10;
		
		System.out.println("원본 배열");
		for(int num : source) 
			System.out.print(num + "\t");
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int num : target)
			System.out.print(num + "\t");
		System.out.println();
		
	}
	
	
	public void method7() {
		// 얕은 복사, 깊은 복사
		// 얕은 복사 (shallow copy) : 복사된 배열이나 원본 배열이 변경될 때
		// 						     서로간의 값이 같이 변경
		// 						     주소값 복사
		
		int[] source = {1,2,3,4,5};
		int[] target = source; // 원본보존
		
		target[2] = 10;
		
		System.out.println("원본 배열");
		for(int num : source) 
			System.out.print(num + "\t");
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int num : target)
			System.out.print(num + "\t");
		System.out.println();
	}
	
//	얕은 복사
//	source = 주소값 10			주소값 10: 1,2,10,4,5
//	target = 주소값 10
	
//	깊은 복사
//	source = 주소값 10			주소값 10: 1,2,10,4,5
//	target = 주소값 20			주소값 20: 1,2,10,4,5
//  별도의 공간
	
	
	public void method6() {
		int[] coin = {	50000, 10000, 5000, 1000, 500, 100, 50, 10	};
		//77750 -> 10000 * 7 + 5000 * 1 + 1000 * 2 + 500 * 1 + 100 * 2 + 50 * 1
		
		System.out.print("거스름돈 입력: ");
		int money = sc.nextInt();
		for (int i = 0; i < coin.length; i++) {
			int cnt = 0;
			cnt = money / coin[i];
			// 0을 출력하지 않는다.
			if (cnt == 0) 	continue;
			
//			money = money - coin[i] * cnt;
			System.out.println(coin[i] + " " + cnt + "개");
			money %= coin[i];
		}
	}
	
	
	public void method5() {
		// 80 90 87 65 82
		int[] arr = {80,90,87,65,82};
		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
		
		// 배열 값 중 최댓값 구하기
//		int max = 0;
		int max = arr[0];
//		int max = Integer.MAX_VALUE;
		for (int i = 0; i <arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		System.out.println("최대값: " + max);
		
		// 배열 값 중 최소값 구하기
//		int min = 0;
		int min = arr[0]; // 아무 값이나 넣어서 비교
//		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		System.out.println("최소값: " + min);
	}
	
	public void method4() {
		// int 배열 만들고 90, 80, 77, 값을 입력하시오.
		int[] arr = new int[3];
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 77;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + i);
			sum += arr[i];
			System.out.println("sum = " +sum);
			
			double avg = (double)sum/arr.length;
			System.out.println("배열의 평균은 = " + avg);
		}
	}
	
	public void method3() {
		// 배열 선언 방법
		
		// int a;
		int[] arr1 = new int[5];
		
		int arr2[] = new int[5];
		
//		int a = 10;
		int[] arr3 = {1,2,3,4,5};
		// 괄호를 앞에 쓰는게 알아보기 쉽다.
		// heap 메모리에 만들어진다.
		
		
	}
	
	public void method2() {
		int[] arr = new int[5]; // new로 하면 stack이 아닌 heap 영역에 생긴다.
		
		// 값 할당
		// 사물함 위치랑 비슷한 느낌. 1번사물함 2번사물함
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 10;
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
			sum += arr[i];
			System.out.println("sum = " + sum + ";;");
		}
		System.out.println(arr);
	}
	
	public void method1() {
		// int 변수 5개 만드시오.
		
		int a = 10;
		int b  = 10;
		int c = 10;
		int d = 10;
		int e = 10;
		
		int sum = a+b+c+d+e;
		System.out.println(sum);
	}
	
}
