// Method Overloading
// 		메소드명 같게, 파라메터를 다르게

public class Human {

	public static void add(String a, String b) {
		String hab = a + b;
		System.out.println(hab);
	}

	public static void add(int a, int b) {
		int hab = a + b;
		System.out.println(hab);
	}

	public static void add(int a, int b, int c) {
		int hab = a + b + c;
		System.out.println(hab);
	}

	// 숫자를 몇개를 넣든 다 곱하는 메소드
	public static void gob(int... a) {
		int gob = 1;
		for (int i = 0; i < a.length; i++) {
			gob *= a[i];
		}
		System.out.println(gob);
	}

	// 실수(소수점 있는거) 몇개를 넣든 다 출력하는 메소드
	public static void printAll(double... ds) {
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		for (double d : ds) {
			System.out.println(d);
		}
	}

}















