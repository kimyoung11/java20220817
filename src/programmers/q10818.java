package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class q10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int []arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int idx=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max = Math.max(arr[i], max);
			if(arr[i] == max) {
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx + 1);
	}
}
