package algorithm_prac.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1012 {

	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		String[] a = sc.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		int k = Integer.parseInt(a[2]);

		graph = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < k; i++) {
			String[] st = sc.nextLine().split(" ");
			int p = Integer.parseInt(st[0]);
			int q = Integer.parseInt(st[1]);
			graph[p][q] = 1;
		}
		System.out.println(Arrays.deepToString(graph));
	}

	static void bfs(int start, int end) {
		int cnt = 0;
		Queue<int[]> q = new LinkedList<>();

		q.offer(new int[] { start, end });
		visited[start][end] = true;
		while (!q.isEmpty()) {
			int[] poll = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int x = poll[0] + dx[i];
				int y = poll[1] + dy[i];

				if (x > 0 && y > 0 && x < graph[0].length && y < graph[1].length && !visited[x][y]) {
					q.offer(new int[] {x,y});
					visited[x][y]=true;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
