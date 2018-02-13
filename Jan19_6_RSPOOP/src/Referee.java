public class Referee {
	static String[] handTable 
		= new String[] { "", "가위", "바위", "보" };		
	
	public void showHelp() {
		System.out.println("-----------");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-----------");
		System.out.print("뭐 : ");
	}

	public void judge(User u, Com c) {
		int result = u.hand - c.hand;

		if (result == 0) {
			System.out.println("무승부");
		} else if (result == -1 || result == 2) {
			System.out.println("패");
		} else {
			System.out.println("승");
		}
	}

	public void printHand(User u, Com c) {
		System.out.printf("나 : %s\n", handTable[u.hand]);
		System.out.printf("컴 : %s\n", handTable[c.hand]);
	}

	public void play(User u, Com c) {

		while (true) {
			showHelp();
			u.fire();
			c.fire();
			printHand(u, c);
			judge(u, c);
		}
	}

}
