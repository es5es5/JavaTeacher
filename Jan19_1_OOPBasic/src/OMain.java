
public class OMain {
	public static void main(String[] args) {
		int a = 1024;
		
		Product pp = new Product();
		pp.price = 300;
		pp.name = "����";
		pp.madeIn = "��Ʈ��";
		pp.showInfo();
		
		// ǰ���� ������, ������ 500��, �������� �߱�
		Product p1 = new Product();
		p1.name = "������";
		p1.price = 500;
		p1.madeIn = "�߱�";
		p1.showInfo();
		// ǰ���� ���帶ī, ������ 1000��, �������� �ѱ�
		
		// ǰ���� ������, ������ 10��, �������� ��Ʈ��
		
	}
}
