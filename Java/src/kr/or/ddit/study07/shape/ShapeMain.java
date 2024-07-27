package kr.or.ddit.study07.shape;

import kr.or.ddit.util.ScanUtil;

public class ShapeMain {

	public static void main(String[] args) {
		// shape 클래스 만들 것
		// 원 클래스, 사각형 클래스 만들 것
		// Shape 상속
		
		// Shape 메소드 -> draw
		// 원 draw -> 원을 그립니다. 출력
		// 사각형 draw -> 사각형을 그립니다. 출력
		
		// 다형성을 이용해서 구현해볼 것
		
		System.out.println("1. 사각형");
		System.out.println("2. 원");
		int sel = ScanUtil.nextInt("도형 선택");
		
		Shape sp = null;
		if(sel == 1) sp = new Rectangle();
		
		if(sel == 2) sp = new Circle();
		sp.draw();
		
	}
}