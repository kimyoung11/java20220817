package algorithm_prac.greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q_11047 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] coin = new int[N];
		int count = 0;
		
		for(int i=0;i<N;i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=N-1;i>=0;i--) {
			if(coin[i] <= M) {
				count += M / coin[i]; 
				M = M % coin[i];
				System.out.println(M);
			}
		}
		System.out.println(count);
	}
}
