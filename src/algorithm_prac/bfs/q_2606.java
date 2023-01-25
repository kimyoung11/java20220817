package algorithm_prac.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_2606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.nextLine();
		int[][] graph = new int[n + 1][n + 1];
		boolean[] check = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			String str = sc.nextLine();
			int a = str.charAt(0) -'0';
			int b = str.charAt(2) -'0';
			graph[a][b] = graph[b][a] = 1;
		}
//		System.out.println(Arrays.deepToString(graph));
		bfs(1,graph,check);
	}

	static void bfs(int start, int[][] graph, boolean[] check) {
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		check[start] = true;
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			for(int i=1 ; i<graph[nodeIndex].length+1;i++) {
				if(!check[i] && graph[nodeIndex][i] == 1) {
					cnt++;
					check[i] = true;
					q.offer(i);
				}
			}
		}
		System.out.println(cnt);
		
	}
}