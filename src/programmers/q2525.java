package programmers;

import java.util.Scanner;

public class q2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); 
		int minute = sc.nextInt();
		int temp = sc.nextInt();
		
		int min = minute + temp;
		int h = min / 60;
		int m = min % 60;
		if(hour + h >= 24) {
			hour = hour -24;
		}
		System.out.println(hour + h + " " + m );
		
//		int all = hour * 60 + minute + temp;
//		if(all >=1440) {
//			System.out.println(all / 60 - 24 + " " + all%60);
//		}else
//			System.out.println(all / 60 +" "+ all%60);

	}
}
