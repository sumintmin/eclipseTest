package kr.or.ddit.test;

import java.util.Scanner;

public class homework07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework07 obj = new homework07();
		obj.process();

	}

	public void process() {
//		method1();
		method2();
	}
	
	public void method1() {
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
			String w = sc.nextLine();
			
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
	public void method2() {
		// hangman game
		// 랜덤 글자로 게임하기 or 입력한 글자로 게임하기
		//1. 랜덤글자
		// 랜덤 글자수만큼 _ 출력, _로 이루어진 배열 출력
		// 한글자씩 입력하여 그 글자가 랜덤단어에 있는지 반복문을 돌려서 확인,
		// 있으면 동일 위치에 _대신 입력단어 표시
		// 기회는 10회, 1회씩 감소하고 내가 입력한 단어를 배열에 추가하여 
		// 중복으로 입력한 단어는 카운트하지 않고, 내가 입력한 단어 표시해주기
		// 10회가 되면 종료메시지 출력
		
		//위의 코드를 활용해 랜덤 단어를 고른다.
		String[] words = {"airplane", "apple", "bicycle", "carrot"};
		int wordSel = (int)(Math.random() * words.length);
		String word= words[wordSel];
		char[] wordChars = word.toCharArray();
		String blank = "";
		
		for (int i = 0; i < wordChars.length; i++) {
			blank+="-";
		}
		System.out.println(blank);
		
		
		char[] bla = blank.toCharArray();
		int cnt = 0;
		String ra = "";
		
		
		while(cnt < 10) {
		if (ra.contentEquals(word) == false) {
			
		
			cnt++;
			System.out.println(cnt+"차 시도");
			System.out.println("한 글자를 입력하여라");
			String ans = sc.next();
			char[] answer = ans.toCharArray();
			System.out.println(answer);
			
			for (int i = 0; i < wordChars.length; i++) {
				if (wordChars[i] == answer[0]) {
//					cnt++;
//					bla[i] = answer[0];
//					ra = bla.toString();
//					}else {
//						cnt++;
//						
//					}
//				}
				
		}
						
			else {
				cnt++;
				System.out.println("성공");
				break;
				
			
		}
			
			}
//		System.out.println(bla);
	
			
	}
			
//			public void method3() {
//				
//				
//				// 1. 랜덤글자 고르기
//				String[] words = {"airplane", "apple", "bicycle", "carrot"};
//				int wordSel = (int)(Math.random() * words.length);
//				String word= words[wordSel];
//				char[] wordChars = word.toCharArray();
//				String blank = "";
//				
//				// 2. 랜덤글자만큼 밑줄 출력하기
//				for (int i = 0; i < wordChars.length; i++) {
//					blank+="-";
//				}
//				System.out.println(blank);
//				
//				// 3. 글자 변경을 위해(인덱스부여) 배열로 변환하기
//				char[] bla = blank.toCharArray();
//				
//				// 4. 시도 횟수와 정답 스트링, 오답스트링 생성을 위한 변수 선언
//				int cnt = 0;
//				String ra = "";
//				char[] answer;
//				while(cnt < 10) {
//					cnt++;
//					System.out.print("입력하세요: ");
//					String ans = sc.next();
//					answer = ans.toCharArray();
//					for (int i = 0; i < bla.length; i++) {
//						if (wordChars[i] == answer[0]) {
//							bla[i] = answer[0];
//							
//						}else continue;
//					System.out.println(bla);
//					ra = bla.toString();
//					if (ra == word) {
//						System.out.println("성공");break;
//					}else continue;
//					
//				}
//				}
//			
//						
//						
//						
			}
//		
//
//						
			
//		
//			
//			
//			
//			
//			
		}
	}

