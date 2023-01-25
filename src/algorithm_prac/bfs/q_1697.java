package algorithm_prac.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q_1697 {
	static boolean []visit;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int ans = dfs(a, b);
		System.out.println(ans);
		visit = new boolean[10];
		System.out.println(Arrays.toString(visit));
	}

	static int dfs(int start, int end) {
		cnt++;
		if (start == end)
			return start;
		else {
			if(start > end)
				return dfs(start-1,end);
			return Math.min(dfs(2*start, end), dfs(start+1,end));
		}
	}
}
