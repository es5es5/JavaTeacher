
public class HAMain {
	public static void main(String[] args) {
		Human h1 = new Human("ȫ�浿", 30, '��');
		Dog d1 = new Dog("�ǻ�", 2, "������");
		//h1.introduce();
		
		
		// h1.name = "��浿"; 
		h1.pet = d1;
		h1.introduce();
		
		// h1�� pet�� �������
		h1.pet.printInfo();
		
		// h1�� pet�� ���� ���
		System.out.println( h1.pet.type );
		System.out.println("=====");
		
		Human h2 = new Human("��浿", 20, '��');
		Dog d2 = new Dog("ö��", 2, "��찳");
		h2.pet = d2;
		System.out.println( h2.name );
		System.out.println( h2.pet.name );
		System.out.println( h2.age  );
		System.out.println( h2.pet.age );
		
		System.out.println("=====");
		
		Human h3 = new Human("�ֱ浿", 25, '��');
		h3.pet = new Dog("����", 3, "�ҵ�");
		System.out.println(h3.name);
		System.out.println(h3.pet.name);
		
//		h3.name = "��浿";
//		
//		String t = "�ڱ浿";
//		h3.name = t;
		
		System.out.println("=====");
		Human h4 = new Human("�ڱ浿", 13, '��', new Dog("��Ű", 2, "ǳ�갳"));
		System.out.println(h4.name);
		System.out.println(h4.pet.name);
		
	}
}










