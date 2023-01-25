package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_11726 {
	static int dpSum = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.valueOf(br.readLine());
		System.out.println(dp(a) % 10007);
		
	}
	private static int dp(int n) {
		if(n==1)
			return dpSum = 1;
		else if(n==2)
			return dpSum = 2;
		else
			return dpSum + dp(n); 
		
	}
}
