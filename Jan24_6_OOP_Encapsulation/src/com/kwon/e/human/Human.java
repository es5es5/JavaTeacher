package com.kwon.e.human;

// ĸ��ȭ(encapsulation)
// 		��� ���� �տ� private => �ܺο��� ���� ���� ����
// 		������ ��θ� ���� �� ��θ� ���ؼ��� ��� ������ �ǵ� �� �ְ�
public class Human {
	private String name;
	private int age;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		if(age < 0) {
			age *= -1;
		}
		this.age = age;
	}
	
	public void introduce() {
		System.out.println(name);
		System.out.println(age);
	}
	
	
}








