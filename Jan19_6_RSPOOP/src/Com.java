import java.util.Random;

public class Com {
	int hand;
	ComBrain brain;

	public Com() {
		brain = new ComBrain();
	}
	
	public void fire() {
		hand = brain.think();
	}
}
