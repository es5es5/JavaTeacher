package com.kwon.am.jugong102;

import com.kwon.am.jugong101.Jugong101;

public class ExJugong101 extends Jugong101{
	public void say() {
		Jugong101 friend = new Jugong101();
		friend.printInfo();
		System.out.println(friend.name);
		System.out.println(friend.password);
		System.out.println(friend.recycleDay);
		System.out.println(friend.money);
	}
}
