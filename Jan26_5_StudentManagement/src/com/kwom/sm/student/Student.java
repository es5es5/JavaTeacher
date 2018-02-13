package com.kwom.sm.student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String name;
	private Date birthday;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void introduce() {

		System.out.print(name + "\t");
		// Date -> String
		System.out.print(new SimpleDateFormat("yyyy/MM/dd").format(birthday));

		// 생일에서 연도만 추출
		String birthYear = new SimpleDateFormat("yyyy").format(birthday);
		int birthYear2 = Integer.parseInt(birthYear);

		// 현재날짜에서 연도만 추출
		String nowYear = new SimpleDateFormat("yyyy").format(new Date());
		int nowYear2 = Integer.parseInt(nowYear);

		int age = nowYear2 - birthYear2 + 1;
		System.out.println("\t" + age);
	}
}
