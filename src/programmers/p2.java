package programmers;

import java.util.Arrays;

public class p2 {
	public static void main(String[] args) {
		
		int n=5;
		long answer =0;
		int []arr = new int[2001];
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=3;i<=n;i++) {
			arr[i] = arr[i-2] + arr[i-1];
			arr[i] = arr[i]%1234567;
		}
	
		System.out.println(arr[n]);	
		
	
//	int []arr = new int[10];
//	Arrays.fill(arr, 1000);
//	System.out.println(Arrays.toString(arr));
//	int []arr2 = new int[]{100,100,100};
//	System.out.println(Arrays.toString(arr2));
//	int []arr3 = new int[]{};
//	System.out.println(arr3.length);
//	}
	}

}
