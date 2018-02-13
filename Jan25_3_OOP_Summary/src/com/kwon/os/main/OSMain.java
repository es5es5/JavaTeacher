package com.kwon.os.main;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.kwon.os.space.Human;
import com.kwon.os.space.Planet;
import com.kwon.os.space.PowerRanger;

public class OSMain {
	public static void main(String[] args) {
		// �̸��� ������ �༺�����
		Planet p = new Planet("����");
		
		// ����� 100
		p.setSize(100);
		
		// �̸��� ȫ�浿�� ��� �����
		Human h = new Human("ȫ�浿");
		
		// ������ ȫ�浿�� ����
		p.add(h);
		
		// ���� �������̽��� �����ϴ� �Ŀ������� Ŭ���� �����
		// �Ŀ������� �����
		PowerRanger pr = new PowerRanger();
		
		// ȫ�浿�� ���㿵���� �Ŀ�������
		h.pickMyHero(pr);
		
		// ȫ�浿�� �����û
		h.helpMe();
		
		// ���̰�
		p.setVisible(true);
	}
}








