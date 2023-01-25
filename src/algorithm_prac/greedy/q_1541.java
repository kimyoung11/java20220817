package algorithm_prac.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class q_1541 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine(),"+-");
		int sum = 0;
//		System.out.println(st.countTokens());
		int []newArr = new int[st.countTokens()];
		for(int i=0;i<newArr.length;i++) {
			newArr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(Arrays.toString(newArr));
		
		if(newArr[0] ==0)
			sum = 0;
		

		System.out.println(sum);
	}
}
