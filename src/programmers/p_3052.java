package programmers;

import java.util.Scanner;

public class p_3052 {
	public static void main(String[] args) {
		
		int []remain = new int[42];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int temp = sc.nextInt();
			remain[temp%42]++;
		}
		
		int cnt = 0;
		
		for(int i=0;i<remain.length;i++) {
			if(remain[i] !=0)
				cnt++;
		}
		System.out.println(cnt);
		
	}
}
