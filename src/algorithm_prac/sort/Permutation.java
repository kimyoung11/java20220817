package algorithm_prac.sort;

public class Permutation {
	public static void main(String[] args) {
		
		//순열
		
		int[] arr = {1,2,3}; //순열 만들 배열
		int n = arr.length;  // 배열 길이
		int[] output = new int[n]; //순열 출력 배열
		boolean[] visited = new boolean[n]; // 방문 체크 배열
		
		per1(arr,0,n,3); //swap함수 구현 arr -> 배열 / 0 -> 초기 depth  n , r = n개중에서 r개 뽑는 경우  
		
	}

	static void per1(int[] arr, int depth, int n, int r) {
		if(depth == r) {
			print(arr,r);
			return ;
		}
		
		for(int i=depth; i<n;i++) {
			swap(arr,depth,i);
			per1(arr,depth+1,n,r);
			swap(arr,depth,i);
		}
	}

	static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

	static void print(int[] arr, int r) {
		for(int i=0;i<r;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
