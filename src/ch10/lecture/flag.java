package ch10.lecture;

import java.util.Arrays;

public class flag {
	public static void main(String[] args) {
		
		
		int[] a = {1,5,3,4,6,8,9};
		int[] b = {2,4,8,9,10,5};
		String str = "6 3 2 5 6 6 6 6 6 5 5";
		String ch = "5";
		int []k = new int[15];
		String[] p = str.split(" ");
		for(int i=0;i<p.length;i++) {
			k[Integer.parseInt(p[i])]++;
		}
		System.out.println(Arrays.toString(k));
		int q = Integer.parseInt(ch);
		System.out.println("해당숫자:" +q +"는" + k[q]+"번 나왔습니다");


	}
}
