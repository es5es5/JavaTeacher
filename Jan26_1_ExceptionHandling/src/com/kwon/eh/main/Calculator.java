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

	// 메소드 자체적으로 예외처리하는 기능이 존재
	public int getMoks(int a, int b) {
		try {
			int moks = a / b;
			return moks;
		} catch (Exception e) {
			System.out.println("나누기 0은 안돼");
			return -999;
		} finally {
			System.out.println("어쨌든 나누기 했음");
		}
		// 정상 : 55, 61, 56
		// 예외 : 55, 58, 61, 59
	}
	
	// 이 메소드는 실행하다가 ArithmeticException이 발생하면
	// 이 메소드를 호출한 쪽에서 처리
	public int getMoks2(int a, int b) throws ArithmeticException {
		int moks = a / b;
		return moks;
	}
	

}















