import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
		
		// 대입 연산자(마지막) : 오른쪽에 있는거를 왼쪽에 넣어줌
		int x = 10;
		
//		System.out.print("y : ");
//		int y = keyboard.nextInt();
		
		// 산술 연산자 : + - * / %
//		int a = x + y;
//		int b = x - y;
//		int c = x * y;
//		int d = x / y;
//		int e = x % y; // 나눈 나머지
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		// 증감 연산자 : +=, -=, *=, /=, %=, ++, --
//		x += 3;  // x값 3 증가 x = x + 3;
//		System.out.println(x);
//		
//		x -= 5;
//		System.out.println(x);
//		
//		x *= 2;
//		System.out.println(x);
//		
//		x /= 3;
//		System.out.println(x);
//		
//		x %= 3;
//		System.out.println(x);
//		
//		x++; // x += 1;
//		System.out.println(x);
//		
//		x--; // x -= 1;
//		System.out.println(x);
		
		// 다중선택할때 사용하면 편리
		// 주차 : 1 << 0			=	1
		// 와이파이 : 1 << 1		=	2
		// 흡연실 : 1 << 2		=	4
		// 24시간 : 1 << 3		=	8
		// 13이라는 값을 쓰면 : 주차, 흡연실, 24시간
		
		x = x << 3;
		System.out.println(x);
		
	}
}




















