package ch12.lecture;

import java.awt.Toolkit;

public class thread2 {
	public static void main(String[] args) {
		//thread 생성 방법1 runnable 인터페이스 채우기
		Thread t1 = new Thread(new Task1());  //thread 객체 task1 생성
		Thread t2 = new Thread(new Task2());  
		
		t1.start(); //쓰레드 클래스 start 메소드 실행 : 스레드 실행 메소드
		t2.start();
	}
}
class Task2 implements Runnable { //runnable 인터페이스 unimplemented method인 run method에 수행 코드 작성 
	@Override
	public void run() { // 
		// 소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
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

class Task1 implements Runnable {
	@Override
	public void run() {
		// 문자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

