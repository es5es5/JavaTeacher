package com.kwon.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

public class CMain {
	public static void main(String[] args) {
		// ������ �ϳ�, ������ ������
		// [] : ó�� ���鶧 ����� ����
		int[] ar = { 10, 123, 121, 56 };
		
		
		// List�迭 : ���������� �迭
			// ArrayList, Vector, ...
		ArrayList al = new ArrayList();
		al.add("��");
		al.add("��");
		al.add(123);
		al.add(123.123);
		
		System.out.println( al.get(0)  );
		System.out.println( al.get(3)  );
		System.out.println("-----------------");
		
		// <xxx> : generic - Ư�� �ڷ����� �����Ҷ�
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);
		al2.add(20);
		al2.add(1, 30);
		al2.remove(0);
				
		for (int i = 0; i < al2.size(); i++) {
			System.out.println( al2.get(i)  );
		}
		/////////////////////////////////////////////////////////
		// Set�迭(����) : ���������� �迭, �ߺ��� ����, ��������
		//		HashSet, ...
		HashSet<String> hs = new HashSet<>();
		hs.add("������");
		hs.add("������");
		hs.add("�Ѥ�");
		hs.add("������");
		System.out.println(hs.size());
		// ����Ҷ� [] or List�� �ٲ㼭 ���
		// Set -> List
		ArrayList<String> al3 = new ArrayList<>(hs);
		for (String s : al3) {
			System.out.println(s);
		}
		// Set -> []
		String[] ar2 = hs.toArray(new String[hs.size()]);
		////////////////////////////////////////////////////////
		// Map�迭 : ����������, Key-Value��, ����x
		//		HashMap, HashTable, ...
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("������", 100);
		hm.put("����", 300);
		
		System.out.println( hm.get("����") );
		
	}
}














