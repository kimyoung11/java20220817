package algorithm_prac.programmers;

public class p_이진변환 {
	static int cnt2 = 0;
	static int cnt1 = 0;

	public static void main(String[] args) {
		String s = "1111111";

		while (true) {
			cnt1++;
			if (s.equals("1")) {
				System.out.println(cnt2);
				System.out.println(cnt1-1);
				break;
			} else {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == '0') {
						cnt2++;
						s = s.substring(0, i) + s.substring(i + 1);
						i--;
					}
				}
				int newLen = s.length();
				s = Integer.toBinaryString(newLen);

			}
		}

	}

}
