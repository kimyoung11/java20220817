package ch01.lecture;

import java.util.Arrays;

public class umUm {
	public static void main(String[] args) {
		String s = "try hello world";
		s = s.toLowerCase();
		String answer = "";
		StringBuilder sb = new StringBuilder();
		char[] str = new char[s.length()];
		for(int i=0;i<s.length();i++)
			str[i] = s.charAt(i);
		
		int idx = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i] == ' '){
				idx=0;
			}else {
				if(idx%2 ==0) {
					str[i] = (char) (str[i] - 32);
					i++;
				}else {
					i++;	
				}
			}
		}
		for(int i=0;i<str.length;i++)
			sb.append(str[i]);
		answer= sb.toString();

	}
}
