
public class Referee {
	
	public boolean judge(int ans, int playerAns, int turn) {
		if (ans == playerAns) {
			System.out.printf("%d������ ����\n", turn);
			return true;
		} else if (ans > playerAns) {
			System.out.println("�װͺ��� ���� ũ��");
		} else {
			System.out.println("�װͺ��� ���� �۴�");
		}
		return false;
	}
	
	public void play(Enemy e, Player p) {
		int ans = e.say();
		
		int playerAns = 0;
		
		for (int turn = 1; true; turn++) {
			System.out.print("�� : ");
			playerAns = p.say();

		}

	}

}
