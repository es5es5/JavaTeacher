package com.kwon.eh.main;

public class EHMain {
	public static void main(String[] args) {
		Calculator c = new Calculator("c1234", "ī�ÿ�");
		c.printInfo();
		System.out.println(c.getHab(10, 30));
		System.out.println(c.getMoks(3, 0));
		try {
			System.out.println(c.getMoks2(3, 2));			
		} catch (Exception e) {
			System.out.println("������ 0 ������");
		}
		
	}
}
