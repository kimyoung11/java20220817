package algorithm_prac.bfs;

public class permutationMain {
	public static void main(String[] args) {

		String[] arr = new String[] {
				"A", "B", "C","D" };

		permutation(arr, 0, arr.length - 1);
	}

	static void permutation(String[] arr, int start, int end) {
		if (start == end) {
			for (String i : arr)
				System.out.print(i + " ");
			System.out.println(" ");
		} else {
			for (int i = start; i <= end; i++) {
				swap(arr, start, i);
				permutation(arr, start + 1, end);
				swap(arr, start, i);
			}
		}
	}

	static void swap(String[] arr, int start, int index) {
		String temp;
		temp = arr[start];
		arr[start] =arr[index];
		arr[index]=temp;
	}
}
