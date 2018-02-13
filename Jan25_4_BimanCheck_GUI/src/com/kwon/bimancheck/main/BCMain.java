package com.kwon.bimancheck.main;

import com.kwon.bimancheck.bimanframe.BimandoFrame;

public class BCMain {
	public static void main(String[] args) {
		BimandoFrame bf = new BimandoFrame("비만도 검사");
		bf.setSize(300, 200);
		bf.setVisible(true);
	}
}
