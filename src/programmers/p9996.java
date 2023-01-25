package programmers;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class p9996 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> al = new ArrayList<>();
		String s = sc.nextLine();
		for (int i = 0; i < n; i++) {
			al.add(sc.nextLine());
		}
		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);

		String check = "^" + first + "[a-z]*" + last + "$";
		for (int i = 0; i < n; i++) {
			if (al.get(i).matches(check)) {
				sb.append("DA");
				sb.append("\n");
			} else {
				sb.append("NE");
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
