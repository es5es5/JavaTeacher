import java.util.Scanner;

public class BCBMIMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("이름\t: ");
		String name = keyboard.next();

		System.out.printf("키\t: ");
		double t = keyboard.nextDouble();

		if (t >= 3) {
			t /= 100;
		}

		System.out.printf("몸무게\t: ");
		double w = keyboard.nextDouble();

		System.out.println("------------------");

		double bmi = w / (t * t);
		System.out.printf("BMI\t: %.1f\n", bmi);

		String result = "저체중";
		if (bmi >= 35) {
			result = "고도 비만";	
		} else if (bmi >= 30) {
			result = "중등도 비만";
		} else if (bmi >= 25) {
			result = "경도 비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}

		System.out.printf("%s님은 %s\n", name, result);

		System.out.print("아무거나 입력하고 엔터치면 종료 : ");
		keyboard.next();
	}
}




