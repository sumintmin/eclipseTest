package kr.or.ddit.homework;

import java.util.Calendar;

import kr.or.ddit.util.ScanUtil;

public class Homework16 {
	public static void main(String[] args) {
		Homework16 obj = new Homework16();
		obj.process();
	}
	
	
	public void process() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day_of_max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int start = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < start; i++) System.out.println("\t");
		cal.set(Calendar.DATE, 1);
		
		while(true) {
			
			System.out.printf("\t\t%d년 %d월 \n",year, month);
			System.out.println("====================================================");
			System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat");
			System.out.println("====================================================");
			
			for(int i = 1; i<= day_of_max; i++) {
				int week = cal.get(Calendar.DAY_OF_WEEK);
				if( i==1){
					for(int j = 0; j <6-(7-week) ; j++) {
						System.out.print("\t");}
				}
				System.out.print( i + "\t");
				if(week == 7) System.out.println();
				cal.add(Calendar.DATE, 1);
			}System.out.println();
			String sel = ScanUtil.nextLine("<: 이전달  다음달 : >");
			if(sel.equals("<")) {
				month -=1;
			}
			if(sel.equals("<")) {
				month +=1;
			}
		}
	}
}