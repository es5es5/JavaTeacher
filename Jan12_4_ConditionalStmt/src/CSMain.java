// if (���ǽ�){
//		���� ���������� ������ ����
// }

public class CSMain {
	public static void main(String[] args) {
		int age = 80;

		if (age >= 70) {
			System.out.println("���̱� ���");
		}

		// ���̰� Ȧ���̰�, 10�� �̸��̸� ���������
		if ((age < 10) && (age % 2 == 1)) {
			System.out.println("������");
		}

		// ���̰� 30�� �̸��̰�, ���̰� 2�� �̸��̸� ���������
		if (age < 2) {
			System.out.println("������");
		}
		
		System.out.println("�������");
	}
}















