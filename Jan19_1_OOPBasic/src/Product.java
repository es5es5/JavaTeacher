
public class Product {
	// �������(member variable) : �޼ҵ� �ۿ��� ���� ����
	// �ʱ�ȭ �� �ʿ� ���� 
	// ���� ���� ���� ������ �⺻���� 0����, ���������� null�� �ڵ� �ʱ�ȭ
	String name;
	int price;
	String madeIn;
	
	public void showInfo() {
		int test = 0; // ��������(local variable) : �޼ҵ� �ȿ��� ���� ����
				      // �ݵ�� �ʱ�ȭ �ϰ� ����ؾ�
		System.out.println(test);
		
		System.out.printf("ǰ�� : %s\n", name);
		System.out.println(price);
		System.out.println(madeIn);
		System.out.println("-----------------");
	}
}
