package kr.or.ddit.test;

import java.util.Scanner;

public class bubble {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		bubble obj = new bubble();
		obj.process();

	}

	public void process() {
		int[] array = {80, 94, 97, 64, 49};
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] < array[i+1]) {
				int temp = array[];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + "\t");
			}
	}
}
