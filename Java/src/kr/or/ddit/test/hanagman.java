package kr.or.ddit.test;

import java.util.Scanner;

public class hanagman {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		hanagman obj = new hanagman();
		obj.process();

	}

	public void process() {
		
		String[] words = {"airplane", "sand", "flower", "school", "public", "private"};
		
		int random = (int)(Math.random() * words.length);
		String w = words[random];
		char[] word = w.toCharArray();
//		System.out.println(word);
	// 단어를 섞을 필요가 없다..
//		for (int i = 0; i < 10000; i++) {
//			int random2 = (int)(Math.random() * word.length);
//			char temp = word[0];
//			word[0] = word[random2];
//			word[random2] = temp;
//		}
		
		String blank_string = "";
		for (int j = 0; j < word.length; j++) {
			blank_string +="O";
		}
		char[] blank = blank_string.toCharArray();
		for(int i = 0; i < blank.length; i++) {
			System.out.print(blank[i]);
		}
//		System.out.println(word);
		
		System.out.println();
		int cnt = 0;
		while(cnt<10) {
			cnt++;
			System.out.print("한글자씩 맞춰보세요 : ");
			String inword_string = sc.next();
			char[] inword = inword_string.toCharArray();
//			System.out.println(word);
			System.out.println(inword[0]);
			System.out.println(cnt + "차 시도");
			for (int i = 0; i < word.length; i++) {
				if (word[i] == inword[0]) {
					
					blank[i] = inword[0];
					System.out.println(blank);
				}
			}	
		}
	}

}
