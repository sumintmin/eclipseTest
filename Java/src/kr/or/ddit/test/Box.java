package kr.or.ddit.test;

import java.util.HashSet;

public class Box {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		
		if(set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
	}
}







