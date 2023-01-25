package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q_13414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int[] arr = new int[b];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!lhs.contains(arr[i])) {
				lhs.add(arr[i]);
			} else {
				lhs.remove(arr[i]);
				lhs.add(arr[i]);
			}
		}

		Iterator<Integer> it = lhs.iterator();
		while (it.hasNext()) {
				sb.append(String.format("%08d", it.next()));
				sb.append("\n");
				if(--a < 1) break;

		}
		
		System.out.println(sb);
		


	}
}
