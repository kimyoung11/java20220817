package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class q1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int cnt = a;
		for(int i=0 ;i<a;i++) {
			String str = br.readLine(); //aba
			boolean []ch = new boolean[26];
			for(int j=0;j<str.length();j++) { //3
				if(ch[str.charAt(j)-'a']) { 
					if(str.charAt(j)!= str.charAt(j-1)) {
						cnt--;
						break;
					}
				}
				ch[str.charAt(j)-'a']=true;
			}
		}
		System.out.println(cnt);
	}
}	
