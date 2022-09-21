package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class q9375 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		HashMap<String, String[]> hm = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		for(int i=0;i<b;i++) {
			String[] str = br.readLine().split(" ");
			hm.put(str[1],hm.getOrDefault(str[1], str[i][0]));
		}
		System.out.println(hm);
	}
}
