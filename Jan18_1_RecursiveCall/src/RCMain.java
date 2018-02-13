
public class RCMain {
	
	// 함수의 재귀적 호출
	
	public static int factorial(int i) {
		// 4! = 4 x 3 x 2 x 1, 3! = 3 x 2 x 1
		// 4! = 4 x 3!
		// if (i == 1) {
		// return 1;
		// } else {
		// return i * factorial(i - 1);
		// }

		return (i == 1) ? 1 : i * factorial(i - 1);
	}

	public static int fibo(int i) {
		// if (i == 1 || i == 2) {
		// return 1;
		// } else {
		// return fibo(i - 1) + fibo(i - 2);
		// }
		return (i == 1 || i == 2) ? 1 : fibo(i - 1) + fibo(i - 2);
	}

	public static int xx(int i) {
//		if (i <= 3) {
//			return i;
//		} else {
//			return xx(i - 1) * xx(i - 2) * xx(i - 3);
//		}
		
		return (i <= 3) ? i : xx(i - 1) * xx(i - 2) * xx(i - 3);
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fibo(5));
		System.out.println(xx(6));
	}

}





