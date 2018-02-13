package com.kwon.uc.main;

public class UCMain3 {
	public static void main(String[] args) {
		// 기본형의 객체형을 만들때 사용하는 클래스
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
		// 기본형 -> String
		int d = 123;
		String dd = d + "";
		String ddd = String.format("ㅋㅋㅋㅋ%d", d);
		
		// String -> 기본형
		String e = "3.1412123";
		Double ee = Double.parseDouble(e);
		double eee = ee.doubleValue();
		
		String f = "23";
		int ff = Integer.parseInt(f);
	}
}









