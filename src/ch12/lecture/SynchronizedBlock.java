package ch12.lecture;

public class SynchronizedBlock {
	public static void main(String[] args) throws Exception {
		int[] arr = {0};
		
		Object lock = new Object();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<10000000;i++) {
				synchronized(lock) { // 동기화 블록, 괄호 안에 객체를 넣어준다. 먼저 객체를 얻은 후에 내부 코드실행 후 객체 반납
					arr[0]++;
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<10000000;i++) {
				synchronized(lock) {
					arr[0]++;					
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join(); //thread1 종료될때까지 기다림
		t2.join(); //thread2 종료될때까지 기다림
	
		
		
		System.out.println(arr[0]);
	}
}

