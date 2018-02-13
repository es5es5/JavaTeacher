package com.kwon.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain3 {
	public static void main(String[] args) {
		ArrayList<String> juryu = new ArrayList<>();
		juryu.add("¼ÒÁÖ");
		juryu.add("¸ÆÁÖ");

		ArrayList<String> anjuryu = new ArrayList<>();
		anjuryu.add("°ñ¹ğÀÌ");
		anjuryu.add("°úÀÏ");

		ArrayList<String> siksaryu = new ArrayList<>();
		siksaryu.add("µÈÀåÂî°³");

		HashMap<String, ArrayList<String>> menu = new HashMap<>();
		menu.put("ÁÖ·ù", juryu);
		menu.put("¾ÈÁÖ·ù", anjuryu);
		menu.put("½Ä»ç·ù", siksaryu);
		////////////////////////////////
		Set<String> keys = menu.keySet();
		ArrayList<String> keys2 = new ArrayList<>(keys);
		for (String string : keys2) {
			System.out.println(string);
		}
		
		Scanner k = new Scanner(System.in);
		System.out.print("¹¹ : ");
		String what = k.next();
		
		ArrayList<String> ryu = menu.get(what);
		for (String string : ryu) {
			System.out.println(string);
		}
		

	}
}












