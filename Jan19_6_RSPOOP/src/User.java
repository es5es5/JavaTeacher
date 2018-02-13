import java.util.Scanner;

public class User {
	int hand;
	Scanner brain;

	public User() {
		brain = new Scanner(System.in);
	}
	
	public void fire() {
		hand = brain.nextInt();
		if (hand <= 0 || hand > 3) {
			fire();
		}
	}
}
