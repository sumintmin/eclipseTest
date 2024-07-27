package kr.or.ddit.study07.vehicle;

import kr.or.ddit.util.ScanUtil;

public class VehicleMain {
	public static void main(String[] args) {
		// Vehicle 클래스 만들기
		// Vehicle run 메소드 만들기
		// 자동차, 오토바이 클래스 생성 후 상속 받을 것.
		// 자동차 run -> 자동차가 달립니다.
		// 오토바이 run -> 오토바이 달립니다.
		
		// 다형성 이용해서 출력할 것.
		
		System.out.println("1. 자동차");
		System.out.println("2. 오토바이바이");
		int sel = ScanUtil.nextInt("둘 중 선택");
		
		Vehicle v = null;
		if(sel == 1) v = new Car();
		if(sel == 2) v = new MotorCycle();
		v.run();
		
		
	}
}