// �޸�
//		.java(�ҽ�) -> .class(����) -> �����ϸ�
//		1. ����� ���� �� �ҽ��� stack�� �� �Ǹ�
//		2. static ��� �������� static�� �� �Ǹ�
//		3. main���� ���� ����

public class OSMain {
	public static void main(String[] args) {
		// 
		
		
		
		
		//System.out.println(g1.name);
		//System.out.println(g1.price);
		System.out.println(Gejang.producer);
		
		Gejang g1 = new Gejang();
		g1.name = "�� Ư�� ������";
		g1.price = 59900;
		g1.weight = 10;
		g1.printInfo();
		
		g1.producer = "����� ���ܸ� �����";
		//Gejang.PRODUCER2 = "����� ���ܸ� �����";
		
		Gejang g2 = new Gejang();
		g2.name = "�������";
		g2.price = 39900;
		g2.weight = 10;
		g2.printInfo();
		g1.printInfo();
	}
}





