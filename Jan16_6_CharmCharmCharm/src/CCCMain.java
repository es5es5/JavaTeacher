import java.util.Random;
import java.util.Scanner;

public class CCCMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int comHand = 0;		
		int myFace = 0;
		int evade = 0;
		String[] faceTable = { "", "����", "������", "��", "�Ʒ�", "������" };
		while (true) {
			System.out.println("-----------");
			for (int i = 1; i < faceTable.length; i++) {
				System.out.printf("%d) %s\n", i, faceTable[i]);
			}
			System.out.println("-----------");
			System.out.print("��� : ");
			myFace = keyboard.nextInt();
			comHand = r.nextInt(5) + 1; 
			System.out.printf("�� : %s\n", faceTable[myFace]);
			System.out.printf("�� : %s\n", faceTable[comHand]);
			if (myFace == comHand) {
				System.out.printf("�ɸ�\n%d�� ����", evade);
				break;
			} else {
				System.out.println("����");
				evade++;
			}
		}
	}
}
