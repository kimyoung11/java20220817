package ch12.lecture;

import java.awt.Toolkit;

public class thread1 {
	public static void main(String[] args) throws Exception {
//		Thread thread = new Thread(new BeepTask());
//		
//		thread.start();
//		for(int i=0;i<5;i++) {
//			System.out.println("띵");
//			Thread.sleep(500);
//		}
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			Thread.sleep(500);
		}
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		for(int i=0;i<5;i++) {
			toolkit.beep(); //소리나게 하는 코드
			Thread.sleep(500);
		}
		// 위와 같은 코드 실행하면 위에서부터 차례로 실행. main 메소드하나만 돌아간다.
		// 0.5초마다 띵 출력 후 0.5초마다 소리난다
		// 병렬처리로 띵 출력이랑 소리가 같이나게 하고 싶다 -> thread 사용이유
		// Thread 클래스의 runnable 매개생성자 생성후 대입, runnable 객체에는 run 메소드가 정의되어 있다.
		
	}
}

class BeepTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

