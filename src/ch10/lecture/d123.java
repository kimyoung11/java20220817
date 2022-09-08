package ch10.lecture;

import java.util.Calendar;
import java.util.Scanner;

enum Week{
	MON,TUE,WED,THUR,FRI,SAT,SUN;
}
public class d123 {
	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-3939-3999";
		if(data.matches(regExp)) {
			System.out.println("일치");
		}else
			System.out.println("일치x");
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.co.kr";
		if(data.matches(regExp))
			System.out.println("일치");
		else {
			System.out.println("불일치");
		}
		Week today = Week.THUR;
		System.out.println(today);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getWeekYear());
		System.out.println(cal.get(Calendar.DATE));
		
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
	}
}