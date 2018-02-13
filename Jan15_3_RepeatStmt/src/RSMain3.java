
public class RSMain3 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - (i - 1); j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		// せ
		// せ
		// せ  せ
		// せ  せ  
		// せ  せ  せ
		System.out.println("----------------");
		// せ
		//   せ
		//     せ
		//       せ
		//         せ
		System.out.println("----------------");
		// せ
		// ぞぞぞ
		// せせせせせ
		// ぞぞぞぞぞぞぞ
		// せせせせせせせせせ
	}
}















