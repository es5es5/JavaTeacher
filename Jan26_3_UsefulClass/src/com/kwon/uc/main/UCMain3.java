package com.kwon.uc.main;

public class UCMain3 {
	public static void main(String[] args) {
		// �⺻���� ��ü���� ���鶧 ����ϴ� Ŭ����
		// Wrapper class
		int a = 10;
		Integer aa = new Integer(10);
		int aaa = aa.intValue();
		
		double b = 0.1;
		Double bb = new Double(b);
		
		// autoboxing, autounboxing
		Integer cc = 1;
		int ccc = cc;
		
		/////////////////////////
		// �⺻�� -> String
		int d = 123;
		String dd = d + "";
		String ddd = String.format("��������%d", d);
		
		// String -> �⺻��
		String e = "3.1412123";
		Double ee = Double.parseDouble(e);
		double eee = ee.doubleValue();
		
		String f = "23";
		int ff = Integer.parseInt(f);
	}
}









