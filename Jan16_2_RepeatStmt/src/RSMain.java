import java.util.Scanner;

public class RSMain {
	public static void main(String[] args) {
		
		// 반복횟수 - for
		// 1 + 2 + 3 + ... + 100 = ?
		int a = 0;
		for (int i = 1; i <= 100; i++) {
			a += i;
		}
		System.out.println(a);
		//////////////////////////////////////
		// 반복조건 - while, do-while
		// 1 + 2 + 3 + ... + ? >= 500
		int b = 0;
		int i = 1;
		while (b < 500) {
			b += i;
			i++;	
		}
		System.out.println(b);
		System.out.println(i);
		
		Scanner keyboard = new Scanner(System.in);
		// 사용자가 짝수를 쓸 때까지 입력받기
		int c = 1;
		
		while (c % 2 != 0) {
			System.out.print("c : ");
			c = keyboard.nextInt();			
		}
		///////////////////////
		// 1 + 3 + 5 + 7 + ... + ? >= -100
		int d = 0;
		int j = 1;
		
		while (d < -100) {
			d += j;
			j += 2;
		}
		System.out.println(d);
		System.out.println(j);
		////////////////////////
		int e = 0;
		int k = 1;
		
		do {
			e += k;
			k += 2;
		} while (d < -100);
		System.out.println(e);
		System.out.println(k);
		////////////////////////
		
		// 입력받기 0쓰면 그만
		int f = 1;
		while (f != 0) {
			System.out.print("f : ");
			f = keyboard.nextInt();
		}
		
		int g = 0;
		do {
			System.out.print("g : ");
			g = keyboard.nextInt();
		} while (g != 0);
		
		
		
	}
}
















