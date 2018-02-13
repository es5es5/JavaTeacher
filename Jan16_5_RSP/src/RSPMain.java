
//			if (myHand == comHand) {
//				System.out.println("무");
//			} else if (myHand == 1) {
//				if (comHand == 2) {
//					System.out.println("패");
//				} else {
//					System.out.println("승");
//				}
//			} else if (myHand == 2) {
//				if (comHand == 1) {
//					System.out.println("승");
//				} else {
//					System.out.println("패");
//				}
//			} else {
//				if (comHand == 1) {
//					System.out.println("패");
//				} else {
//					System.out.println("승");
//				}
//			}
import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) throws Exception {
		// 키보드 입력받을 준비
		Scanner keyboard = new Scanner(System.in);

		// 랜덤 뽑을 준비
		Random r = new Random();

		int comHand = 0;
		int myHand = 0;
		int result = 0;
		String[] handTable = {"", "가위", "바위", "보"};
		int win = 0;
		// 무한반복
		while (true) {
			System.out.println("-----------");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("-----------");
			System.out.print("뭐 : ");
			myHand = keyboard.nextInt();
			comHand = r.nextInt(3) + 1; // 1 ~ 3
			System.out.printf("나 : %s\n", handTable[myHand]);
			System.out.printf("컴 : %s\n", handTable[comHand]);
			result = myHand - comHand;
			if (result == 0) {
				System.out.println("무승부");
			} else if(result == -1 || result == 2) {
				System.out.println("패");
				System.out.printf("%d승\n", win);
				Thread.sleep(5000);
				break;
			} else {
				win++;
				System.out.println("승");
			}

		}
	}
}















