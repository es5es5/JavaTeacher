
public class Teacher extends Human{
	String subject;
	
	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.println(subject);
	}
	
	public void teach() {
		System.out.println("¹¹¶ó¹¹¶ó");
	}
	
}
