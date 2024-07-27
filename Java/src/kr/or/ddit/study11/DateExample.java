package kr.or.ddit.study11;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.ddit.util.ScanUtil;

public class DateExample {

	public static void main(String[] args) {
		DateExample obj = new DateExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
//		method7();
//		method8();
//		method9();
//		method10();
		
		
	}
	
	
	
	public void method10() {
		Calendar cal = Calendar.getInstance();
		// day of week : 오늘이 일주일 중에 몇번째 날이냐
//		System.out.println(week);
		// 20일 뒤 날짜를 출력 주말 빼고
		// 반복문을 이용하여 출력한다.
		int cnt = 20;
		
		while(cnt >0) {
			cal.add(Calendar.DATE, 1);
			// 주말 체크
			int week = cal.get(Calendar.DAY_OF_WEEK); 
			if(week == 1 || week == 7) continue;
			cnt--;
			System.out.println(cal.getTime());
		}
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
		
	}
	
	public void method9() {
//		?? 월이 안오르는데?
		// 스캐너를 통해 더할 날짜를 입력받고 해당 날짜를 
		// yyyy/MM/dd 형식으로 출력하시오
		int day = ScanUtil.nextInt("더할 날짜 입력");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		Date date = cal.getTime();
		System.out.println(sdf.format(date));
		
		
	}
	
	public void method8() {// date객체 자체가 불편하니 calendar 객체로 효율적으로 써보자
		Calendar cal = Calendar.getInstance();
		// 데이터 변경 set
//		cal.Set(field, value);
//		cal.set(Calendar.YEAR, 2028);
//		cal.set(Calendar.DATE, 1);
//		cal.set(Calendar.HOUR, 1);
		
		// 시간 더하기
//		cal.add(Calendar.DATE, 100); // 100일 뒤
//		cal.add(Calendar.HOUR, 30); // 30시간 뒤
//		cal.add(Calendar.DATE, -1); // 어제 날짜
		
		// 값 가져오기
//		int day = cal.get(Calendar.DATE);
		
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.MONTH);
//		System.out.println(day);
		
		// Calendar -> date
//		Date date = cal.getTime();
//		System.out.println(date);
		
		
	}
	
	public void method7() {
		// 오늘로부터 특정 날짜가 몇일 뒤인지 출력하시오.
		String str = ScanUtil.nextLine("날짜 : ");
//		String str = "2025.02.06";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//		Date date2 = new Date();
		try {
			Date date = sdf.parse(str);
			Date cur = new Date();
			
			//2.6일과 현재시간 ms
			long time = date.getTime() - cur.getTime();
			long days = time/1000/60/60/24;
			System.out.println(days);
//			System.out.println(date);
//			System.out.println(date.getTime() - date2.getTime());
//			Date date3 = new Date(date.getTime()- date2.getTime());
					
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void method6() {
		// 오늘로부터 100일 뒤가 어떤 날짜인지 출력해보자!
		Date date = new Date();
		Date date2 = new Date(date.getTime() + 1000L*60*60*24*100);
		// 1000은 1초 차이
		System.out.println(date);
		System.out.println(date2);
		// 2024.07.25
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println("곰이 쑥과 마늘을 먹고 사람이 되는 날. 100일 뒤 " + sdf.format(date2));
		Date date3 = new Date(2025-02-06);
		
		
	}
	
	public void method5() {
		// string을 date로 바꾸기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println("형식을 맞춰서 입력해야합니다 yyyy.MM.dd");
		String str = ScanUtil.nextLine("날짜 : ");
		
		// TO_DATE
		try { // 위에서와 달리 트라이캐치가 왜 필요하냐, 입력시 형식이 다르면 에러나기 때문이다
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void method4() {
		Date date = new Date();
		System.out.println(date); // 이건 컴퓨터 시간 갖고온 것것
		// 서버와 자바 시간이 틀어지는 경우 
		// 왜 그럴까?
		// 오라클과 자바는 다르게 설치된 서버
		// SDF ctrl space
//		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		// 소문자 M은 분, 대문자 M은 월
		// hh는 1~12 HH는 0~23
		// a am/pm
		// TO_CHAR
		String str = sdf.format(date);
		System.out.println(str);
		
	}
	
	public void method3() {
//		BigInteger sum = 0;
		Date d1 = new Date();
		// 1~100만 까지 더하고 걸리는 시간을 출력하시오.
		// db 튜닝, 오더바이를 어디서 할 것이냐 이런것도 생각하면서 짜야됨
		// pk를 잘 걸어야됨 이유 : 속도때문에 
		// pk가 중요한 이유 외부 검색 시 인덱스로 활용함
		// 풀스캔 말고 목차로 쉽게 찾기
		// pk만들고 쿼리 날린거랑 어마어마하게 차이남
		// 1h -> 5s 엄청난 줄임
		// 복합키 : 키가 여러개 합쳐져서 pk로 씀.. -> 역할이 많이 떨어짐 긴거 안좋음
		// 복합키 다여섯개 -> 안건것과 같은 속도
		// 해결방법 : pk를 새로 만든다. 나머지는 fk레벨로 낮춤
		// ak라고 부르기도 함.. alter key?
		
		// 어디가 이슈 발생했는지 체크(시간 확인)
		// 벤치마크 : 시간 몇초 걸리는지 확인
		long sum = 0;
		for (long i = 1; i <= 1000000; i++) {
			sum +=i;
			System.out.println(sum);
		}
		Date d2 = new Date();
		long time = d2.getTime() - d1.getTime();
		System.out.println(time + "ms" + "");
	}
	
	public void method2() {
		Date d1 = new Date();
		
		try {
			Thread.sleep(1000); // 요 시간만큼 멈춘다 (= 1초동안 잠깐 멈춘다)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 빨간줄 , 실행예외가 아닌 일반예외
		
		Date d2 = new Date();
		
		long time = d2.getTime() - d1.getTime();
		System.out.println(time + "ms"+ "");
	}
	
	public void method1() {
		// 날짜 시간 처리
		
		// Date 시간 날자 관련된 클래스
		Date date = new Date(); // ctrl shift o 자바 유틸 데이트 선택
		
		// getTime 1970년 1월 1일 0시로부터 지난 시간을 나타냄
		// 단위 ms 
		long time = date.getTime();
		// 몇년 몇일 몇시 몇분 몇초 지났는지 출력하시오.
		
		long sec = 1000;
		long min = sec * 60;
		long hour = min * 60;
		long day = hour * 24;
		long year = day * 365; // 365.2522?
		
		long years = time/year;
		time%=year;
		long days = time/day;
		time%=day;
		long hours = time/hour;
		time%=hour;
		long mins = time/min;
		time%=min;
		long secs = time/sec;
		
		System.out.println(years + "년" + days + "일 " + hours + "시" + mins + "분" + secs + "초");
		
		
		
	}
}