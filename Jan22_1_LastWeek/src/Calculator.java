public class Calculator {
	String name;
	String jejosa;
	int price;
	// int hab; int cha; int gob; int mok;

	public void printCalculatorInfo() {
		System.out.printf("ǰ�� : %s\n", name);
		System.out.printf("������ : %s\n", jejosa);
		System.out.printf("���� : %d\n", price);
	}

	// ���� �ΰ��� �־��ָ�, �� �� ������ ��,��,��,���� ����ϴ� �޼ҵ�
	public void calculate(int a, int b) {
		int hab = a + b;
		int cha = a - b;
		int gob = a * b;
		int mok = a / b;

		System.out.printf("�� : %d\n", hab);
		System.out.printf("�� : %d\n", cha);
		System.out.printf("�� : %d\n", gob);
		System.out.printf("�� : %d\n", mok);
	}

	// ���� �ΰ��� �־��ָ�, �� �� ������ ���� �����ִ� �޼ҵ�
	public int getHab(int zxc, int asd) {
		int hab = zxc + asd;
		return hab;
	}

}



















