
public class OCMain {
	public static void main(String[] args) {
	
		// Ŭ������ ������ = new ������();
		Item i1 = new Item();
		i1.name = "���帶ī";
		i1.price = 1000;
		i1.printItem();
		
		Item i2 = new Item();
		i2.name = "����";
		i2.price = 300;
		i2.printItem();
		
		Human h1 = new Human();
		h1.name = "ȫ�浿";
		h1.gender = "����";
		h1.changeName("ȫ�浢");
		h1.printInfo();
		
		Dog d = new Dog();
		d.name = "�ǻ�";
		d.age = 3;
		d.changeAge(4);
		d.changeName("ö��");
		d.printInfo();
	}
}












