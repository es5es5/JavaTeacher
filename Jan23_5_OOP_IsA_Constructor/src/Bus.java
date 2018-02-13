
public class Bus extends Car {
	String lineNo;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String name, String no, String lineNo) {
		super(name, no);
		this.lineNo = lineNo;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(lineNo);
	}
}
