import java.util.Random;

public class Enemy {
	Random brain;
	
	// ���ڸ� �����ؼ� �������� ����
	public int say() {
		brain = new Random();
		return brain.nextInt(10000);
	}
	
}














