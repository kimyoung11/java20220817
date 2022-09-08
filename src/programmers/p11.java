package programmers;

import java.util.Arrays;

public class p11 {
	public static void main(String[] args) {

		String allowed="abc";
		String[] words= {"a","b","c","ab","ac","bc","abc"};

		int cnt = 0;
		for(int i=1;i<=allowed.length();i++) {
			String temp = allowed.substring(0,i);
			for(int j=0;j<words.length;j++) {
				if(words[j].contains(temp)||words[i].equals(temp))
					cnt++;
				}
			}
		System.out.println(cnt);
		}
}

