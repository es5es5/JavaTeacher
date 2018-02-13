
public class IAMain {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "±è±æµ¿";
		h1.age = 30;
		// h1.korScore = 90;
		h1.introduce();
		// h1.doYaja();
		System.out.println("-------------------");
		Student s1 = new Student();
		s1.name = "È«±æµ¿";
		s1.age = 12;
		s1.korScore = 100;
		s1.introduce();
		s1.doYaja();
		
		System.out.println("--------------------");
		
		Teacher t1 = new Teacher();
		t1.name = "±è±æµ¿";
		t1.age = 40;
		t1.subject = "±¹¾î";
		t1.introduce();
		t1.teach();
		
	}
}











