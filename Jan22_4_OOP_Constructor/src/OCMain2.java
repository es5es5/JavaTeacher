
public class OCMain2 {
	public static void main(String[] args) {
		
		Computer cc1 = new Computer(3.0, 8, 256);
		cc1.printInfo();
		
		Computer cc2 = new Computer();
		cc2.cpu = 3.0;
		cc2.printInfo();
		
		
		Cat c = new Cat("����", 2);
		c.print();

		Cat c2 = new Cat("��Ű", 3);
		c2.print();

		Book b1 = new Book("�ڹ�", 10000, "�ֵ���ũ");
		b1.print();
		
		Book b2 = new Book("JSP", 15000, "�Ѻ�");
		b2.print();
	}
}
