package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class q_2178 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		
		int [][]arr = new int[n+1][m+1];
		boolean [][]visited = new boolean[n+1][m+1];
	
		for(int i=1;i<=n;i++) {
			String str = br.readLine();
			for(int j=1;j<=m;j++) {
				arr[i][j] = str.charAt(j-1) - '0';
			}
		}


		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		Queue<MazePoint> queue = new LinkedList<>();
		queue.add(new MazePoint(1,1));
		visited[1][1] = true;
		
		while(!queue.isEmpty()) {
			MazePoint point = queue.remove();
			for(int i=0;i<dx.length;i++) {
				int xx = point.x + dx[i];
				int yy = point.y + dy[i];
				if(xx >= 1 && yy >= 1 && xx <=m && yy<=n) { //미로 내에서
					if(arr[yy][xx] !=0 && !visited[yy][xx]) { //갈수 있는 길이고, 방문아직 안한 곳이라면
						visited[yy][xx]= true; // 방문처리
						arr[yy][xx] = arr[point.y][point.x]+ 1; //다음길 탐색
						queue.add(new MazePoint(xx,yy)); //
					}
				}
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println((arr[n][m]));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write((arr[n][m]));
//		bw.flush();
//		bw.close();
	
	}
	
	static class MazePoint{
		int x;
		int y;
		MazePoint(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
}
