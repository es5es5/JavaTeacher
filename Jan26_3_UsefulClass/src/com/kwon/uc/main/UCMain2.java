package com.kwon.uc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCMain2 {
	public static void main(String[] args) {
		// �ð�/��¥
		// java.util.Date��ü �⺻ ����
		Date d = new Date();
		// �׳� ���
		System.out.println(d);
		
		// Date -> String
		// y M d a h m s
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		// String -> Date
		String s2 = "2002/12-07";
		SimpleDateFormat sdf2 = new SimpleDateFormat("mmhh/MM-yy");
		try {
			Date d2 = sdf2.parse(s2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}















