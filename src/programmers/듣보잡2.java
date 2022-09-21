package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class 듣보잡2 {
	public static void main(String[] args) throws IOException {
		//hashset + 배열 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		HashSet<String> hs = new HashSet<>();
		String[] arr = new String[b];
		int cnt = 0;
		
		for(int i=0;i<a;i++) {
			hs.add(br.readLine());
		}
		
		for(int i=0;i<b;i++) {
			arr[i] = br.readLine();
		}
		
		System.out.println(hs);
		System.out.println(Arrays.toString(arr));
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<b;i++) {
			if(hs.contains(arr[i])) {
				al.add(arr[i]);
				cnt++;
			}
		}
		Collections.sort(al);
		System.out.println(cnt);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}
