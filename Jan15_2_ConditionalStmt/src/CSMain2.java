import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�߰���� : ");
		int mid = keyboard.nextInt();

		System.out.print("�⸻��� : ");
		int finalExam = keyboard.nextInt();

		double avg = (mid + finalExam) / 2.0;

		
		System.out.printf("��� : %.1f\n", avg);

		if (avg >= 90) {
			System.out.println("��");
		} else if (avg >= 80) {
			System.out.println("��");
		} else if (avg >= 70) {
			System.out.println("��");
		} else if (avg >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

	}
}




