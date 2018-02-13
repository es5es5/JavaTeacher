
public class YMain {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print("せ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j != i) {
					System.out.print("  ");
				} else {
					System.out.print("せ");
				}
			}
			System.out.println();
		}
		////////////////////////////////////////
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("せ");
		}

		System.out.println("----------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= ((i * 2) - 1); j++) {
				if (i % 2 == 0) {
					System.out.print("ぞ");
				} else {
					System.out.print("せ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= ((i * 2) - 1); j++) {
				if (j % 2 == 0) {
					System.out.print("ぞ");
				} else {
					System.out.print("せ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i > j) {
					System.out.print("  ");
				} else {
					System.out.print("せ");
				}
			}
			System.out.println();
		}

	}
}








