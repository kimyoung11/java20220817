package ch01.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stackprac1 {
	static int[] stack = new int[1000000];
	static int cur = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String a = st.nextToken();
			
			
			if(a.equals("push")) {
				int b = Integer.parseInt(st.nextToken());
//				System.out.println("push 호출");
				push(b);
			}else if(a.equals("pop")) {
				pop();
			}else if(a.equals("size")) {
				size();
			}else if(a.equals("empty")) {
				empty();
			}else if(a.equals("top")) {
				top();
			}
		}
	}
	static void push(int item){
		stack[cur++] = item;
	}
	static void size() {
		System.out.println(cur);
	}
	static void empty() {
		if(cur==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
	static void top() {
		if(cur>=1) {
			System.out.println(stack[cur-1]);
		}else {
			cur=0;
			System.out.println(-1);
		}
	}
	static void pop() {
		if(cur>=1) {
		System.out.println(stack[cur-1]);
		cur--;
		}
		else {
			System.out.println(-1);
		}
	}
}
