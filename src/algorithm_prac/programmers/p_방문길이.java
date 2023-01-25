package algorithm_prac.programmers;

import java.util.Arrays;

public class p_방문길이 {
	static int[][] map = new int[11][11];
	static int cnt = 0;
	public static void main(String[] args) {

		String dirs = "LULLLLLLU";
		boolean[] visited = new boolean[dirs.length()];
		int[] dx = {0, 0, 1, -1};
		int[] dy = {-1, 1, 0, 0};
		int currentX = 5;
		int currentY = 5;
		
		map[currentX][currentY] = 1;
		for (int i = 0; i < dirs.length(); i++) {
			switch (dirs.charAt(i)) {
			case 'U':
				currentX += dx[0];
				currentY += dy[0];
				System.out.println("1:"+currentX + " " + currentY);
				bfs(currentX , currentY);	
				break;
			case 'R':
				currentX += dx[2];
				currentY += dy[2];
				System.out.println("2:"+currentX + " " + currentY);
				bfs(currentX , currentY);	
				break;
			case 'D':
				currentX += dx[1];
				currentY += dy[1];
				System.out.println("3:"+currentX + " " + currentY);
				bfs(currentX , currentY);	
				break;
			case 'L':
				currentX += dx[3];
				currentY += dy[3];
				System.out.println("4:"+currentX + " " + currentY);
				bfs(currentX , currentY);	
				break;
			}
		}
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				System.out.print(map[j][i]+" ");
			}
			System.out.println();
		}
	
		System.out.println(cnt);
	}
	static void bfs(int currentX, int currentY) {
//		if(currentX>=0 && currentY>=0 && currentX<11 && currentY<11 && map[currentX][currentY] ==0)
//			map[currentX][currentY] = 1;
//		else if(currentX<0)
//			map[0][currentY] = 1;
//		else if(currentY<0)
//			map[currentX][0] =1;
//		else if(currentX>=11)
//			map[10][currentY]=1;
//		else if(currentY>=11)
//			map[currentX][10]=1;
		if(0>currentX || currentX>= 11 || 0>currentY || currentY>=11)
			return ;
		map[currentX][currentY]=1;
		cnt++;
	}
}
