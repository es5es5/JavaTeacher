
public class OMain2 {
	public static void main(String[] args) {
		// �� ������ : ����� boolean�����°�
		//		>(�ʰ�), <(�̸�), >=(�̻�), <=(����), ==(����), !=(�ٸ���)
		int xx = 10;
		int yy = 20;
		
		boolean a = xx != yy;
		System.out.println(a);
		
		// ���� ������ : �� ���� ������ ������
		//		&& (AND) :  A && B : A�� B�� ��� �����ϸ� true
		//					Ȯ�� �����Ÿ� �������� ��ġ�ϸ� ����Ƚ���� ���ϼ� ����
		
		//		|| (OR)	 :	A || B : A�� B�� ���߿� �ϳ��� �����ϸ� true
		//					Ȯ�� �����Ÿ� �������� ��ġ�ϸ� ����Ƚ���� ���ϼ� ����
		
		//		^ (XOR)  :  A ^ B : A�� B�� ���߿� �ϳ��� �����ؾ� true
		
		// ���� ������
		//		! (NOT)	 :  !A : A�� ����� �ݴ�� 
		
		// xx�� 5���� ũ��, yy�� 30���� �۳�
		boolean b = (xx > 5) && (yy < 30);
		System.out.println(b);
		
		// xx�� 5���� ũ�ų�, yy�� 30���� �۳�
		boolean c = (xx > 5) || (yy < 30);
		System.out.println(c);
		
		// ���̵��� ���̱ⱸ Ÿ�� �Ǵ��� üũ�ϴ� ���α׷�
		int height = 180;
		int age = 30;
		
		// ���̰� 10�� �̻��̰�, Ű�� 200������ Ÿ����
		boolean ok = (height > 200) && (age >= 10);
		System.out.println(ok);
		
		// Ű�� 200�Ѱų�, ���̰� 10�� �̻��̸� Ÿ�� �� 
		boolean ok2 = (age >= 10) || (height > 200);
		System.out.println(ok2);
		
		// Ű�� 200�ѵ���, ���̰� 10�� �̻��̵��� ���߿� �ϳ���
		boolean ok3 = (age >= 10) ^ (height > 200);
		System.out.println(ok3);
	
		// Ű�� 200������ Ÿ��ȵ�
		boolean ok4 = !(height > 200);
		System.out.println(ok4);
		
		//////////////////////////////
		// ���׿�����
		//		���ǽ� ? ���Ǹ����ϸ����Ұ� : ���Ǹ������ϸ����Ұ� 
		
		String aaa = "asdasd";
		int aasasd = 123;
		
		// ���̰� 8�� ������ "�������", 8�� ���ϸ� "����"
		String msg = (age > 8) ? "�������" : "����";
		System.out.println(msg);
		
		// Ű�� 200�̻��̰ų�, ���̰� 20������ 10000�� �ƴϸ� 5000��
		int money = ((age > 20) || (height > 200)) ? 10000 : 5000;
		
		// ���̸� 2�� ���� �������� 0�̸�
		// ���̰� ¦���� 500, �ƴϸ� 450 
		int discount = (age % 2 == 0) ? 500 : 450;
		
		// ����
		// int money2 = money - discount;
		// money = money - discount;
		money -= discount;
		System.out.println(money);
		
	}
}













