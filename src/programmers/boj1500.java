package programmers;

import java.io.IOException;



public class boj1500 {
	public static void main(String[] args) throws IOException {
		
		int n = 1;
		int ans = 0;
		
		
		while(true) {
			
			if(n ==1) {
				ans++;
				break;
			}
			if(n%2==1) {
				ans++;
			}
			
	
			n=n/2;
				
		}
		System.out.println(ans);
		
		
	}
}
