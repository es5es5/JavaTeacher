// �߻�Ŭ����
//		�߻�޼ҵ带 �ϳ��� ������ Ŭ������ �߻�Ŭ��������
//		��ü�� ����� ����
public abstract class Avengers {
	String name;
	int age;

	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

	// �߻�޼ҵ� : ������ ���� �޼ҵ�
	//			����Ŭ�������� �ݵ�� �������̵��� �ؾ߸� ��
	public abstract void attack();
}









