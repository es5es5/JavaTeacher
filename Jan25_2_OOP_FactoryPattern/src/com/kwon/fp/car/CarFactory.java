package com.kwon.fp.car;

// 2. ���� ��Ű���� ��ü ���� ���� ������ �� Ŭ������
public class CarFactory {
	private int lastNo;
	// 3. ��ü�� ���鶧 ����� �޼ҵ带 ��Ȳ�� �°� ��
	public Car makeACar(String type) {
		lastNo++;
		if (type == "��") {
			return new Truck(lastNo);
		} else {
			return new Bus(lastNo);
		}
	}
}
