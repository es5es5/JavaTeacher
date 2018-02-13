package com.kwon.os.main;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.kwon.os.space.Human;
import com.kwon.os.space.Planet;
import com.kwon.os.space.PowerRanger;

public class OSMain {
	public static void main(String[] args) {
		// 이름이 지구인 행성만들기
		Planet p = new Planet("지구");
		
		// 사이즈를 100
		p.setSize(100);
		
		// 이름이 홍길동인 사람 만들기
		Human h = new Human("홍길동");
		
		// 지구에 홍길동을 입주
		p.add(h);
		
		// 영웅 인터페이스를 구현하는 파워레인저 클래스 만들고
		// 파워레인저 만들기
		PowerRanger pr = new PowerRanger();
		
		// 홍길동의 전담영웅은 파워레인저
		h.pickMyHero(pr);
		
		// 홍길동이 도움요청
		h.helpMe();
		
		// 보이게
		p.setVisible(true);
	}
}








