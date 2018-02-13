package com.kwon.am.jugong101;
// 접근제한자
//		멤버의 접근범위를 설정
//		public : 아무데서나 접근 가능
//		protected : 같은 패키지 or 다른 패키지라면 하위클래스에서 접근 가능
//		안쓴거(default, friendly) : 같은 패키지에서만 접근 가능
//		private : 클래스 내부에서만 접근가능


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








