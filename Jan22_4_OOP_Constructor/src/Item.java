
public class Item {
	String name;
	int price;
	static String madeIn = "�߱�";
	
	// �⺻ ������(constructor)
	//		���� ����� ���� ������ �ڵ����� �������
	public Item() {
		// ��ü�� ��������� �ϰ� ������
		System.out.println("���ο� ��ǰ�� ��ϵ�");
	}
	
	public void printItem() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(madeIn);
		System.out.println("-----");
	}
}
