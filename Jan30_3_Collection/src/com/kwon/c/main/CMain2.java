package com.kwon.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain2 {
	public static void main(String[] args) {

		ArrayList<String> seoul = new ArrayList<>();
		seoul.add("남산");
		seoul.add("한강");
		seoul.add("차막힘");

		ArrayList<String> suwon = new ArrayList<>();
		suwon.add("화성");
		suwon.add("아주대");

		ArrayList<String> daegu = new ArrayList<>();
		daegu.add("부모님 댁");
		daegu.add("...");

		HashMap<String, ArrayList<String>> korea = new HashMap<>();
		korea.put("서울", seoul);
		korea.put("수원", suwon);
		korea.put("대구", daegu);
		//////////////////////////////////////////
		// Map에서 Key값만 추출
		Set<String> loc = korea.keySet();
		ArrayList<String> loc2 = new ArrayList<>(loc);
		for (String string : loc2) {
			System.out.println(string);
		}
		System.out.println("-------");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("어디 : ");
		String locName = keyboard.next();
	
		ArrayList<String> loc3 = korea.get(locName);
		for (String string : loc3) {
			System.out.println(string);
		}
		
	}
}










