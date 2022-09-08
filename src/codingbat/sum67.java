package codingbat;

public class sum67 {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 2, 6, 99, 99, 7};
		boolean flag;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			flag = true;
			if(nums[i] == 6) {
				flag = false;
				int k = i;
				for(int j =k;j<nums.length;j++) {
					if(nums[j]==7) {
						flag=false;
						break;
					}
				}
			}
			if(flag) sum+=nums[i];
		}
		System.out.println(sum);
	}
}
