
public class Ironman extends Avengers implements Smoker, Gamer  {
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�� �߻�");
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("��� �ǿ��");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("�����ϱ�");
	}
	
	
}








