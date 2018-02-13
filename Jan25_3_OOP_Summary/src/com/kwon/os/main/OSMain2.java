package com.kwon.os.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OSMain2 {
	public static void main(String[] args) {
		// 타이틀이 지구인 JFrame 만들기
		JFrame p = new JFrame("지구");
		// 그거 사이즈 300, 400으로
		p.setSize(300, 400);
		
		// 텍스트가 홍길동인 JButton 만들기
		JButton h = new JButton("홍길동");
		// JFileChooser만들기
		//JFileChooser h = new JFileChooser();
		// JTextField만들기
		//JTextField h = new JTextField();
		
		// 후뢰시맨 만들기
		Flashman f = new Flashman();
		
		// 홍길동이 후뢰시맨을 찜(addActionListener)
		h.addActionListener(f);
		
		// 지구에 add
		p.add(h);
		
		// 그거 보이게
		p.setVisible(true);
	}

}




