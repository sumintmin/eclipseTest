package kr.or.ddit.study13.list;

public class CustomArrayList {
	private String[] strList; // 원래 있어야되는데 디버깅땜에 없애?
	private int size; // 값 수정 불가능하게 private으로 지정
	
	
	
	public CustomArrayList() {
		strList = new String[10]; // 기본 공간을 10으로 시작한다.
	}
	
	public CustomArrayList(int size) {
		strList = new String[size];
		this.size = size;
	}
	
	public void add(String str) {
		// 자동 확장
		// arraylist가 빠를까 array가 빠를까
		// array가 빠른데 자동확장 기능떄문에 빠르다
		
		if(size == strList.length) {
			String[] tempList = new String[size+ 10];
			System.arraycopy(strList, 0, tempList, 0, size);
			strList = tempList;
		}
		strList[size++] = str;
	}
	
	public String get(int num) {
		return strList[num];
	}
	
	public int size() {
		return size;
	} // 전체 배열 값 몇 개 넣었는지
	
//	직접 바꾸면 문제생김
//	public int length() {
//		return length;
//	}
	
	// 1 2 3 4 5
	// 1 2 x 4 5	(x)
	// 1 2 4 5		(o)
	
	public String remove(int num) {// int num : 몇 번째 배열 값을 지울지
//		public void remove(int num) {// int num : 몇 번째 배열 값을 지울지
		String result = get(num);
		String[] tempList = new String[strList.length];
		System.arraycopy(strList, 0, tempList, 0, num);
		System.arraycopy(strList, num+1, tempList, num, strList.length-num-1);
//		System.arraycopy(strList, num+1, tempList, num, strList.length-num);
		strList = tempList;
		size--;
		return result;
		
	}
	
	
}