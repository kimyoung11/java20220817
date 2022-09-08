package ch10.lecture;


import java.util.Scanner;

public class q20 {
	public static void main(String[] args) {

		int arr[] = new int[100001];
		
		Scanner sc = new Scanner((System.in));
		int p = sc.nextInt();
		for(int i=0;i<p;i++) {
			long q = sc.nextLong();
			arr[(int) q]++;
		}
		
		int r = sc.nextInt();
		for(int i=0;i<r;i++) {
			long s = sc.nextLong();
			System.out.println(arr[(int) s]);
		}
		
	}
}
