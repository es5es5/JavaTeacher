
public class YMain {
	public static void main(String[] args) {
		ShoppingMall s1
			= new ShoppingMall("����", 500);
		
		ShoppingMall s2
			= new ShoppingMall("����", 300);
		
		Programmer.onDutyTime();
		
		Programmer p 
			= new Programmer("ȫ�浿", 30);
		
		p.introduce();
		System.out.println(p.work("��"));
		p.onDutyTime();
	}
}
