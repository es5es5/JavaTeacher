
public class Doctor {
	//???????
	// �մ����� ���� �����
	public static void start(Guest g) {
		g.say();
		calculate(g);
		sayResult(g);
	}

	public static void calculate(Guest g) {
		g.stdWeight = (g.height - 100) * 0.9;
		g.bimando = (g.weight / g.stdWeight) * 100;
	}

	public static void sayResult(Guest g) {
		System.out.printf("ǥ��ü�� : %.1fkg\n", g.stdWeight);
		System.out.printf("�񸸵� : %.1f%%\n", g.bimando);
		
		if (g.bimando > 120) {
			System.out.println("��");
		} else if (g.bimando > 80) {
			System.out.println("����");
		} else {
			System.out.println("��ü��");
		}
	}

}






