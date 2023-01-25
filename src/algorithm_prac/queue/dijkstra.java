package algorithm_prac.queue;

public class dijkstra {
	public class Node implements Comparable<Node>{
		String vertex;
		int weight;

		public Node(String vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
}
