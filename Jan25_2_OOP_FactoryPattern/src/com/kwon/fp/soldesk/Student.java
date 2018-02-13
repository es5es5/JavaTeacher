package com.kwon.fp.soldesk;

public class Student {
	private String name;
	private int no;

	Student() {
		// TODO Auto-generated constructor stub
	}

	Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void introduce() {
		System.out.println(name);
		System.out.println(no);
	}
}
