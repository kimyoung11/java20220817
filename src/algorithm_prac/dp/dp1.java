package algorithm_prac.dp;

import java.util.Arrays;

public class dp1 {
	
	static int[][] cost = {
			{5,8,10,1},
			{1,4,8,7},
			{7,8,3,1},
			{5,7,3,9}
	};
	static int[][] memo = new int[4][4];
	public static void main(String[] args) {
		Cost(3,3);
		System.out.println(memo[3][3]);
	}
	public static void Cost(int x, int y) {
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=y;j++) {
				if(i==0 && j ==0)
					memo[i][j] = cost[i][j];
				else if(i==0 && j !=0) {
					memo[i][j] = memo[i][j-1] + cost[i][j];
				}else if(i!=0 && j==0) {
					memo[i][j] = memo[i-1][j] + cost[i][j];
				}
				else {
					memo[i][j] = Math.min(memo[i][j-1], memo[i-1][j]) + cost[i][j];
				}
			}
		}
		
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=y;j++) {
				System.out.print(memo[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
