package algorithm_prac.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class q_2805 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] trees = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			trees[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(trees);
		int start = 0;
		int end = trees[N-1];
		
		while(start <= end) {
			int middle =(start + end) / 2; //10 15 17 20
			long treeSum = 0;
			int cutTree = 0;
			for(int i=0;i<trees.length;i++) {
				cutTree = trees[i] - middle;
				if(cutTree < 0)
					cutTree = 0;
			treeSum += cutTree;
			}
			if(treeSum >=M)
				start = middle + 1;
			else if(treeSum <M)
				end = middle - 1;
			System.out.println("start:"+ start + " " + "end:" +end);
			
		}
		System.out.println(end);
	}
}
