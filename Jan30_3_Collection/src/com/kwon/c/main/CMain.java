package com.kwon.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

public class CMain {
	public static void main(String[] args) {
		// 변수는 하나, 데이터 여러개
		// [] : 처음 만들때 사이즈가 고정
		int[] ar = { 10, 123, 121, 56 };
		
		
		// List계열 : 가변사이즈 배열
			// ArrayList, Vector, ...
		ArrayList al = new ArrayList();
		al.add("ㅋ");
		al.add("ㅎ");
		al.add(123);
		al.add(123.123);
		
		System.out.println( al.get(0)  );
		System.out.println( al.get(3)  );
		System.out.println("-----------------");
		
		// <xxx> : generic - 특정 자료형을 지정할때
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);
		al2.add(20);
		al2.add(1, 30);
		al2.remove(0);
				
		for (int i = 0; i < al2.size(); i++) {
			System.out.println( al2.get(i)  );
		}
		/////////////////////////////////////////////////////////
		// Set계열(집합) : 가변사이즈 배열, 중복을 없앰, 순서랜덤
		//		HashSet, ...
		HashSet<String> hs = new HashSet<>();
		hs.add("ㅋㅋㅋ");
		hs.add("ㅎㅎㅎ");
		hs.add("ㅡㅡ");
		hs.add("ㅋㅋㅋ");
		System.out.println(hs.size());
		// 사용할때 [] or List로 바꿔서 사용
		// Set -> List
		ArrayList<String> al3 = new ArrayList<>(hs);
		for (String s : al3) {
			System.out.println(s);
		}
		// Set -> []
		String[] ar2 = hs.toArray(new String[hs.size()]);
		////////////////////////////////////////////////////////
		// Map계열 : 가변사이즈, Key-Value쌍, 순서x
		//		HashMap, HashTable, ...
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("종이컵", 100);
		hm.put("볼펜", 300);
		
		System.out.println( hm.get("볼펜") );
		
	}
}














