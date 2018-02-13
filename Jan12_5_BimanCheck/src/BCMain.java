import java.util.Scanner;

public class BCMain {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = keyboard.next();

		System.out.print("키 : ");
		int height = keyboard.nextInt();

		System.out.print("몸무게 : ");
		int weight = keyboard.nextInt();

		int stdWeight = (int) ((height - 100) * 0.9);
		double bimando = (weight / (double) stdWeight) * 100;

		System.out.println(stdWeight);
		System.out.println(bimando);

		if (bimando > 120) {
			System.out.println("비만");
		}
		
	}
}
