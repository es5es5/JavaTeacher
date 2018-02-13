public class Referee {
	static String[] handTable 
		= new String[] { "", "����", "����", "��" };		
	
	public void showHelp() {
		System.out.println("-----------");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ��");
		System.out.println("-----------");
		System.out.print("�� : ");
	}

	public void judge(User u, Com c) {
		int result = u.hand - c.hand;

		if (result == 0) {
			System.out.println("���º�");
		} else if (result == -1 || result == 2) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}

	public void printHand(User u, Com c) {
		System.out.printf("�� : %s\n", handTable[u.hand]);
		System.out.printf("�� : %s\n", handTable[c.hand]);
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
