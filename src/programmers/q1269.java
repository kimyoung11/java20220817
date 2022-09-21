package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class q1269 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int []arr1 = new int[a];
		int []arr2 = new int[b];
		
		for(int i=0;i<a;i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0;i<b;i++) {
			arr2[i] = sc.nextInt();
		}
		// a-b랑
		// b-a를 구해야됨.
		
		for(int i=0;i<a;i++) {
			boolean flag = true;
			for(int j=0;j<b;j++) {
				if(arr1[i] == arr2[j])
					flag = false;
				else
					continue;
			}
			if(flag)
				System.out.println("arr1 :"+ arr1[i]);
		}
	}
}
