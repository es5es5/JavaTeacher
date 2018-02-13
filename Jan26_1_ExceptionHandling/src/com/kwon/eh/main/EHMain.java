package com.kwon.eh.main;

public class EHMain {
	public static void main(String[] args) {
		Calculator c = new Calculator("c1234", "카시오");
		c.printInfo();
		System.out.println(c.getHab(10, 30));
		System.out.println(c.getMoks(3, 0));
		try {
			System.out.println(c.getMoks2(3, 2));			
		} catch (Exception e) {
			System.out.println("나누기 0 하지마");
		}
		
	}
}
