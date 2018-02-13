
public class AMain {
	public static void main(String[] args) {
		Ironman i = new Ironman();
		i.attack();
		
		Doctor d = new Doctor("aa", 11);
		d.print();
		System.out.println( d.calculateBMI(180, 80));
		
	}
}
