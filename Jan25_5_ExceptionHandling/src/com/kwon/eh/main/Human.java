package com.kwon.eh.main;

public class Human {
	
	public int divide(int a, int b) {
		try {
			int c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println("나누기 0 안돼");
			return 0;
		} finally { // 문제 발생 여부와 상관없이 무조건 실행, return보다 먼저 실행됨
			System.out.println("수고");			
		}
		
		// 정상 : 7, 13, 8
		// 사고 : 7사고발생, 10, 13, 11
		
	}
	
}

