
public class Referee {
	
	public boolean judge(int ans, int playerAns, int turn) {
		if (ans == playerAns) {
			System.out.printf("%d번만에 정답\n", turn);
			return true;
		} else if (ans > playerAns) {
			System.out.println("그것보다 답은 크다");
		} else {
			System.out.println("그것보다 답은 작다");
		}
		return false;
	}
	
	public void play(Enemy e, Player p) {
		int ans = e.say();
		
		int playerAns = 0;
		
		for (int turn = 1; true; turn++) {
			System.out.print("뭐 : ");
			playerAns = p.say();

		}

	}

}
