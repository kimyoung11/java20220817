package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class p_짝지어제거 {
	public static void main(String[] args) {

		String s = "baabaa";
		int answer = -1;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(stack.isEmpty()) stack.push(c);
			else {
				if(stack.peek() == c)
					stack.pop();
				else
					stack.push(c);
				
			}
		}
		answer = stack.isEmpty() ? 1 : 0;
		System.out.println(answer);
		
	}
}
