package com.kwon.d.main;

import java.util.ArrayList;

public class DMain {
	public static void main(String[] args) {
		int a = 132789;
		int b = 2313;
		
		int[] c = { 123, 6234, 1231, 3 };
		
		ArrayList<Integer> d = new ArrayList<>();
		d.add(123123);
		d.add(76676);
		
		int e = 234;
		int f = 45;
		// ctrl(��) + f11 : ����
		// breakpoint��� f11 : �����
		//		����
		//			f5 : ���� �ٷ�(�޼ҵ� �����α��� ��)
		//			f6 : ���� �ٷ�(�޼ҵ� �����δ� �Ȱ���)
		//			f7 : �޼ҵ� ���� ���� ���϶� ����
		for (int i = 0; i < c.length; i++) {
			e = c[i];
			Calculator ccc = new Calculator();
			System.out.println(ccc.add(76675, e));
		}
		
	}
}
















