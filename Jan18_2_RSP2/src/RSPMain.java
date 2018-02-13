import java.util.Random;
import java.util.Scanner;

// main�� �ڵ� ����x
public class RSPMain {
	public static void showHelp() {
		System.out.println("-----------");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ��");
		System.out.println("-----------");
	}
	
	public static int input(Scanner keyboard) {
		System.out.print("�� : ");
		int myHand = keyboard.nextInt();
		if(myHand <= 0 || myHand >= 4) {
			System.out.println("�Է� ����");
			return input(keyboard);
		}
		return myHand;
	}
	
	public static int comFire(Random r) {
		return r.nextInt(3) + 1;
	}
	
	public static void showResult(int myHand, int comHand, String[] handTable) {
		System.out.printf("�� : %s\n", handTable[myHand]);
		System.out.printf("�� : %s\n", handTable[comHand]);
		int result = myHand - comHand;
		if (result == 0) {
			System.out.println("���º�");
		} else if(result == -1 || result == 2) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
	
	public static void doRSP() {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int myHand = 0;
		int comHand = 0;
		String[] handTable = {"", "����", "����", "��"};
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



