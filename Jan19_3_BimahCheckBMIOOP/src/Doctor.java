
public class Doctor {

	public void start(Guest g) {
		g.say();
		calc(g);
	}

	public void calc(Guest g) {
		if (g.height >= 3) {
			g.height /= 100;
		}
		g.bmi = g.weight / (g.height * g.height);
	}

	public void sayResult(Guest g) {
		if (g.bmi >= 35) {
			System.out.printf("%s���� ����\n", g.name);
		} else if (g.bmi >= 30) {
			System.out.printf("%s���� �ߵ��\n", g.name);
		} else if (g.bmi >= 25) {
			System.out.printf("%s���� �浵��\n", g.name);
		} else if (g.bmi >= 23) {
			System.out.printf("%s���� ��ü��\n", g.name);
		} else if (g.bmi >= 18.5) {
			System.out.printf("%s���� ����\n", g.name);
		} else {
			System.out.printf("%s���� ��ü��\n", g.name);
		}
	}
}
