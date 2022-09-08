package ch10.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q12_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int []arr = new int[20000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			arr[a+10000000]++;
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			int b =Integer.parseInt(st.nextToken());
			sb.append(arr[b+10000000]);
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
