package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework10 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework10 obj = new Homework10();
		obj.process();

	}

	public void process() {
		
		System.out.print("반지름 입력하세요: ");
		int r = sc.nextInt();
		System.out.print("높이를 입력하세요: ");
		int h = sc.nextInt();
		
		//원기둥 부피 출력
		
		Circle c = new Circle(r);
		System.out.println(c);
		
		Cylinder cy = new Cylinder(c, h);
		System.out.println(cy);
		Cylinder cy2 = new Cylinder(r, h);
		System.out.println(cy2);
		
		
	}
	

}

class Circle{
	int r;
	double area;
	
	// 반지름을 입력할 때 원의 넓이를 구하시오.
	public Circle(int r) {
		// pi*r*r
		double pi = Math.PI;
		
		area = pi * r * r;
//		this.r = r;
		
//		System.out.println("area = " + area);
		
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";
	}

}

class Cylinder{
	int h;
	Circle c;
	double volume;
	
	// 원, 높이를 입력받아 부피를 구하시오
	
	public Cylinder(Circle c, int h) {
		// 부피
		// 원의 넓이 * 높이
		volume = c.area * h;
		this.c = c;
		this.h = h;
//		System.out.println("volume = " + volume);
		
		
	}
	
	@Override
	public String toString() {
		return "Cylinder [h=" + h + ", c=" + c + ", volume=" + volume + "]";
	}

	// 반지름, 높이를 입력받아 부피를 구하시오
	public Cylinder(int r, int h) {
		// 오버로딩 이용해서 해볼 것

		this(new Circle(r), h);
		
/*		코드 중복으로 비효율적이므로 this를 사용하여 오버로딩한다.
 * 		Circle c = new Circle(r);
 * 		this.c = c;
 * 		this.h = h;
 * 		volume = c.area*h;
 * 
 */
		
	}
	


}

