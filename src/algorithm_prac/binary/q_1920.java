package algorithm_prac.binary;


import java.util.Arrays;
import java.util.Scanner;

public class q_1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []arr1 = new int[a];
		for(int i=0;i<a;i++)
			arr1[i] = sc.nextInt();
		int b = sc.nextInt();
		int []arr2 = new int[b];
		for(int i=0;i<b;i++)
			arr2[i] = sc.nextInt();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int start = 0;
		int last = a-1;
		int j = 0;
		
		while(start <= last) {
			int mid = (start + last) / 2;
			if(arr1[mid] > arr2[j]) {
				
			}
		}
	}
}
