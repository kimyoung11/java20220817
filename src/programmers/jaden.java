package programmers;

import java.util.Arrays;

public class jaden {
	public static void main(String[] args) {
		
		String s = "3people unFollowed me";
		String[] temp = s.split(" ");
		int []idx = new int[temp.length];

		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length();j++) {
				if(temp[i].charAt(j) >='a' && temp[i].charAt(j) <='z') {
					idx[i] = j;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(idx));
	}
}
