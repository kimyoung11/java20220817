package algorithm_prac.bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int x;
	int y;
	int depth;
	
	Node(int y,int x,int depth){
		this.x=x;
		this.y=y;
		this.depth=depth;
	}
	
}
public class p_게임맵최단거리 {

	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};
	static boolean[][] visit;
	public static void main(String[] args) {

		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

		int n = maps.length;
		int m = maps[0].length;
		
		
		visit= new boolean[n][m];
		int answer = Integer.MAX_VALUE;
		
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0,0,1));

		while(!q.isEmpty()) {
			Node temp = q.poll();
				
			if(temp.y == n-1 && temp.x == m-1) {
				answer = Math.min(answer, temp.depth);
				continue;
			}
			for(int dir = 0;dir<4;dir++) {
				int ny = dy[dir] + temp.y;
				int nx = dx[dir] + temp.x;
				
				if(ny <0 || nx < 0 || ny >=n || nx >= m || visit[ny][nx])
					continue;
				if(maps[ny][nx] ==0)
					continue;
				
				visit[ny][nx] = true;
				int cnt = temp.depth + 1;
				q.add(new Node(ny,nx,cnt));
				System.out.println(answer);
			}
		}
		
		if(answer == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(answer);
	}

}
