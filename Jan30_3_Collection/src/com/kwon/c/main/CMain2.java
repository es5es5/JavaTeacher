package com.kwon.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain2 {
	public static void main(String[] args) {

		ArrayList<String> seoul = new ArrayList<>();
		seoul.add("����");
		seoul.add("�Ѱ�");
		seoul.add("������");

		ArrayList<String> suwon = new ArrayList<>();
		suwon.add("ȭ��");
		suwon.add("���ִ�");

		ArrayList<String> daegu = new ArrayList<>();
		daegu.add("�θ�� ��");
		daegu.add("...");

		HashMap<String, ArrayList<String>> korea = new HashMap<>();
		korea.put("����", seoul);
		korea.put("����", suwon);
		korea.put("�뱸", daegu);
		//////////////////////////////////////////
		// Map���� Key���� ����
		Set<String> loc = korea.keySet();
		ArrayList<String> loc2 = new ArrayList<>(loc);
		for (String string : loc2) {
			System.out.println(string);
		}
		System.out.println("-------");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("��� : ");
		String locName = keyboard.next();
	
		ArrayList<String> loc3 = korea.get(locName);
		for (String string : loc3) {
			System.out.println(string);
		}
		
	}
}










