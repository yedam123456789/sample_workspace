package co.edu.thread;

import java.awt.Toolkit;

public class TheadExample {
	public static void main(String[] args) {

		// Thread의 생성자 매개값 (Runnable 구현객체)
		Thread beep = new Thread(new BeepTask());
		
		// Thread 클래스 상속 받은 하위클래스 생성자
		beep = new BeepWorkerThread();
		beep.start();

		// 콘솔
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
