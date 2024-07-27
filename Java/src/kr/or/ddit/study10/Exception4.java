package kr.or.ddit.study10;

import java.util.Scanner;

public class Exception4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception4 obj = new Exception4();
		obj.process();

	}

	public void process() {
		while (true) {
			System.out.println("닉네임을 입력하세요");
			try {
				String nick = inputNick();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public String inputNick() {
		
		String result = sc.nextLine();
		if(result.length()<2 || result.length() > 5) {
			throw new NicNameLengthException();
		}
		if(result.contains("바보")) {
			throw new NicNameException();
		}
		return result;
	}
	
}

class NicNameException extends RuntimeException{ // 실행할 때 체크하겠다.
	public NicNameException() {
		super("부적절한 닉네임");
	}
	
}

class NicNameLengthException extends RuntimeException{
	public NicNameLengthException() {
		super("닉네임 길이가 2~5 글자 ");
	}
}