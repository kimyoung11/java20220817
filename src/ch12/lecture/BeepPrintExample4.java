package ch12.lecture;

import java.awt.Toolkit;

class BeepThread extends Thread{ // thread 하위 클래스로부터 생성
	@Override
	public void run() {
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

public class BeepPrintExample4 {
	public static void main(String[] args) {
		
		Thread thread1 = new BeepThread();
		Thread thread2 = new Thread() { //내부 객체
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread3 = new Thread(() ->{ //람다식
			Toolkit tk = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				tk.beep();
				try {
					thread1.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();
	}
}
