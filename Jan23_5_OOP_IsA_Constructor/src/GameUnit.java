// �����ڴ� ����� �ȵ�
// ��ü�� ����� ����Ŭ���� �⺻�����ڸ� �ڵ����� �ҷ�����

public class GameUnit {
	int hp;
	int atk;
	int def;
	
	public GameUnit() {
		// TODO Auto-generated constructor stub
		System.out.println("�������� �⺻������");
	}
	
	
	
	public GameUnit(int hp, int atk, int def) {
		//this(); // �� Ŭ���� �⺻ ������ �θ���
		// �ڹٴ� ���� ��ü�� ����� ����Ŭ���� �⺻�����ڸ� �ڵ����� �ҷ�����
		// �װ� ����� ����
		super(); // ���� Ŭ���� �⺻ ������ �θ���
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public void printInfo() {
		
		System.out.println(hp);
		System.out.println(atk);
		System.out.println(def);
	}
}





