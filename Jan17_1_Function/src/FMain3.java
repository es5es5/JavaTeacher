
public class FMain3 {
	// 1) �Լ� ����
	// �Լ��� ����, parameter : �� �Լ��� �����ϴµ� �ʿ��� �͵�
	// public static �ڷ��� �Լ���(�ڷ��� ������, �ڷ��� ������, ...) {
	// ����Ÿ�� : �� �Լ��� ����� �ڷ���
	// ����
	// ����
	// return �����; �Լ� ��
	// }

	public static int go(int a) {
		a += 10;
		a *= 3;
		a /= 1;
		a -= 5;
		return a;
	}

	// �߰��������, �⸻��������� ������ ����� �����ִ� �Լ�
	public static double getAverage(int mid, int finalExam) {
		double avg = (mid + finalExam) / 2.0;
		return avg;
	}

	public static int getBiggerNum(int a, int b) {
		// if(a < b) {
		// return b;
		// } else {
		// return a;
		// }

		// if(a < b) {
		// return b;
		// }
		// return a;

		return (a < b) ? b : a;
	}

	public static String say(int age) {
		if (age >= 30) {
			return "�ȳ��Ͻʴϱ�";
		} else if (age >= 20) {
			return "�ȳ��ϼ���";
		} else if (age >= 10) {
			return "�ȳ�";
		}
		return "";
	}

	public static int getVAT(int price) {
		return price / 10;
	}

	public static int getSalary(int month) {
		return month * 12;
	}

	public static void main(String[] args) {
		System.out.println(say(29));
		System.out.println(getVAT(100000));
		System.out.println(getSalary(2000000));

		double avg1 = getAverage(100, 90);
		System.out.println(avg1);

		double avg2 = getAverage(78, 54);
		System.out.println(avg2);

		System.out.println(getAverage(10, 50));
	}

}
