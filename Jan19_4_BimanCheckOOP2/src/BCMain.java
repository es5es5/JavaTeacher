
public class BCMain {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		Nurse n = new Nurse();
		Guest g = new Guest();
		n.sendPaperToGuest(g, d);
	}
}
