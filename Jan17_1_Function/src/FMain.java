// �Լ�
//		�����ִ� �۾��� �ѵ� ��� �����س���
//		�ʿ��Ҷ����� �װ� ȣ���ؼ� ��� => �ڵ� ���� ���� �� ����

// ctrl + shift + /
// ctrl + shift + *
public class FMain {
	// 1. �Լ� ����
	// public static void �Լ���() {
	// ����
	// ����
	// }

	public static void yaDambae() {
		System.out.println("�������� ���� �� �޾Ƽ�");
		System.out.println("���ۿ� ����");
		System.out.println("���ܸ����� �Ѷ�� 1�� �޶� �׷��� �� �����");
		System.out.println("�װ� ������");
	}

	public static void yaNaga() {
		System.out.println("â���� �౸�� �ϳ� �󱸰� �ΰ� ������");
		System.out.println("�౸�� ����� ��� ����");
		System.out.println("���� ����� ���� ��");
		System.out.println("���");
		System.out.println("���½ð� 5������ �� â�� ���ٳ�");
	}

	public static void pushUp(int count) {
		System.out.println("�� ¤�� �������");
		for (int i = 0; i < count; i++) {
			System.out.println("�� ������ �������ٰ�");
			System.out.println("�� �Ǹ鼭 �ö��");						
		}
	}
	
	public static void main(String[] args) {
		// 2. �Լ� ȣ��
		// �Լ���();
		yaDambae();
		yaDambae();
		System.out.println("---------");
		pushUp(5);
		System.out.println("-----");
		pushUp(3);
	}

}








