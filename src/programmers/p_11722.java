package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class p_11722 {
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] cost = new int[n+1];
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		for(int i=1;i<=n;i++) {
			cost[i] = sc.nextInt();
		}
		
		for(int i=2;i<=n;i++) {
			dp[i] = 1;
			for(int j=1;j<i;j++) {
				if(cost[i] >cost[j]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
		}
		
		System.out.println(Arrays.toString(dp));
		Arrays.sort(dp);
		System.out.println(dp[n]);
	}
		
}
