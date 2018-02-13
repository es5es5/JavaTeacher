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
			System.out.println("하여튼 문제 발생");
			ae.printStackTrace();// 개발자용 : 무슨 문제인지 출력
		} finally {
			System.out.println("문제 발생여부와는 상관없이 무조건 여기");
		}
		
		// i에 1쓰면 : 14, 15, 16, 17, 18
		// i에 0쓰면 : 14, 15문제발생, 20
		// i에 9쓰면 : 14, 15, 16, 17문제발생, 20
	}
}








