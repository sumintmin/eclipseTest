package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample01 {
	public static void main(String[] args) {
		// ctrl shift o
		List list = new ArrayList(); // 리스트 기본타입 오브젝트
		list.add(1);
		list.add("abc");
		list.add(10.5);
		// 오브젝트 타입?
		
		// 언박싱하는 과정이 있다.
		
//		Object obj = list.get(0);
//		// 강제 타입 변환을 적어준다.
//		int num = (int)obj; // 오브젝트를 인트타입으로
//		System.out.println(num);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		int num = (int)list.get(1); // string을 int 로 바꿀 수 없다 에러
		
		
	}
}