import java.util.Random;

public class Enemy {
	Random brain;
	
	// 숫자를 생각해서 심판한테 전달
	public int say() {
		brain = new Random();
		return brain.nextInt(10000);
	}
	
}














