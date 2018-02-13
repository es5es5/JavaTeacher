
public class Kwon extends Student implements Son, Friend {
	public Kwon() {
		// TODO Auto-generated constructor stub
	}

	public Kwon(String name, int age, String phoneNo) {
		super(name, age, phoneNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("놀아주기");
	}

	@Override
	public void hyodo() {
		// TODO Auto-generated method stub
		System.out.println("효도하기");
	}

}
