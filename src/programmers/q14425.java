package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class q14425 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		HashSet<String> hs = new HashSet<>();
		String[] arr = new String[m];
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			hs.add(br.readLine());
		}
		
		for(int i=0;i<m;i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0;i<m;i++) {
			if(hs.contains(arr[i]))
				cnt++;
		}
		System.out.println(cnt);
	}
}
