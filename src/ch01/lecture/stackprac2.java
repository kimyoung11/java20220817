package ch01.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stackprac2 {
	//bufferedreader에 stringtokenizer조합 ㄱㄱ
	static Stack<Integer> stack = new Stack<>();
	static int cur =0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		System.out.println(N);
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String a = st.nextToken();
			if(a.equals("push")) {
				int b = Integer.parseInt(st.nextToken());
				stack.push(b);
			}else if(a.equals("pop")) {
				if(stack.size()>=1) {
					System.out.println(stack.pop());
				}
				else
					System.out.println(-1);
			}else if(a.equals("size")) {
				System.out.println(stack.size());
			}else if(a.equals("empty")) {
				System.out.println(stack.empty() ? 1 : 0);
			}else if(a.equals("top")) {
				if(stack.size()>=1)
					System.out.println(stack.peek());
				else
					System.out.println(-1);
			}
		}
		
	}
}
