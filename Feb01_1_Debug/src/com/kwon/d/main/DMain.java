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
		// ctrl(좌) + f11 : 실행
		// breakpoint찍고 f11 : 디버그
		//		에서
		//			f5 : 다음 줄로(메소드 속으로까지 들어감)
		//			f6 : 다음 줄로(메소드 속으로는 안가고)
		//			f7 : 메소드 속을 보는 중일때 리턴
		for (int i = 0; i < c.length; i++) {
			e = c[i];
			Calculator ccc = new Calculator();
			System.out.println(ccc.add(76675, e));
		}
		
	}
}
















