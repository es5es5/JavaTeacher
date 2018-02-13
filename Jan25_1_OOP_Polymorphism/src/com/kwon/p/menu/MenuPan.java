package com.kwon.p.menu;

public class MenuPan {
	private Menu[] menus;
	
	public MenuPan() {
		menus = new Menu[3];
		menus[0] = new Chicken("�Ķ��̵�", 10000);
		menus[1] = new GolbaengE("����̼Ҹ�", 9000, "���ʰ�");
		menus[2] = new Soju("��", 3000, 20);
	}
	
	public void show() {
		
		for (Menu menu : menus) {
			menu.print();
			System.out.println("---");
		}
		
	}
}
