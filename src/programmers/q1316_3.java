package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class q1316_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean temp;
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			boolean []alp = new boolean[26];
			temp = true;
			for(int j=0;j<str.length();j++) {
				int idx = str.charAt(j) -'a';
				if(alp[idx]) //앞전에 나온 단어면
				{
					if(str.charAt(j) != str.charAt(j-1)) {
						temp= false;
						break;
					}
				}else {
					alp[idx] = true;
				}
			}
			if(temp)	cnt++;
		}
		System.out.println(cnt);
	}
}
