package programmers;

import java.util.Arrays;

public class p_땅따먹기 {
	public static void main(String[] args) {
		
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int row = land.length;
		
		for(int i = 0; i < row-1; i ++) {
            land[i + 1][0] += Math.max(land[i][1], Math.max(land[i][2],land[i][3]));
            land[i + 1][1] += Math.max(land[i][0], Math.max(land[i][2],land[i][3]));
            land[i + 1][2] += Math.max(land[i][0], Math.max(land[i][1],land[i][3]));
            land[i + 1][3] += Math.max(land[i][0], Math.max(land[i][1],land[i][2]));
        }        
        
//        int answer = Math.max(Math.max(land[row-1][0],land[row-1][1]), Math.max(land[row-1][2],land[row-1][3]));
//        System.out.println(answer);
		
		System.out.println(Arrays.deepToString(land));
		
		int answer = Math.max(Math.max(land[row-1][0], land[row-1][1]), Math.max(land[row-1][2], land[row-1][3]));
		System.out.println(answer);
	}
}
