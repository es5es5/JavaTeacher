
public class CSMain {
	public static void main(String[] args) {
		int age = 5;
		int height = 180;
		int weight = 70;

		// 1. ���̰� 10�� �̻��̸�
		// �������
		// 2. 5 <= ���� < 10�̸�
		// ������ ������
		// 3. 2 <= ���� < 5�̸�
		// ���߿� ��
		// 4. ��������
		// ����
		if (age >= 10) {
			System.out.println("�������"); // ���� >= 10
		} else {
			// ���� < 10
			if (age >= 5) {
				// 5 <= ���� < 10
				System.out.println("������ ������");
			} else {
				// ���� < 5
				if (age >= 2) {
					System.out.println("���߿� ��");
				} else {
					System.out.println("����");
				}
			}
		}
		////////////////////////////////////////////////
		// 1. Ű�� 150 �̻��̸� �������
		// 2. 130 <= Ű < 150�̸� ���
		// 3. 100 <= Ű < 130�̸� �ȳ�
		// 4. �������� ����
		if (height >= 150) {
			System.out.println("�������");
		} else {
			if (height >= 130) {
				System.out.println("���");
			} else {
				if (height >= 100) {
					System.out.println("�ȳ�");
				} else {
					System.out.println("����");
				}
			}
		}
		/////////////////////////////////////
		if (height >= 150) {
			System.out.println("�������");
		} else if (height >= 130) {
			System.out.println("���");
		} else if (height >= 100) {
			System.out.println("�ȳ�");
		} else {
			System.out.println("����");
		}
		/////////////////////////////////////
		
	}
}







