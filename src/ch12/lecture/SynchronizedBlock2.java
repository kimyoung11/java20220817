package ch12.lecture;

public class SynchronizedBlock2 {
	public static void main(String[] args) throws Exception {
		Memo memo = new Memo();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000000;i++)
			{
				memo.increment();
			}
		});	
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000000;i++) {
				memo.increment();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(memo.getI()); // 이론적으로 2백만이 나와야 되는데 안나온다. 이유) read write 과정에 다른 작업이 수행될수도 있어서
		//2백만 나오게 하는방법 synchronizedblock 사용
		//		for(int i=0;i<1000000;i++) {
		//			synchronized (memo) {
		//				memo.increment();
		//			}
		//		}
	}
}

class Memo{
	private int i;
//	private static Object mutex = new Object();
	
	public int getI() {
		return i;
	}
	
	public void increment() {
		i++;
	}
}
