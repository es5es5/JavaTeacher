package com.kwon.uc.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		// 수정이 불가능한 문자열 객체
		String s = new String("어우 추워");
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.indexOf("추"));
		System.out.println(s.startsWith("어"));
		System.out.println(s.endsWith("야"));
		System.out.println(s.replace('추', '더'));
		System.out.println(s.substring(1, 4));

		
		System.out.println("문자열 분리-----");
		
		String s2 = "감자,고구마,무";
		String[] s3 = s2.split(",");
		for (String string : s3) {
			System.out.println(string);
		}
		System.out.println("-----");
		StringTokenizer st = new StringTokenizer(s2, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("문자열 붙이기-----");
		String s4 = "에";
		//s4 = new String(s4 + "네");
		//s4 += "르";
		//s4 += "기";
		//s4 += "파";

		StringBuffer sb = new StringBuffer();
		sb.append(s4);
		sb.append("네");
		sb.append("르");
		sb.append("기");
		sb.append("파");
		
		String s5 = sb.toString();
		
		System.out.println(s5);
		////////////////////////////
		int age = 10;
		String name = "홍길동";
		
		String s6 = String.format("이름:%s, 나이:%d", name, age);
		System.out.println(s6);
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////
		Scanner keyboard = new Scanner(System.in);

		System.out.print("인사말 : ");
		String hello = keyboard.next();
		// 연산자들은 stack이 대상
		if (hello == "안녕") {
			System.out.println("반말하지마");
		} else {
			System.out.println("안녕하세요");
		}

	}
}
