import java.util.Random;
import java.util.Scanner;

public class NGMain {
	public static void main(String[] args) {
		// ���� ���� �غ�
		Random r = new Random();

		// 0 ~ 9999�߿� ������ ���� �̱�
		int ans = r.nextInt(10000);

		//System.out.println(ans);

		// ?
		Scanner keyboard = new Scanner(System.in);

		int myAns = 0;
		
		
		
//		int turn = 0;
//		// ���� �ݺ�
//		while (true) {
//			turn++;			
		for(int turn = 0; true; turn++) {
			System.out.print("�� : ");
			myAns = keyboard.nextInt();

			if (ans == myAns) {
				System.out.printf("%d�ϸ��� ����\n", turn);
				break;
			} else if (ans > myAns) {
				System.out.println("���� ���� �� Ŀ");
			} else {
				System.out.println("���� ���� �� �۾�");
			}
		}

	}
}
