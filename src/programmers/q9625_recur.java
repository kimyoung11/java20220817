package programmers;

import java.util.Scanner;

public class q9625_recur {
//	static int a = 0;
//	static int b = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		System.out.println(findA(n) + " " + findB(n));
	}
	static int findA(int n) {
		if(n==1)	return 0;
		else if(n==2 ||n==3)	return 1;
		else {
			return findA(n-2) + findA(n-1);
		}
//		return 0;
	}
	static int findB(int n) {
		if(n==1 || n==2) {
			return 1;
		}else if(n==3) {
			return 2;
		}
		else {
			return findB(n-2) + findB(n-1);
		}
//		return 0;
	}
}
