package kr.or.ddit.study06.sec03;

public class Point {

	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		// 기본 생성자를 안만들건데, x,y 값이 필수이기 때문에
		// 점을 만들기 위해서는 x,y가 필요하기 때문에
		// 기본생성자는 제공하지 않고 생성자만 제공할 수 있다~
		
		// 포인트 클래스가 아닌 삼각형 클래스 만들어보기
		
		
		
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
