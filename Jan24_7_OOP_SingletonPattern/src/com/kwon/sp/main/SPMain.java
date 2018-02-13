package com.kwon.sp.main;

import com.kwon.sp.avengers.Ironman;

public class SPMain {
	public static void main(String[] args) {
		// 자기 자신
		//		이름
		//		나이
		
		Ironman i1 = Ironman.getIronman();
		i1.print();
		System.out.println(i1);
		
		Ironman i2 = Ironman.getIronman();
		i2.print();
		System.out.println(i2);
		
	}
}
