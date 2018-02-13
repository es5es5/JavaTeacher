package com.kwon.eh.main;

public class EHMain {
	public static void main(String[] args) {
		Calculator c = new Calculator("", "");
		//System.out.println(c.getMoks(10, 0));
		try {
			System.out.println(c.getMoks2(10, 0));
		} catch (Exception e) {
			System.out.println("0 쓰지 마세요");
		}
	}
}
