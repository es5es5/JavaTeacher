// Method Overloading
// 		�޼ҵ�� ����, �Ķ���͸� �ٸ���

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

	// ���ڸ� ��� �ֵ� �� ���ϴ� �޼ҵ�
	public static void gob(int... a) {
		int gob = 1;
		for (int i = 0; i < a.length; i++) {
			gob *= a[i];
		}
		System.out.println(gob);
	}

	// �Ǽ�(�Ҽ��� �ִ°�) ��� �ֵ� �� ����ϴ� �޼ҵ�
	public static void printAll(double... ds) {
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		for (double d : ds) {
			System.out.println(d);
		}
	}

}















