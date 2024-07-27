package kr.or.ddit.homework.home15;

import kr.or.ddit.util.ScanUtil;

public class SchedulerMain {
	public static void main(String[] args) {
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		String sel = ScanUtil.nextLine("선택하세요: ").toUpperCase();
		
		Scheduler sc = null;
		
		if(sel.contains("R")) sc = new RoundRobn();
		if(sel.contains("L")) sc = new LeastJob();
		if(sel.contains("P")) sc = new PriorityAllocation();
		
		sc.getNextCall();
		sc.sendCallToAgent();
		
	}
}