import java.util.Random;

public class IAMain {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(100));
		System.out.println("----------------");
		Box b = new Box();
		System.out.println(b.nextInt(100));
	}
}
