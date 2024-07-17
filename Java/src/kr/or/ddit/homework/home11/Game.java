package kr.or.ddit.homework.home11;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Game obj = new Game();
		obj.process();

	}

	public void process() {
		Deck deck = new Deck();
//		deck.printCardList();
		deck.shuffle();
//		deck.printCardList(); // 섞인거 확인 후에 주석처리
		
		// 내 카드는 0번째 카드
		Card myCard = deck.getCard(0);
		System.out.println("myCard = " + myCard);
		// 컴퓨터 카드는 랜덤으로 가져올` 것. 0말고 1부터 나머지카드~
		int ran = (int)(Math.random() * 51) + 1;
		Card comCard = deck.getCard(ran);
		System.out.println("comCard = " + comCard);
		
		System.out.println("결과");
		if (myCard.num > comCard.num) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		
		// 승패 출력
		// 내 카드 숫자가 높다면		win
		//			같거나 낮다면 	lose
		// ex) 내 카드: ♡ 4 			컴카드 :♠5
		// 		lose			win

	}
	


}
