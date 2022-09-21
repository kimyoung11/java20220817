package ch12.lecture;

class MovieThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("동영상 재생요");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MusicRunnable implements Runnable{ //바로 시작한게 아니라? 

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("음악 재생요");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}
