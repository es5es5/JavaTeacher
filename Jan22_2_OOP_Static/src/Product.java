// static �޼ҵ� : ��ü ���� ��� ������ �޼ҵ�
public class Product {
	String name;
	int price;
	static final String JEJOSA = "����";
	
	// static�޼ҵ忡�� static�� �ƴѰſ� ���� �Ұ���
	public static void testMethod() {
		//System.out.println(name);
		System.out.println(JEJOSA);
		System.out.println("�׽�Ʈ");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(JEJOSA);
		System.out.println("-----");
	}
	
}
