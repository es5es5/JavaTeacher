package com.kwon.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain3 {
	public static void main(String[] args) {
		ArrayList<String> juryu = new ArrayList<>();
		juryu.add("����");
		juryu.add("����");

		ArrayList<String> anjuryu = new ArrayList<>();
		anjuryu.add("�����");
		anjuryu.add("����");

		ArrayList<String> siksaryu = new ArrayList<>();
		siksaryu.add("�����");

		HashMap<String, ArrayList<String>> menu = new HashMap<>();
		menu.put("�ַ�", juryu);
		menu.put("���ַ�", anjuryu);
		menu.put("�Ļ��", siksaryu);
		////////////////////////////////
		Set<String> keys = menu.keySet();
		ArrayList<String> keys2 = new ArrayList<>(keys);
		for (String string : keys2) {
			System.out.println(string);
		}
		
		Scanner k = new Scanner(System.in);
		System.out.print("�� : ");
		String what = k.next();
		
		ArrayList<String> ryu = menu.get(what);
		for (String string : ryu) {
			System.out.println(string);
		}
		

	}
}












