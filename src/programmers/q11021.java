package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int t = Integer.parseInt(str);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int x = 1; x <= t; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + x + ": " + (a+b) +"\n");
			bw.flush();
		}
			
	}
}
