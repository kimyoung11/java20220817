package programmers;

import java.util.Scanner;

public class p_2839 {
	public static void main(String[] args) {
		
		//dp 시작
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 5;
		int b = 3;
		
		int p = N / a; //3.6 -> 3
		int q = N / b; //6 -> 6
		int sum = 0;
		
		int r = 0;
		int s = 0;
		
		for(int i=p;i>=0;i--) {
			for(int j=0;j<=q;j++) {
				if((5 * i) + (3 * j) ==N) {
					sum = i + j;
					r = i;
					s = j;
					break;
				}else
					sum = -1;
			}
			if(r != 0 || s !=0)	break;
		}
		System.out.println(sum);
	}
}
