package com.kwon.eh.main;

import java.util.Scanner;

public class EHMain2 {
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
		} catch (ArithmeticException ae) {
			System.out.println("나누기 0 안돼");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에 그런거 없음");
		}
		
		// i에 1쓰면 : 14, 15, 16, 17, 18
		// i에 0쓰면 : 14, 15문제발생, 20
		// i에 9쓰면 : 14, 15, 16, 17문제발생, 22
	}
}








