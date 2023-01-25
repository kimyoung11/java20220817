package algorithm_prac.bfs;

import java.util.Arrays;

public class p_단어변환 {
	static boolean []visited;
	static int answer = 0;
	public static void main(String[] args) {
		
		String begin="hit";
		String target="cog";
		String[] words={"hot", "dot", "dog", "lot", "log", "cog"};
		
		visited = new boolean[words.length];
		
		dfs (begin, target, words, 0);
		System.out.println(answer);
	}
	
	static void dfs(String begin, String target, String[] words, int depth) {
		//System.out.println("함수 호출 될때 depth:" +depth);
		if(begin.equals(target))
		{
			answer = depth;
			System.out.println(answer+ " " + Arrays.toString(visited));
			return ;
		}
		for(int i=0;i<words.length;i++) {
			if(visited[i])
				continue;
			int len = 0;
			for(int j=0;j<begin.length();j++) {
				if(begin.charAt(j) == words[i].charAt(j)) {
					len++;
				}
			}
			if(len == (begin.length()-1)) {
				visited[i] = true;
//				System.out.println(begin);
//				System.out.println(i+ " " + visited[i] + " " + words[i] + " : 호출 횟수");
				dfs(words[i], target, words, depth + 1);
//				System.out.println(i+ " " + visited[i] + " " + words[i] + " :호출 횟수2");
				visited[i] = false;
			}
		}
	}
}
