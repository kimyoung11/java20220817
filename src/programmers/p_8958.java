package programmers;

import java.util.Scanner;

public class p_8958 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		while (n > 0) {
			String str = sc.nextLine();
			int cnt = 0;
			int sum = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O') {
					cnt++;
					sum = sum + cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);

			n--;
		}

	}
}
