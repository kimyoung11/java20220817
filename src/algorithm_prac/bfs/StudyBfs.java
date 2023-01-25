package algorithm_prac.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StudyBfs {
	
	static int[][] graph = { {}, { 2, 3, 8 }, { 1, 6, 8 }, { 1, 5 }, { 5, 7 }, { 3, 4, 7 }, { 2 }, { 4, 5 }, { 1, 2 } };
	static boolean[] visited = new boolean[graph.length];
	
	public static void main(String[] args) {
		
		System.out.println(bfs(1, graph, visited));
	}
	
	static String bfs(int start, int[][] graph, boolean[] visited) {
		
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");
			//큐에서 꺼낸 노드와 연결된 노드 체크
			for(int i=0;i<graph[nodeIndex].length;i++) {
				int temp = graph[nodeIndex][i];
				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
				}
			}
		}
		
		return sb.toString();
	}
}
