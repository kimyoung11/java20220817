package programmers;

import java.util.Stack;

public class p_올바른괄호 {
	public static void main(String[] args) {

		String s = "())()(()";
		boolean answer = true;
		int idx = -1111;
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.add("(");
			} else {
				if (i==0) {
					answer = false;
					idx=i;
					break;
				}
				else{
					if(!stack.isEmpty())
						stack.pop();
				}
			}
		}
		if(idx==0) {
			answer = false;
			System.out.println("여기서나옴?");
		}
		else {
			if(stack.size()==0)
				answer=true;
			else
				answer=false;
		}
		System.out.println(stack.size());
		System.out.println(answer);
	}

}
