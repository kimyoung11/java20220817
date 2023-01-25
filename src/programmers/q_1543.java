package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1543 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); //9
		String find = br.readLine(); //3
		int ans = 0;
		for(int i=0;i< input.length() - find.length() + 1;i++) {
			String temp = input.toString().substring(i, i+find.length());
			if(find.equals(temp)) {
				ans++;
				i = i + find.length();
				i--;
			}
		}
		System.out.println(ans);

	}
}
