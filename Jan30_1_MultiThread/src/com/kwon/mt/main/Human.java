package com.kwon.mt.main;

public class Human {
	private String brain;

	// synchronized�޼ҵ� : 
	//		� synchronized�޼ҵ尡 ����Ǵ� �߿���
	//		�ٸ� synchronized�޼ҵ尡 ������� ����
	public synchronized void sayNickname() {
		for (int i = 0; i < 5; i++) {
			brain = "�ٺ�";
			try {
				Thread.sleep(300);
				System.out.printf("���� : %s\n", brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void sayHobby() {
		for (int i = 0; i < 5; i++) {
			brain = "����";
			try {
				Thread.sleep(700);
				System.out.printf("��� : %s\n", brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void introduce() {
		new Thread() {
			public void run() {
				sayHobby();
			};
		}.start();
	
		sayNickname();
	}

}













