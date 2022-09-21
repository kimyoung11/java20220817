package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class q10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		int k=0;
		boolean []arr2 = new boolean[20000005];
		String[] a = br.readLine().split(" ");
		for(int i=0;i<a.length;i++) {
			arr2[Integer.parseInt(a[i])+10000000]=true;
	
//			System.out.println(a);
		}
	//	System.out.println(Arrays.toString(arr2));
		int m = Integer.parseInt(br.readLine());
		String[] b = br.readLine().split(" ");
		for(int i=0;i<b.length;i++) {
			if(arr2[Integer.parseInt(b[i])+10000000]) {
				sb.append(1);
				sb.append(" ");
			}else {
				sb.append(0);
				sb.append(" ");
			}
			//System.out.println(arr2[Integer.parseInt(b[i])+10000000]);
		}
		System.out.println(sb.toString());
	//	System.out.println(Arrays.toString(arr2));
//		int m = Integer.parseInt(br.readLine());
//		for(int i=0;i<m;i++) {
//			int temp2 = Integer.parseInt(br.readLine());
//			if(arr[temp2+10000000] !=0) {
//				System.out.println(arr[temp2]);
//			}
//		}
	}
}
