
public class OMain {
	public static void main(String[] args) {
		// �� ���̰� 3��
		//int age = 3;
		//System.out.println(age);
		
		// �� �̸��� �ǻ�
		//String name = "�ǻ�";
		//System.out.println(name);
		
		// �� �����԰� 3.5
		//double weight = 3.5;
		//System.out.println(weight);
		
		// ���̰� 3���̰�, �̸��� �ǻ��̰�, �����԰� 3.5�� ��
		// �ǻ�Ȱ�� �����ϴ� ��� : ��ü
		// ��ü�� ������� : Ŭ���� ����°� ����
		
		// Ŭ������ ������ = new Ŭ������();
		Dog d1 = new Dog();
		d1.name = "�ǻ�";
		d1.age = 3;
		d1.weight = 3.5;
		d1.bark();
		d1.printInfo();
		
		Dog d2 = new Dog();
		d2.name = "ö��";
		d2.age = 4;
		d2.weight = 2.5;
		d2.bark();
		d2.printInfo();
		
		// ��ǻ��
			// cpu
			// ram
			// hdd
		
		// cpu�� 3G, ram 4G, hdd 128G
		Computer c1 = new Computer();
		c1.cpu = 3;
		c1.ram = 4;
		c1.hdd = 128;
		c1.printInfo();
		
		// cpu�� 2.5G, ram 8G, hdd 256G
		Computer c2 = new Computer();
		c2.cpu = 2.5;
		c2.ram = 8;
		c2.hdd = 256;
		c2.printInfo();
		
	}
}















