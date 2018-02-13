
public class RSPMain {
	public static void main(String[] args) {
		Com c = new Com();
		Referee r = new Referee();
		User u = new User();
		r.play(u, c);
	}
}
