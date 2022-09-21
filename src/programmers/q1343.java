package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class q1343 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String a = "AAAA";
		String b = "BB";
		boolean[] check = new boolean[str.length()];
		//2 4 6 8 10 12 14 16 18 X가 2의 배수로 붙어있어야됨
		int cnt=0;
		boolean flag = false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.') {
				check[i] = true;
			}
		}
		int []idx = new int[50];
		int j=0;
		for(int i=0;i<check.length;i++) {
			if(check[i]) {
				idx[j] = i;
				while(!check[i]) {
					i++;
				}
			}
			j++;
		}
		System.out.println(Arrays.toString(idx));
		for(int i=0;i<idx.length;i++) {
			if(idx[i] !=0) {
				flag = true;
				if()
				cnt++;
			}else
				flag=false;
			System.out.println(cnt);
		}
	}
}
