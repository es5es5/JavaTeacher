
public class OMain2 {
	public static void main(String[] args) {
		Human h = new Human();
		System.out.println(h);
		
		h.name = "ȫ�浿";
		h.age = 30;
		h.introduce();
		
		Human h2 = h;
		System.out.println(h2);
		h2.name = "��浿";
		h.introduce();
		
		h2 = null; // ������ �����ӿ� �ִ� ������ ����
		System.out.println(h2);
		h.name = "�ֱ浿";
		
		h = null; // Garbage Collection �ߵ�
		
		// Garbage Collection
		//		heap���� �ڵ� ����
		//		�� ������ ���̻� ����Ű�� ������ ������
	}
}













