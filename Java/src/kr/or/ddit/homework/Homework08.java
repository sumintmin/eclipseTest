package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework08 obj = new Homework08();
		obj.process();

	}

	public void process() {
	
		int[][] scores = {
				
				{90,80,70,0,0,1},
				{84,72,65,0,0,1},
				{87,99,42,0,0,1},
				{77,61,81,0,0,1},
				{90,77,92,0,0,1},
		};
		
		//  총점 /평균 구하기
		for (int i = 0; i < scores.length; i++) {
			scores[i][3] = scores[i][0] + scores[i][1]+scores[i][2];
			scores[i][4] = scores[i][3]/3;
		}
		
		// 등수 구하기
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if(scores[i][3] < scores[j][3]) {
					scores[i][5]++;
				}
			}
		}
		
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("============================================");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}System.out.println();
		}
		System.out.println("============================================");
		
		int b[][] = new int[scores.length][scores[0].length];
		
		
		for (int i = 0; i < scores.length-1; i++) { // 97이 맨 끝에 있을 경우 맨앞까지 오는데 4번이므로length - 1회
			for (int j = 0; j < scores.length-1; j++) { // 부등호 반대로 하면 작은숫자부터 출력
				if(scores[j][5] > scores[j+1][5]) {
					System.arraycopy(scores[j], 0, b[j], 0, scores[i].length);
					System.arraycopy(scores[j+1], 0, scores[j], 0, scores[i].length);
					System.arraycopy(b[j], 0, scores[j+1], 0, scores[i].length);
				}
				
			}
		}
		System.out.println("등수 오름차순");
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("============================================");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("============================================");
	
	}
}
