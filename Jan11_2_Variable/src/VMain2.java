
public class VMain2 {
	public static void main(String[] args) {
// 자료형
	// 기본형
		// byte, short, int, long, float, double, char, boolean
		// 메모리 공간중 stack영역에 실제 데이터 저장
		// stack영역에 만들어진 것들은 프로그램 종료되면 자동으로 처리됨
		
	// 참조형 
		// String, ...
		// 실제 값은 heap영역에, stack에는 값이 있는 heap영역의 번지수가 저장
		// heap영역은 수동 정리를 해줘야함
		// 자바는 GarbageCollection이라는 기능이 있어서 자동 정리됨
		
		// 32bit컴퓨터는 램 얼마이상 못쓴다.
		
	// 정수형(소수점 없는 숫자)
		// byte, short, int, long
		// 기본적으로 int사용
		// int를 넘어서는 큰 값 : long	
		int age = 30;
		
	// 실수형(소수점 있는 숫자)
		// float, double(소수점 자리수 => 정밀)
		// 결론은 double
		// 정 float를 사용하고 싶으면 값에 f를 붙여서
		// float eye = 1.2f;
		double eye = 1.2;
		System.out.println(eye);
		
	// 글자(한글자)
		// char
		// 모든 글자는 한글자당 2byte
		
		// 남/여 저장
		char gender = '남';
		System.out.println(gender);
		
	// 글자(여러글자)
		// String
		
		// 이름 저장
		String name = "홍길동";
		System.out.println(name);
	
	// 논리형(참/거짓)
		// boolean
		// 값 : true or false
		
		// 품절여부
		boolean soldOut = true;
		System.out.println(soldOut);
		
	// 아무것도 없음
		// void
	}
}























