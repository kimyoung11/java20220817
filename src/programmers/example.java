package programmers;

import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%4!=0)
			System.out.println("0");
		else {
			//윤년 1 아니면 0
			if(a%100 != 0 || a%400 ==0)
				System.out.println("1");
			else
				System.out.println("0");
		}
		
		char k = 'a';
		char l = 'b';
		char m = 'c';
		char n = 'd';
		String k2 = Character.toString(k+l+m+n);
		String k3 = k+""+l+""+m+""+n+"";
		System.out.println(k2);
		System.out.println(k3);
	}
}
