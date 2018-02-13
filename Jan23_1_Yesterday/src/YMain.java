
public class YMain {
	public static void main(String[] args) {
		ShoppingMall s1
			= new ShoppingMall("º¼Ææ", 500);
		
		ShoppingMall s2
			= new ShoppingMall("¿¬ÇÊ", 300);
		
		Programmer.onDutyTime();
		
		Programmer p 
			= new Programmer("È«±æµ¿", 30);
		
		p.introduce();
		System.out.println(p.work("ÀÏ"));
		p.onDutyTime();
	}
}
