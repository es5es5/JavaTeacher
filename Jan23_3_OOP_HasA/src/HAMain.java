
public class HAMain {
	public static void main(String[] args) {
		// ȫ�浿, 20���� �Ź��� 
		// ����Ű���� ���� ��������12 260mm�� �Ŵµ�, 
		// ����Ű�� ���￡ �ְ�,
		// ��������� �ڿ���, 60���̰� �Ź���,
		// ����ιٿ��� ���� ���ȷ�ĳ��� 265mm�� �Ŵ´�.
		Company co0 = new Company("����ι�", null);
		Shoes s1 = new Shoes("���ȷ�ĳ���", 265, co0);
		Human h1 = new Human("�ڿ���", 60, s1);
		City c1 = new City("����", h1);
		Company co1 = new Company("����Ű", c1);
		Shoes s2 = new Shoes("��������12", 260, co1);
		Human h2 = new Human("ȫ�浿", 20, s2);
		
		// h2�� �̸�
		System.out.println(h2.name);
		// h2 �Ź��� ������
		System.out.println(h2.shoes.size);
		// h2 �Ź� ����Ŀ �̸�
		System.out.println(h2.shoes.maker.name);
		// h2 �Ź� ����Ŀ�� ��ġ
		System.out.println(h2.shoes.maker.location.name);
		// h2 �Ź� ����Ŀ�� �ִ� ���� ���� �̸�
		System.out.println(h2.shoes.maker.location.mayor.name);
		// h2 �Ź� ����Ŀ�� �ִ� ���� ������ �Ŵ� �Ź� �̸�
		System.out.println(h2.shoes.maker.location.mayor.shoes.name);
		// h2 �Ź� ����Ŀ�� �ִ� ���� ������ �Ŵ� �Ź� ����Ŀ
		System.out.println(h2.shoes.maker.location.mayor.shoes.maker.name);
	}
}







