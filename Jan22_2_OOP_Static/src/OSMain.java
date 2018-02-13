// 메모리
//		.java(소스) -> .class(기계어) -> 실행하면
//		1. 기계어로 번역 된 소스가 stack에 다 실림
//		2. static 멤버 변수들이 static에 다 실림
//		3. main에서 진행 시작

public class OSMain {
	public static void main(String[] args) {
		// 
		
		
		
		
		//System.out.println(g1.name);
		//System.out.println(g1.price);
		System.out.println(Gejang.producer);
		
		Gejang g1 = new Gejang();
		g1.name = "설 특선 양념게장";
		g1.price = 59900;
		g1.weight = 10;
		g1.printInfo();
		
		g1.producer = "김수미 아줌마 며느리";
		//Gejang.PRODUCER2 = "김수미 아줌마 며느리";
		
		Gejang g2 = new Gejang();
		g2.name = "간장게장";
		g2.price = 39900;
		g2.weight = 10;
		g2.printInfo();
		g1.printInfo();
	}
}





