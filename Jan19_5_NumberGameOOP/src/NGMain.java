
public class NGMain {
	public static void main(String[] args) {
		Referee r = new Referee();
		Enemy e = new Enemy();
		Player p = new Player();
		r.play(e, p);
	}
}
