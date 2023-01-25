package programmers;

import java.util.LinkedList;
import java.util.Queue;


public class p프린터 {
	public static class Print{
		int index;
		int value;
		public Print(int index, int value) {
			this.index = index;
			this.value = value;
		}
		@Override
		public String toString() {
			return "Print [index=" + index + ", value=" + value + "]";
		}
		
	}
	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1}; // 1,1,9,1,1,1
		int location = 0;             // location = 0;
		int answer = 0;
//		0 : 2
//		1 : 1
//		2 : 3
//		3 : 2
		Queue<Print> q = new LinkedList<>();
		
		// location = 0일때,,,,,,,,,,,,
		// 
		for(int i=0;i<priorities.length;i++) {
			q.add(new Print(i, priorities[i]));
		}
//		System.out.println(q);
		int now = 0;
		while(!q.isEmpty()) {
			Print temp = q.poll();
			boolean flag=false;
			for(Print a : q) {
				if(temp.value < a.value) { // 1 > 9
					flag = true;
				}
			}
			if(flag) {
				q.add(temp);
			}else {
				now++;
				if(temp.index == location) {
					answer = now;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
