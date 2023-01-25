package algorithm_prac.binary;

public class binarySearch {
	public static void main(String[] args) {
		int[] nums = {12, 26, 31, 77, 85, 122, 430, 1101};
        int targetValue = 24;
		
        int target = binary(nums, targetValue);
        System.out.println(target);            // 찾으려던 값의 index 출력
    }
	static int binary(int[] nums, int target) {
		int start = 0; 
		int end = nums.length-1;
		//idx 시작과 끝
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(nums[mid] > target) {
				end = mid + 1;
				break;
			}
			else if(nums[mid] < target)
				start = mid + 1;
			else return mid;
		}
		
		return -1;
	}

}
