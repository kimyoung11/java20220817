package algorithm_prac.bfs;

public class p_타겟넘버 {
	static int cnt = 0;

	public static void main(String[] args) {

		int[] numbers = {4,1,2,1};
		int target = 4;

		int sum = 0;

		dfs(numbers, 0, target, 0);
		System.out.println(cnt);

	}

	static void dfs(int[] numbers, int depth, int target, int sum) {
		if (depth == numbers.length) {
			if (target == sum) {
				cnt++;
			} 
		}else {
				dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
				dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
			}
	}
}
