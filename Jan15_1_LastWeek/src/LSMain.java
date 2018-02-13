import java.util.Scanner;

public class LSMain {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = keyboard.nextInt();
		
		System.out.print("y : ");
		int y = keyboard.nextInt();
		
		int a = x + y;		
		int c = x * y;		double d = x / (double) y;
		
		System.out.printf("%d + %d = %d\n", x, y, a);
		System.out.printf("%d - %d = %d\n", x, y, (x - y));
		System.out.printf("%d * %d = %d\n", x, y, c);
		System.out.printf("%d / %d = %.2f\n", x, y, d);
		
		if (a % 2 == 0) {
			System.out.println("ÇÕÀÌ Â¦¼ö¿ä");
		}
		
		if((x - y) % 2 == 0) {
			System.out.println("Â÷°¡ Â¦¼ö");
		}
		
	}
}









