
public class AMain {
	public static void main(String[] args) {
		// �л��� ���������� 90
		int kor = 90;
		// ���
		System.out.println(kor);

		// �迭�� ������
		// �л� 5���� ����������
		int[] eng = new int[5];
		eng[0] = 80;
		eng[1] = 50;
		eng[2] = 90;
		eng[3] = 10;
		eng[4] = 100;

		// ���
		System.out.println(eng[1]);
		System.out.println(eng.length); // �迭 ũ��

		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}

		for (int e : eng) {
			System.out.println(e);
		}

		//////////////////////////////

		// ȫ�浿, ��浿, �ֱ浿
		// String[] name = new String[3];
		// name[0] = "ȫ�浿";
		// name[1] = "��浿";
		// name[2] = "�ֱ浿";

		// String[] name = new String[] { "ȫ�浿", "��浿", "�ֱ浿" };

		String[] name = { "ȫ�浿", "��浿", "�ֱ浿" };

		for (int i = 0; i < name.length; i++) {
			String s = name[i];
			System.out.println(s);
		}

		for (String s : name) {
			System.out.println(s);
		}
		System.out.println("----------------");
		// �л��� Ű, ������
		int[][] student = { { 180, 80 }, { 170, 70 }, { 150, 50 } };

		// ù��° �л��� Ű
		System.out.println(student[0][0]);
		// ����° �л��� Ű
		System.out.println(student[2][0]);
		// ����° �л��� ������
		System.out.println(student[2][1]);

	}
}

