import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int mid = keyboard.nextInt();

		System.out.print("기말고사 : ");
		int finalExam = keyboard.nextInt();

		double avg = (mid + finalExam) / 2.0;

		
		System.out.printf("평균 : %.1f\n", avg);

		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 70) {
			System.out.println("미");
		} else if (avg >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

	}
}




