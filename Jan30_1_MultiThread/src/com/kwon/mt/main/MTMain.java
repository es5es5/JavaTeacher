// JVM�� thread�� �ϳ� ���� main���� ����
//		JVM�� ������� thread : main thread
//		�����ڰ� ���� thread : sub thread
// thread : �ڹ��ڵ带 �����ϴ� ��ü
package com.kwon.mt.main;

public class MTMain {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		// mt.run();
		mt.start(); // ���ο� thread���� run()���� ����
		
		Thread t = new Thread(new MyThread2());
		t.start();
		
		// t2�� ��ü : Thread�� ����Ŭ������ ���� ��ü, Ŭ�������� ��
		Thread t2 = new Thread() {
			@Override
			public void run() {
				super.run();
				for (int i = 0; i < 7; i++) {
					System.out.println("����");
					try {
						Thread.sleep(300); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		////////////////
		new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("-_-");
					try {
						Thread.sleep(500); // 0.5�� ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		
		
		
		/////
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500); // 0.5�� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}





