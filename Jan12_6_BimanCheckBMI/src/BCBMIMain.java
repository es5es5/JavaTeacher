import java.util.Scanner;

public class BCBMIMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("�̸�\t: ");
		String name = keyboard.next();

		System.out.printf("Ű\t: ");
		double t = keyboard.nextDouble();

		if (t >= 3) {
			t /= 100;
		}

		System.out.printf("������\t: ");
		double w = keyboard.nextDouble();

		System.out.println("------------------");

		double bmi = w / (t * t);
		System.out.printf("BMI\t: %.1f\n", bmi);

		String result = "��ü��";
		if (bmi >= 35) {
			result = "�� ��";	
		} else if (bmi >= 30) {
			result = "�ߵ ��";
		} else if (bmi >= 25) {
			result = "�浵 ��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		}

		System.out.printf("%s���� %s\n", name, result);

		System.out.print("�ƹ��ų� �Է��ϰ� ����ġ�� ���� : ");
		keyboard.next();
	}
}




