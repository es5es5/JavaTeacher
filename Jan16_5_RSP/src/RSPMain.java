
//			if (myHand == comHand) {
//				System.out.println("��");
//			} else if (myHand == 1) {
//				if (comHand == 2) {
//					System.out.println("��");
//				} else {
//					System.out.println("��");
//				}
//			} else if (myHand == 2) {
//				if (comHand == 1) {
//					System.out.println("��");
//				} else {
//					System.out.println("��");
//				}
//			} else {
//				if (comHand == 1) {
//					System.out.println("��");
//				} else {
//					System.out.println("��");
//				}
//			}
import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) throws Exception {
		// Ű���� �Է¹��� �غ�
		Scanner keyboard = new Scanner(System.in);

		// ���� ���� �غ�
		Random r = new Random();

		int comHand = 0;
		int myHand = 0;
		int result = 0;
		String[] handTable = {"", "����", "����", "��"};
		int win = 0;
		// ���ѹݺ�
		while (true) {
			System.out.println("-----------");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ��");
			System.out.println("-----------");
			System.out.print("�� : ");
			myHand = keyboard.nextInt();
			comHand = r.nextInt(3) + 1; // 1 ~ 3
			System.out.printf("�� : %s\n", handTable[myHand]);
			System.out.printf("�� : %s\n", handTable[comHand]);
			result = myHand - comHand;
			if (result == 0) {
				System.out.println("���º�");
			} else if(result == -1 || result == 2) {
				System.out.println("��");
				System.out.printf("%d��\n", win);
				Thread.sleep(5000);
				break;
			} else {
				win++;
				System.out.println("��");
			}

		}
	}
}















