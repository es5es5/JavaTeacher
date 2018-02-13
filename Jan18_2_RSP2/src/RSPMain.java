import java.util.Random;
import java.util.Scanner;

// main에 코드 많이x
public class RSPMain {
	public static void showHelp() {
		System.out.println("-----------");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-----------");
	}
	
	public static int input(Scanner keyboard) {
		System.out.print("뭐 : ");
		int myHand = keyboard.nextInt();
		if(myHand <= 0 || myHand >= 4) {
			System.out.println("입력 오류");
			return input(keyboard);
		}
		return myHand;
	}
	
	public static int comFire(Random r) {
		return r.nextInt(3) + 1;
	}
	
	public static void showResult(int myHand, int comHand, String[] handTable) {
		System.out.printf("나 : %s\n", handTable[myHand]);
		System.out.printf("컴 : %s\n", handTable[comHand]);
		int result = myHand - comHand;
		if (result == 0) {
			System.out.println("무승부");
		} else if(result == -1 || result == 2) {
			System.out.println("패");
		} else {
			System.out.println("승");
		}
	}
	
	public static void doRSP() {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int myHand = 0;
		int comHand = 0;
		String[] handTable = {"", "가위", "바위", "보"};
		while (true) {
			showHelp();
			myHand = input(keyboard);
			comHand = comFire(r);
			showResult(myHand, comHand, handTable);
		}
	}
	
	public static void main(String[] args) {
		doRSP();
	}
}



