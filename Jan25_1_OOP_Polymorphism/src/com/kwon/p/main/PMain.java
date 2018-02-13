package com.kwon.p.main;

import com.kwon.p.human.Human;
import com.kwon.p.menu.Alcohol;
import com.kwon.p.menu.Beer;
import com.kwon.p.menu.Chicken;
import com.kwon.p.menu.Menu;
import com.kwon.p.menu.MenuPan;
import com.kwon.p.menu.Soju;

// ������(polymorphism)
//		����Ŭ�������� ������ ����Ŭ�������� ��ü�� ���� �� ����
public class PMain {
	public static void main(String[] args) {
		
		
		Menu m = new Soju("ó��ó��", 2000, 10);
		Alcohol a = new Soju("��", 3000, 30);
		System.out.println("------");
		Human h = new Human();
		Beer b = new Beer("ī��", 3000);
		h.eat(b);
		Chicken c = new Chicken("�Ķ��̵�",10000);
		h.eat(c);
		System.out.println("===");
		MenuPan mp = new MenuPan();
		mp.show();
		System.out.println("--------------");
		
		// �޴�Ÿ���� ���� mm�� ������ ������ ���� ��ü
		// �޴�Ÿ�� ������ �Ἥ �� ��ü�� ������
		// ����Ŭ�������� �߰��� ����� ������� ����
		Menu mm = new Soju("ó��ó��", 3000, 10);
		System.out.println(mm);
		System.out.println( mm.getName()  );
		System.out.println( mm.getPrice() );
		//System.out.println( mm.getAlcohol() );
		
		// ����Ŭ�������� �߰��� ����� ����Ϸ���
		// ����Ÿ������ ����ȯ �ؼ� ����ؾ�
		Soju ss = (Soju) mm;
		System.out.println(ss);
		System.out.println(ss.getName());
		System.out.println(ss.getPrice());
		System.out.println(ss.getAlcohol());
		
	}
}



















