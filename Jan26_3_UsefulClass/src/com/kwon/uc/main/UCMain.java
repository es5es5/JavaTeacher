package com.kwon.uc.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		// ������ �Ұ����� ���ڿ� ��ü
		String s = new String("��� �߿�");
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.indexOf("��"));
		System.out.println(s.startsWith("��"));
		System.out.println(s.endsWith("��"));
		System.out.println(s.replace('��', '��'));
		System.out.println(s.substring(1, 4));

		
		System.out.println("���ڿ� �и�-----");
		
		String s2 = "����,����,��";
		String[] s3 = s2.split(",");
		for (String string : s3) {
			System.out.println(string);
		}
		System.out.println("-----");
		StringTokenizer st = new StringTokenizer(s2, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("���ڿ� ���̱�-----");
		String s4 = "��";
		//s4 = new String(s4 + "��");
		//s4 += "��";
		//s4 += "��";
		//s4 += "��";

		StringBuffer sb = new StringBuffer();
		sb.append(s4);
		sb.append("��");
		sb.append("��");
		sb.append("��");
		sb.append("��");
		
		String s5 = sb.toString();
		
		System.out.println(s5);
		////////////////////////////
		int age = 10;
		String name = "ȫ�浿";
		
		String s6 = String.format("�̸�:%s, ����:%d", name, age);
		System.out.println(s6);
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�λ縻 : ");
		String hello = keyboard.next();
		// �����ڵ��� stack�� ���
		if (hello == "�ȳ�") {
			System.out.println("�ݸ�������");
		} else {
			System.out.println("�ȳ��ϼ���");
		}

	}
}
