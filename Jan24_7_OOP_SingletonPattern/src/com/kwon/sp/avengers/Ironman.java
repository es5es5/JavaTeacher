package com.kwon.sp.avengers;

// singleton pattern
//		��ü�� �ϳ��� ���� ���� �ϰ� ������
public class Ironman {
	private String name;
	private int age;
	// 2. Ŭ���� ���ο��� ��ü �ϳ� �����ص�
	private static final Ironman IRONMAN = new Ironman("���", 30);

	// 1. �����ڸ� �ܺο��� ȣ�� ���ϰ�
	private Ironman() {
		// TODO Auto-generated constructor stub
	}

	private Ironman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 3. �ϳ��ִ� �� ��ü ȣ���Ҷ� ����� �޼ҵ�(getter)
	public static Ironman getIronman() {
		return IRONMAN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

	public void attack() {
		System.out.println("��");
	}

}
