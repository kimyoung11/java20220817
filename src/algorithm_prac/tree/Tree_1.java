package algorithm_prac.tree;

import java.util.Arrays;
import java.util.Scanner;

public class Tree_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] parent = new int[n+1];
		for(int i=2;i<=n;i++) {
			parent[i] = i/2;
		}
		
		System.out.println(Arrays.toString(parent));
	}
}

