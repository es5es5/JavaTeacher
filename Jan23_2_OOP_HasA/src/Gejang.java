public class Gejang {
	String name;
	int price;
	double weight;
	// 세상의 모든 게장은 김수미
	// 실제 게장이 없더라도 사용가능한 정보
	static GejangProducer producer = new GejangProducer("김수미", 60);

	public Gejang() {
		// TODO Auto-generated constructor stub
	}

	public Gejang(String name, int price, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(weight);
	}

}
