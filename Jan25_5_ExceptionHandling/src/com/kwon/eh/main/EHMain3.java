package com.kwon.eh.main;

import java.util.Scanner;

public class EHMain3 {
	public static void main(String[] args) {
		int[] ar = {123, 15};
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("i : ");
		int i = keyboard.nextInt();
				
		try {
			System.out.println("a");
			System.out.println(10 / i);
			System.out.println("b");
			System.out.println(ar[i]);
			System.out.println("c");
		} catch (Exception ae) {
			System.out.println("�Ͽ�ư ���� �߻�");
			ae.printStackTrace();// �����ڿ� : ���� �������� ���
		} finally {
			System.out.println("���� �߻����οʹ� ������� ������ ����");
		}
		
		// i�� 1���� : 14, 15, 16, 17, 18
		// i�� 0���� : 14, 15�����߻�, 20
		// i�� 9���� : 14, 15, 16, 17�����߻�, 20
	}
}








