package programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class p_괄호회전 {
	public static void main(String[] args) {
		
		String s = "[](){}";
		Queue<Character> queue = new LinkedList<>();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			queue.add(s.charAt(i));
		}

		for(int i=0;i<s.length();i++) {
			System.out.println(queue.add(queue.poll()));
			for(int j=0;j<queue.size();j++) {
				if()
				
				
			}
			System.out.println(queue);			
		}
		
		for(int i=0;i<queue.size();i++) {
			
			if(queue.poll() == '{' || queue.poll() =='[' || queue.poll() =='(') {
				if(!queue.isEmpty())
					queue.remove(queue.poll());
				else
					queue.add(queue.poll());
			}else {
				if(!queue.isEmpty())
					queue.remove();
			}
		}
		
		System.out.println("this is last:" + queue);
		
		
	}
}
