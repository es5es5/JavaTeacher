import java.util.Random;
import java.util.Scanner;

public class CCCMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int comHand = 0;		
		int myFace = 0;
		int evade = 0;
		String[] faceTable = { "", "왼쪽", "오른쪽", "위", "아래", "가만히" };
		while (true) {
			System.out.println("-----------");
			for (int i = 1; i < faceTable.length; i++) {
				System.out.printf("%d) %s\n", i, faceTable[i]);
			}
			System.out.println("-----------");
			System.out.print("어디 : ");
			myFace = keyboard.nextInt();
			comHand = r.nextInt(5) + 1; 
			System.out.printf("나 : %s\n", faceTable[myFace]);
			System.out.printf("컴 : %s\n", faceTable[comHand]);
			if (myFace == comHand) {
				System.out.printf("걸림\n%d번 버팀", evade);
				break;
			} else {
				System.out.println("피함");
				evade++;
			}
		}
	}
}
