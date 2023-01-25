package algorithm_prac.bfs;

import java.util.Scanner;

public class q_11724 {
	static int N;
	static int M;
	static int [][]adj;
	static boolean[] visit;
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		N= sc.nextInt();
		M= sc.nextInt();
		
		adj = new int[N+1][N+1];
		
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a][b] = adj[b][a] = 1;
		}
		int cnt = 0;
		visit = new boolean[N+1];
		for(int i=1;i<N+1;i++) {
			if(!visit[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static void dfs(int start) {
		visit[start] = true;
		for(int i=1;i<=N;i++) {
			if(adj[start][i] ==1 && !visit[i])
				dfs(i);
		}
	}
}
