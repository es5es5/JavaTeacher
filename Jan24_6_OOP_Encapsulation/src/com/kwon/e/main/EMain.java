package com.kwon.e.main;

import com.kwon.e.human.Human;
import com.kwon.e.pen.BallPen;

public class EMain {
	public static void main(String[] args) {
		BallPen bp = new BallPen("�𳪹�153", 300);
		//bp.name = "����������";
		bp.setName("������");
		bp.print();
		
		
		Human h = new Human();
		h.setAge(-10);
		System.out.println(h.getAge());
	}
}
