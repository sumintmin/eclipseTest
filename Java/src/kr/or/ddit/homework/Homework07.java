package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework07 obj = new Homework07();
		obj.process();

	}

	public void process() {
		// 섞인 문자열을 출력하고
		// 정답을 맞추세요
		// 		정답이 틀린 경우 계속 진행
		// 		정답을 맞춘 경우 반복문 종료 후 몇번 시행했는지 출력
		
		String[] words = {"airplane", "apple", "bicycle", "carrot"};
		
		//단어에 랜덤 번호 부여
		int wordSel = (int)(Math.random() * words.length);
		//words.length 는 words배열에 저장된 단어 개수를 의미한다.
		// math.random을 곱해주면 0~1사이의 랜덤 값이 곱해진다.
		// 이 값에 단어 길이를 곱하고 정수로 변환하면 단어 개수 내에서 랜덤번호가 생성된다

		// 랜덤번호(wordSel)에 해당하는 단어를 String으로 저장
		String word= words[wordSel];
		
		// 당첨단어를 한글자씩 배열로 저장하는 함수를 사용하여 char배열로 변경
		char[] wordChars = word.toCharArray();
		// ['c','l','o','u','d'] 이런 식으로 들어있음
		
		for (int i = 0; i < 10000; i++) {
			// 위의 방식과 동일하게 각 글자로 분리된 배열에 랜덤 번호 부여
			int ran = (int)(Math.random() * wordChars.length);
			
			// 비어있는 변수를 하나 만들어서 당첨단어[0]를 담고
			char temp = wordChars[0];
			
			// 0번째 글자를 랜덤번째 글자로 변경
			wordChars[0] = wordChars[ran];
			
			// 랜덤번째 글자 자리에는 temp값 입력
			wordChars[ran] = temp;
			
			// 이 과정을 1000번 반복해서 단어를 섞는다.
		}
		for (int i = 0; i < wordChars.length; i++) {
			System.out.print(wordChars[i] );
		}
		System.out.println();
		
		int cnt = 0;
		while(true) {
			
			System.out.println("단어를 알맞게 배열하세요: ");
			String w = sc.next();
			
			if (w.contentEquals(word)) {
				cnt++;
				System.out.println("정답");
				System.out.println(cnt + "회 시도하였습니다.");
				break;
				}
			
			else {
				System.out.println("오답");
				cnt++;
				}
		}
	}
	
//	public void method1() {
//		while(true) {
//			cnt++;
//			for (int i = 0; i < wordChars.length; i++) {
//				System.out.println(wordChars[i]);
//			}
//			System.out.println();
//			System.out.println("정답: ");
//			String str = sc.next();
//			
//			if(str.equals(word)) {
//				break;
//			}
//		}
//		System.out.println(cnt + "번 만에 맞추셨습니다.");
//	}
}

				
				
				
		
		