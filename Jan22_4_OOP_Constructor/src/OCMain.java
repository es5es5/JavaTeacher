
public class OCMain {
	public static void main(String[] args) {
	
		// Å¬·¡½º¸í º¯¼ö¸í = new »ý¼ºÀÚ();
		Item i1 = new Item();
		i1.name = "º¸µå¸¶Ä«";
		i1.price = 1000;
		i1.printItem();
		
		Item i2 = new Item();
		i2.name = "¿¬ÇÊ";
		i2.price = 300;
		i2.printItem();
		
		Human h1 = new Human();
		h1.name = "È«±æµ¿";
		h1.gender = "³²ÀÚ";
		h1.changeName("È«±æµ¢");
		h1.printInfo();
		
		Dog d = new Dog();
		d.name = "»Ç»ß";
		d.age = 3;
		d.changeAge(4);
		d.changeName("Ã¶¼ö");
		d.printInfo();
	}
}












