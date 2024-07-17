package kr.or.ddit.test;

import java.util.Scanner;

public class buuble {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		buuble obj = new buuble();
		obj.process();
	}

	public void process() {
		// 국 영 수 총점 평균 등수
		int[][] scores = { { 90, 80, 70, 0, 0, 1 }, { 84, 72, 65, 0, 0, 1 }, { 87, 99, 42, 0, 0, 1 },
				{ 77, 61, 81, 0, 0, 1 }, { 80, 77, 92, 0, 0, 1 }, };
		// 총점/ 평균 구하기.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < 3; j++) {
				scores[i][3] += scores[i][j];
			}
			scores[i][4] += scores[i][3] / 3;

		}
		// 등수 구하기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][3] < scores[j][3]) {
					scores[i][5]++;
				}
			}
		}
		System.out.println("국\t영\t수\t총점\t평균\t등수\t");
		System.out.println("===========================================");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===========================================");
		// 등수별로 정렬하기

		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1; j++) {
				if (scores[j][5] > scores[j + 1][5]) {
					int[] a = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = a;
				}
			}
		}

		System.out.println("국\t영\t수\t총점\t평균\t등수\t");
		System.out.println("===========================================");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===========================================");

	}
}
