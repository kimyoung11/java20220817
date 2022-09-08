package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p3 {
	static ArrayList<Integer> list = new ArrayList<>();
//	static final int MAX = -9999;
//	static final int MIN = 9999;
	public static void main(String[] args) throws IOException {
//		String s = "1 2 3 4";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
//		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()){
			list.add(Integer.parseInt(st.nextToken()));
		}
//		System.out.println(Arrays.toString(arr));
//		arr = new int[st.countTokens()+1];
		
		int max = -9999;
		int min = 9999;
		for(int i=0;i<list.size();i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		for(int i=0;i<list.size();i++) {
			min = Math.min(list.get(i), min);
		}
		System.out.println(max + " " + min);
		StringBuilder sb = new StringBuilder();
		sb.append(min+" ");
		sb.append(max);
		System.out.println(sb.toString());
	}
}
