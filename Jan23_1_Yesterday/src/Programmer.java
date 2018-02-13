//	개발자
public class Programmer {
	// 멤버변수 : 속성
	String name;
	int age;
	static boolean nightDuty = true;
	// 기본 생성자 : spring등에서 사용
	public Programmer() {
		System.out.println("안녕");
	}
	// 오버로딩된 생성자
	public Programmer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// 자기소개
	public void introduce() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.println("야근여부 : " + nightDuty);
	}
	// 일거리 주면 프로그램을 만들어냄
	public String work(String order) {
		return "프로그램";
	}
	// 실제 개발자가 없어도 사용 가능한 메소드 
	public static void onDutyTime() {
		System.out.println("FM");
	}
	
}













