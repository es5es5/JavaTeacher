//	������
public class Programmer {
	// ������� : �Ӽ�
	String name;
	int age;
	static boolean nightDuty = true;
	// �⺻ ������ : spring��� ���
	public Programmer() {
		System.out.println("�ȳ�");
	}
	// �����ε��� ������
	public Programmer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// �ڱ�Ұ�
	public void introduce() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", age);
		System.out.println("�߱ٿ��� : " + nightDuty);
	}
	// �ϰŸ� �ָ� ���α׷��� ����
	public String work(String order) {
		return "���α׷�";
	}
	// ���� �����ڰ� ��� ��� ������ �޼ҵ� 
	public static void onDutyTime() {
		System.out.println("FM");
	}
	
}













