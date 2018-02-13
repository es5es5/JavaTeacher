// final 멤버 변수 : 상수화(수정 못하게)
// final 메소드 : 오버라이딩 못하게
// final 클래스 : 상속 못받게

public class Human {
	String name;
	int age;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println(name);
		System.out.println(age);
	}
	
}






