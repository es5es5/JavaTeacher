
public class FMain2 {
	// 1) 함수 정의
	// 함수의 인자, parameter : 그 함수를 수행하는데 필요한 것들
	// public static void 함수명(자료형 변수명, 자료형 변수명, ...) {
	// 		내용
	// 		내용
	// }

	public static void add(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		int c = a + b;
		System.out.println(c);
	}

	public static void minus(int a, int b, int c) {
		int d = a - b - c;
		System.out.println(d);
	}

	public static void test(int i, double d, boolean b) {
		System.out.println(i);
		i = 500;
		System.out.println(i);
		System.out.println("-----");
		System.out.println(d);
		d = 2.2;
		System.out.println(d);
		System.out.println("-----");
		System.out.println(b);
		b = false;
		System.out.println(b);
	}
	
	// Call By Value, Call By Reference
	public static void test2(int aa, int[] bb) {
		System.out.println(aa);
		aa = 1000;
		System.out.println(aa);
		System.out.println("------");
		for (int i : bb) {
			System.out.println(i);
		}
		bb[0] = 1000;
		for (int i : bb) {
			System.out.println(i);
		}
	}
	
	public static void test3(int[] cc) {
		for (int i : cc) {
			System.out.println(i);
		}
		cc = new int[]{1, 2, 3};
		for (int i : cc) {
			System.out.println(i);
		}
		cc[0] = 999;
	}
		
	public static void main(String[] args) {
		
		int[] cc = {100, 200};
		test3(cc);
		for (int i : cc) {
			System.out.println(i);
		}
		
//		int aa = 20;
//		int[] bb = {10, 20}; 
//		test2(aa, bb);
//		System.out.println("-----");
//		System.out.println(aa);
//		System.out.println("-----");
//		for (int i : bb) {
//			System.out.println(i);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = 20;
//		double d = 1.1;
//		boolean b = true;
//		test(i, d, b);
//		System.out.println(i);
//		System.out.println(d);
//		System.out.println(b);
		
		// 2) 함수 호출
		// 함수명(값, 값, ...);
//		add(3, 10);
//		int a = 10;
//		minus(100, 50, 10);
//		minus(10, 20, 1);

	}

}
