import java.util.Scanner;

public class CSMain3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�Ž����� : ");
		int money = keyboard.nextInt();
		int count = 0;
		
		if (money >= 50000) {
			count = money / 50000;
			System.out.printf("5������ : %d��\n", count);
			money %= 50000;
		}
		if(money >= 10000) {
			count = money / 10000;
			System.out.printf("1������ : %d��\n", count);
			money %= 10000;
		}
		if(money >= 5000) {
			count = money / 5000;
			System.out.printf("5õ���� : %d��\n", count);
			money %= 5000;
		}
		if(money >= 1000) {
			count = money / 1000;
			System.out.printf("1õ���� : %d��\n", count);
			money %= 1000;
		}
		if(money >= 500) {
			count = money / 500;
			System.out.printf("5���¥�� : %d��\n", count);
			money %= 500;
		}
		if(money >= 100) {
			count = money / 100;
			System.out.printf("���¥�� : %d��\n", count);
			money %= 100;
		}
		if(money >= 50) {
			count = money / 50;
			System.out.printf("5�ʿ�¥�� : %d��\n", count);
			money %= 50;
		}
		if(money >= 10) {
			count = money / 10;
			System.out.printf("�ʿ�¥�� : %d��\n", count);
			money %= 10;
		}
		
	}
}


















