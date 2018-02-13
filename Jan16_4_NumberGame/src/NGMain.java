import java.util.Random;
import java.util.Scanner;

public class NGMain {
	public static void main(String[] args) {
		// 랜덤 뽑을 준비
		Random r = new Random();

		// 0 ~ 9999중에 랜덤한 숫자 뽑기
		int ans = r.nextInt(10000);

		//System.out.println(ans);

		// ?
		Scanner keyboard = new Scanner(System.in);

		int myAns = 0;
		
		
		
//		int turn = 0;
//		// 무한 반복
//		while (true) {
//			turn++;			
		for(int turn = 0; true; turn++) {
			System.out.print("뭐 : ");
			myAns = keyboard.nextInt();

			if (ans == myAns) {
				System.out.printf("%d턴만에 정답\n", turn);
				break;
			} else if (ans > myAns) {
				System.out.println("실제 답이 더 커");
			} else {
				System.out.println("실제 답이 더 작아");
			}
		}

	}
}
