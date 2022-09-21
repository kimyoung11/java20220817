package ch12.lecture;

class Task5 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5000;i++){
			System.out.println(this.getName() + " : " + i); // thread이름의 default 값은 Thread-n 인데 setName을 통해 이름 정해줄 수 있다. getName은 호출하는거
		}
	}
}

public class ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Task5();
		t1.setName("T1");
		t1.setPriority(10);
		t1.start();
		
		Thread t2 = new Task5();
		t2.setName("T3");
		t2.setPriority(1);
		t2.start();
	}
}
