package com.kwon.eh.main;

public class Calculator {
	private String name;
	private String major;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(String name, String major) {
		super();
		this.name = name;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(major);
	}

	public int getHab(int a, int b) {
		int hab = a + b;
		return hab;
	}

	public int getCha(int a, int b) {
		int cha = a - b;
		return cha;
	}

	public int getGob(int a, int b) {
		int gob = a * b;
		return gob;
	}

	// �޼ҵ� ��ü������ ����ó���ϴ� ����� ����
	public int getMoks(int a, int b) {
		try {
			int moks = a / b;
			return moks;
		} catch (Exception e) {
			System.out.println("������ 0�� �ȵ�");
			return -999;
		} finally {
			System.out.println("��·�� ������ ����");
		}
		// ���� : 55, 61, 56
		// ���� : 55, 58, 61, 59
	}
	
	// �� �޼ҵ�� �����ϴٰ� ArithmeticException�� �߻��ϸ�
	// �� �޼ҵ带 ȣ���� �ʿ��� ó��
	public int getMoks2(int a, int b) throws ArithmeticException {
		int moks = a / b;
		return moks;
	}
	

}















