
public class RSMain {
	public static void main(String[] args) throws Exception {
		// 반복횟수가 명확한 경우에 사용하는 
//		for (int i = 0; i < 3; i++) {			
//			System.out.println("ㅋㅋㅋ");
//		}
		
		for(int i = 0; i < -1; i++) {
			System.out.println("1");
		}
		////////////////////////////
		for(int i = 0; i < 2; i++) {
			System.out.println("2");
		}
		System.out.println("-----------------");
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
			//Thread.sleep(1000); // 1초 멈춤
		}
		System.out.println("-----------------");
//		for(int i = 0; true; i++) {
//			System.out.println(i);
//		}
		int a = 0;
		for(int b = 0; b < 5; b++) {
			a += b;
		}
		System.out.println(a);
		System.out.println("-------------");
		int c = 1;
		for (int d = 1; d <= 5 ; d++) {
			c *= d;
		}
		System.out.println(c);
		System.out.println("-----------------");
		for(int e = 1; e <= 9; e++) {
			System.out.printf("2 x %d = %d\n", e, (2*e));
		}
		System.out.println("-----------------");
		for(int f = 1; f <= 9; f += 2) {
			System.out.printf("3 x %d = %d\n", f, (3*f));
		}
		System.out.println("-----------------");
		for(int g = 9; g >= 0; g -= 3) {
			System.out.printf("4 x %d = %d\n", g, (4*g));
		}
	}
}





























