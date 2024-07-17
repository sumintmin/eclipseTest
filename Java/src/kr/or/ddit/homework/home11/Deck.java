package kr.or.ddit.homework.home11;

public class Deck {
	Card[] cardList;
	
	Deck(){
		int cnt = 0;
		cardList = new Card[52];
		String[] types = {"♣","♠","♡","◇"};
		for(int i = 0; i< 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cardList[cnt++] = new Card(j, types[i]);
			}
			
		}
	}
	
	public void printCardList() {
		for (int i = 0; i < cardList.length; i++) {
			System.out.print(cardList[i]);
			System.out.print(",");
		}System.out.println();
	}
	
	public void shuffle() {
		
		// 랜덤 번호에 해당하는 카드를 출력
//		System.out.println(cardNum);
//		System.out.println(cardList[cardNum]);
		for (int i = 0; i < 100000; i++) {
			int ran = (int)(Math.random() * cardList.length);
			Card temp = cardList[0];
			cardList[0] = cardList[ran];
			cardList[ran] = temp;
		}
		
		
	}
	

	public Card getCard(int num) {		
		return cardList[num]; // 리턴값은 카드다.
	}
	
}
