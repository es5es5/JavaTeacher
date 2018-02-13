
public class RSMain2 {
	public static void main(String[] args) throws Exception {

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
			}
		}
		System.out.println("--------------------------");
		// 짝수단만
		for (int dan = 2; dan <= 9; dan += 2) {
			System.out.println(dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
			}
		}
		System.out.println("--------------------------");
		// 답이 짝수인것만 출력
		int ans = 0;
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				ans = dan * i;
				if (ans % 2 == 0) {
					System.out.printf("%d x %d = %d\n", dan, i, ans);
				}
			}
		}
		System.out.println("--------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}

















