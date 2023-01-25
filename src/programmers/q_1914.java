package programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class q_1914 {

	static int cnt = 0;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {

		int n = 3;
		
		
		cnt = hanoi(n, 1, 2, 3);
		System.out.println(cnt);
	}

	static int hanoi(int n, int from, int mid, int to) throws IOException {
		cnt++;
		if (n == 1) {
			
			sb.append(from);
			sb.append(" ");
			sb.append(to);
			bw.write(sb.toString());
			sb.setLength(0);

//			System.out.println(from + " " + to);
			return cnt;
		}

		else {
			hanoi(n - 1, from, to, mid);
			sb.append(from);
			sb.append(" ");
			sb.append(to);
			bw.write(sb.toString());
			sb.setLength(0);
//			System.out.println(from + " " + to);
			hanoi(n - 1, mid, from, to);
		}
		return cnt;
		
	}
}