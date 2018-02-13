package com.kwon.fp.main;

import com.kwon.fp.car.Car;
import com.kwon.fp.car.CarFactory;
import com.kwon.fp.soldesk.LeeSeMi;
import com.kwon.fp.soldesk.Student;

public class FPMain {
	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car c1 = cf.makeACar("¤¼");
		c1.print();
		
		Car c2 = cf.makeACar("¤²");
		c2.print();
		///////////////////////////
		LeeSeMi lsm = LeeSeMi.getLsm();
		
		Student s1 = lsm.register("È«±æµ¿");
		s1.introduce();
		
		Student s2 = lsm.register("±è±æµ¿");
		s2.introduce();
		
		//...
	}
}







