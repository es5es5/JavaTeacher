// 추상클래스
//		추상메소드를 하나라도 가지는 클래스는 추상클래스여야
//		객체를 만들수 없음
public abstract class Avengers {
	String name;
	int age;

	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

	// 추상메소드 : 내용이 없는 메소드
	//			하위클래스에서 반드시 오버라이딩을 해야만 함
	public abstract void attack();
}









