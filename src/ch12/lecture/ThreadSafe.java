package ch12.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafe {
	public static void main(String[] args) throws Exception {
		
		
		AtomicInteger val = new AtomicInteger(0);  //앞에 synchronized 키워드 사용 말고 공유 객체 값 변경할때 사용하는 방법중 하나

		//결론: 공유 객체는 읽기 전용으로만 쓰자.
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<2000000;i++)
				val.incrementAndGet();
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<2000000;i++){
				val.incrementAndGet();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(val);
	}
}
