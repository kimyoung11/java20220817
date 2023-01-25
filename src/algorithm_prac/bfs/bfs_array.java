package algorithm_prac.bfs;

public class bfs_array {

	public static void main(String[] args) {
		
		int [][]arr = { {1,2,3},{4,5,6}, {7,8,9} };
		int []dy= {-1,1,0,0};
		int []dx = {0,0,-1,1};
		
		int posY =1;
		int posX =1;
		
		for(int i=0;i<4;i++) {
			int nY = posY + dy[i];
			int nX = posX + dx[i];
			System.out.println(nY + " " + nX);
		}
		
	}
}
