package algorithm_prac.bfs;

public class p_피로도 {
	static boolean[] visited;
	static int answer = 0;
	public static void main(String[] args) {
		
		int k =80;
		
		int [][]dungeons = {{80,20},{50,40},{30,10}};
		
		
		//최소 필요 피로도, 소모 피로도
		//dungeons[k][0] dungeons[k][1]
		visited = new boolean[dungeons.length];
		
		int cnt = 0;
		solve(k,dungeons,cnt);

		System.out.println(answer);
	}

	private static void  solve(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            // visit[i]를 방문하지 않았고 피로도 조건이 맞으면
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                // 소모 피로도를 설정하고 재귀
                solve( k - dungeons[i][1] ,dungeons, cnt+1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
	}
}
