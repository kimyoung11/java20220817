package programmers;

import java.util.Arrays;

public class q_carpet {
	public static void main(String[] args) {

		int brown = 50;
		int yellow = 22;
		int sum = brown + yellow; // sum = 12, 9 , 48
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int[] answer= new int[2];
		//		System.out.println(Math.sqrt(sum));
		for (int i = 3; i <= sum; i++) {
			p = Math.max(sum / i -2, i -2);
			q = Math.min(sum / i -2, i -2);

			if (p >= 0 && q >= 0 && p * q == yellow) {
				if (2 * (p + q) + p * q + 4 == sum) {
//					System.out.println(p + " " + q);
					r = p;
					s = q;
					break;
				} 
			}
		}
		answer[0] = r+2;
		answer[1] = s+2;
		System.out.println(Arrays.toString(answer));
		// System.out.println(p + " " + q);
	}
}

