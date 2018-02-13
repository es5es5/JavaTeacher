package com.kwon.e.pen;

public class BallPen {
	private String name;
	private int price;

	public BallPen() {
		// TODO Auto-generated constructor stub
	}

	public BallPen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
