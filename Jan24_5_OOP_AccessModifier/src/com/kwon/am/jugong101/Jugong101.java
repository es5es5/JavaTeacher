package com.kwon.am.jugong101;
// ����������
//		����� ���ٹ����� ����
//		public : �ƹ������� ���� ����
//		protected : ���� ��Ű�� or �ٸ� ��Ű����� ����Ŭ�������� ���� ����
//		�Ⱦ���(default, friendly) : ���� ��Ű�������� ���� ����
//		private : Ŭ���� ���ο����� ���ٰ���


public class Jugong101 {
	public String name;
	protected String password;
	String recycleDay;
	private String money;

	public Jugong101() {
		// TODO Auto-generated constructor stub
	}

	public Jugong101(String name, String password, String recycleDay, String money) {
		super();
		this.name = name;
		this.password = password;
		this.recycleDay = recycleDay;
		this.money = money;
	}

	protected void printInfo() {
		System.out.println(name);
		System.out.println(password);
		System.out.println(recycleDay);
		System.out.println(money);
	}
}








