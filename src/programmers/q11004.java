package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q11004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a;i++) {
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		bw.write(String.valueOf(al.get(b-1)));
		
		bw.flush();
		br.close();
		bw.close();
		
//		int []arr = new int[a];
//		String[] str2 = br.readLine().split(" ");
//		for(int i=0;i<a;i++) {
//			arr[i] = Integer.parseInt(str2[i]);
//		}
//		Arrays.sort(str2);
//		System.out.println(str2[b-1]);
	}
}
