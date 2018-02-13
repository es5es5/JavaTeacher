package com.kwon.eh.main;

import java.util.Scanner;

// error(����) : �ڹ� ������ �ȸ´°�
//				�������� ���ϴ�
//				���α׷��� �ϼ����� ����
//				������ �߸�

// warning(���) : �������� ���ߴٰų�, ������� �ʴ� �ڿ�
//				�ڵ尡 ������
//				���α׷��� ���������� �۵�
//				������ �߸�

// exception(����) : ���α׷��� ����
//					�����Ҷ� �߻��ϴ� ���ܻ�Ȳ ������ �������� ������ �ȵǴ°�
//					������ �߸� �ƴ�
//					�����ڰ� ���å�� ���������

public class EHMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("x : ");
		int x = keyboard.nextInt();

		System.out.print("y : ");
		int y = keyboard.nextInt();

		// �ϴ��� try{}���� ����, ���� ������ �׳� ������
		// ������ ����� catch�� �̵�
		try {
			int d = x / y;
			System.out.println(d);
		} catch (ArithmeticException ae) {
			System.out.println("������ 0 ������");
		}
		// ���������� : 33,34,41
		// ��������� : 33,36,41
		try {
			int[] ar = { 10, 20 };
			System.out.print("�迭�� ��� ���� : ");
			int i = keyboard.nextInt();
			System.out.println(ar[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �׷��� ����");
		}
		// ���������� : 41,42,43,44,51
		// ��������� : 41,42,43,44,46,51

		keyboard.close();
	}
}
