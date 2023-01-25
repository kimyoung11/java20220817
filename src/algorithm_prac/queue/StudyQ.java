package algorithm_prac.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StudyQ {
	public static void main(String[] args) {
		
		Queue<int []> q = new LinkedList<>();
		q.offer(new int[] {1,2});
		q.offer(new int[] {3,4});
		
		Iterator<int []> it =q.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()[0]);
			System.out.println(it);
		}
		System.out.println("-----------");
		System.out.println(q.poll()[0]);
		System.out.println(q.poll()[1]);
	}
}
