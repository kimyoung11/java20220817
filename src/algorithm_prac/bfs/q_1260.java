package algorithm_prac.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q_1260 {
	static int N;
	static int M;
	static int V;
	static int[][] graph;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		graph = new int[N + 1][N + 1];
		visit = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());

			graph[p][q] = graph[q][p] = 1;
		}
		
		System.out.println(Arrays.deepToString(graph));
		dfs(V);

		visit = new boolean[N + 1];
		System.out.println();
		bfs(V);
	}

	static void bfs(int start) {
		visit[start] = true;
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		System.out.print(start + " ");
		while (!q.isEmpty()) {
			int top = q.poll();
			for (int j = 1; j <= N; j++) {
				System.out.println("호출");
				if (graph[top][j] == 1 && !visit[j]) {
					q.offer(j);
					visit[j] = true;
					System.out.print(j + " ");
				}

			}
		}
	}

	static void dfs(int start) {
		visit[start] = true;
		System.out.print(start + " ");
		for (int j = 1; j <= N; j++) { // 그래프 순회하는 길이 정해져있다
			if (graph[start][j] == 1 && !visit[j])
				dfs(j);
		}
	}
}
