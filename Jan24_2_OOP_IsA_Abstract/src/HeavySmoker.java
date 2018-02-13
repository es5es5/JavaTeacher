
public class HeavySmoker implements Smoker {
	public void heavySmoke() {
		System.out.println("한번에 10개 피우기");
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("담배 피우기");
	}
}
