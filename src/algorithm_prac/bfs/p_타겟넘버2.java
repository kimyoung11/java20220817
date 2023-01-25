package algorithm_prac.bfs;

public class p_타겟넘버2 {
	static int cnt = 0;
	public static void main(String[] args) {
		
		int[] numbers = {4, 1, 2, 1};
		int target = 4;
		int depth = 0;
		int sum = 0;
		
		dfs(numbers,0,target,sum);
		System.out.println(cnt);
		
	}
	static void dfs(int []numbers, int depth, int target,int sum) {
		
		if(depth == numbers.length) {
			if(target == sum) {
				cnt++;
			}
		}else {
			dfs(numbers, depth+1, target, sum + numbers[depth]);
			dfs(numbers, depth+1, target, sum - numbers[depth]);
		}
	}
}
