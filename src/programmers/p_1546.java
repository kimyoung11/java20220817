package programmers;

import java.util.Scanner;

public class p_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int []arr = new int[a];
		for(int i=0;i<a;i++)
			arr[i] = sc.nextInt();
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a;i++) {
			max = Math.max(max, arr[i]);
		}
		double sum = 0;
		for(int i=0;i<a;i++) {
			sum+= (double)arr[i] / max ;
		}
		System.out.println(sum * 100 / a);
		
	}
}
