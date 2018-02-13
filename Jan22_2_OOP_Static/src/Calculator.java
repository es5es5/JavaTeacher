
public class Calculator {
	// 표현할 속성이 없어서 멤버 변수 없음
	// => 멤버 변수 저장할 공간 필요 없음
	// => 객체를 만들 필요는 없음
	
	public static void add(int a, int b) {
		int hab = a + b;
		System.out.println(hab);
	}

	public static void minus(int a, int b) {
		int cha = a - b;
		System.out.println(cha);
	}
}
