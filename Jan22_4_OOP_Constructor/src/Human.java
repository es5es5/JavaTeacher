
public class Human {
	// �������
	String name;
	String gender;
	public Human() {
		System.out.println("����");
	}
	
	// ������ �޼ҵ�
	public void changeName(String name) {
		// �ڹٴ� �������, �������� �̸� ���ٰ� ������ �ƴ�
		// ������ �켱
		//System.out.println(name);
		// �������, �������� �̸� ������ ���� �ϰ� ������
		//System.out.println(this.name);
		
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(gender);
	}
	
}













