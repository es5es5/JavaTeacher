package com.kwon.eh.main;

import java.util.Scanner;

// error(오류) : 자바 문법에 안맞는거
//				컴파일을 못하는
//				프로그램이 완성되지 않음
//				개발자 잘못

// warning(경고) : 뒷정리를 덜했다거나, 사용하지 않는 자원
//				코드가 지저분
//				프로그램은 정상적으로 작동
//				개발자 잘못

// exception(예외) : 프로그램은 정상
//					실행할때 발생하는 예외상황 때문에 정상적인 실행이 안되는거
//					개발자 잘못 아님
//					개발자가 대비책은 세워놨어야

public class EHMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("x : ");
		int x = keyboard.nextInt();

		System.out.print("y : ");
		int y = keyboard.nextInt();

		// 일단은 try{}속을 실행, 문제 없으면 그냥 지나감
		// 문제가 생기면 catch로 이동
		try {
			int d = x / y;
			System.out.println(d);
		} catch (ArithmeticException ae) {
			System.out.println("나누기 0 하지마");
		}
		// 문제없으면 : 33,34,41
		// 문제생기면 : 33,36,41
		try {
			int[] ar = { 10, 20 };
			System.out.print("배열에 몇번 볼래 : ");
			int i = keyboard.nextInt();
			System.out.println(ar[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에 그런거 없음");
		}
		// 문제없으면 : 41,42,43,44,51
		// 문제생기면 : 41,42,43,44,46,51

		keyboard.close();
	}
}
