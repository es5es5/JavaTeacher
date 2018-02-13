package com.kwon.sp.avengers;

// singleton pattern
//		객체를 하나만 만들어서 쓰게 하고 싶을때
public class Ironman {
	private String name;
	private int age;
	// 2. 클래스 내부에서 객체 하나 생성해둠
	private static final Ironman IRONMAN = new Ironman("토니", 30);

	// 1. 생성자를 외부에서 호출 못하게
	private Ironman() {
		// TODO Auto-generated constructor stub
	}

	private Ironman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 3. 하나있는 그 객체 호출할때 사용할 메소드(getter)
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
		System.out.println("빔");
	}

}
