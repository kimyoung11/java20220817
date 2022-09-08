package programmers;

import java.util.Arrays;

public class l1920 {
	public static void main(String[] args) {
		
		int accounts[][] = {{2,8,7},{7,1,3},{1,9,5}};
		int []sum = new int[accounts.length];
		
		for(int i=0;i<accounts.length;i++) {
			int sum2 = 0;
			for(int j=0;j<accounts[i].length;j++) {
				sum2 = sum2 + accounts[i][j];
			}
			sum[i] = sum2;
		}
		
		int max = sum[0];
		for(int i=1;i<sum.length;i++) {
			if(max < sum[i])
				max = sum[i];
		}
		System.out.println(max);
	}
}
