
public class OMain {
	public static void main(String[] args) {
		int a = 1024;
		
		Product pp = new Product();
		pp.price = 300;
		pp.name = "연필";
		pp.madeIn = "베트남";
		pp.showInfo();
		
		// 품명이 형광펜, 가격이 500원, 원산지가 중국
		Product p1 = new Product();
		p1.name = "형광펜";
		p1.price = 500;
		p1.madeIn = "중국";
		p1.showInfo();
		// 품명이 보드마카, 가격이 1000원, 원산지가 한국
		
		// 품명이 종이컵, 가격이 10원, 원산지가 베트남
		
	}
}
