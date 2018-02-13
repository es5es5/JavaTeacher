
public class IAMain {
	public static void main(String[] args) {
		Kwon k = new Kwon("", 32, "010");
		k.introduce();
		k.gongboo();
		k.hyodo();
		k.play();
		
		Smoker s = new Smoker() {

			@Override
			public void smoke() {
				// TODO Auto-generated method stub
				System.out.println("��� �ǿ��");
			}
		};
		// Smoker�������̽��� �����ϴ�, Ŭ�������� �𸣰ڴ� ��ü
		s.smoke();

		Ironman i = new Ironman("���", 40);
		i.print();
		i.attack();
		i.smoke();
		i.playGame();

		Hulk h = new Hulk("���", 30);
		h.print();
		h.attack();

		// �͸� ���� Ŭ����(anonymous inner class)
		Avengers a = new Avengers() {
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("���� ������");
			}
		};

		// Avengers�� ���� Ŭ����, Ŭ������??? �� ���� ��ü : a
		// a�� ĸƾ�Ƹ޸�ī����
		a.attack();

		Menu m = new Menu() {
			@Override
			public void printDesc() {
				// TODO Auto-generated method stub
				System.out.println("������ ���� �޴ٸ��� �Ἥ...");
			}
		};
		// Menu�� ���� ��ӹ޴� Ŭ�������� �������� ���� m
		m.name = "����A��Ʈ";
		m.price = 29000;
		m.printInfo();
		m.printDesc();

	}
}
