package com.kwon.bimancheck.bimanframe;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 상속 : 기능 다 물려받고, 추가확장
public class BimandoFrame extends JFrame {
	private JLabel heightLB; 		// 글자적혀있는 칸
	private JTextField heightTF;  	// 글자 적는 박스
	private JLabel weightLB;
	private JTextField weightTF;
	private JLabel resultLB;
	private JButton btn;
	
	public BimandoFrame() {
		// TODO Auto-generated constructor stub
	}

	public BimandoFrame(String title) throws HeadlessException {
		super(title);
		GridLayout gl = new GridLayout(3, 2); // 3행 2열 격자형 배치
		this.setLayout(gl); // 이 프레임에 적용
		
		heightLB = new JLabel("키 : ");
		this.add(heightLB);
		
		heightTF = new JTextField();
		this.add(heightTF);
		
		weightLB = new JLabel("몸무게 : ");
		add(weightLB);
		
		weightTF = new JTextField();
		add(weightTF);
		
		resultLB = new JLabel();
		add(resultLB);
		
		btn = new JButton("결과보기");
		add(btn);
		
		Doctor d = new Doctor();
		btn.addActionListener(d);
	}
	
	// 멤버 내부 클래스(member inner class)
	private class Doctor implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String h = heightTF.getText();
			// String -> double
			String w = weightTF.getText();
			double hh = Double.parseDouble(h);
			double ww = Double.parseDouble(w);
			hh /= 100;
			double bmi = ww / (hh * hh); 
			if (bmi >= 35) {
				resultLB.setText("고도비만");
			} else if (bmi >= 30) {
				resultLB.setText("중등도비만");
			} else if (bmi >= 25) {
				resultLB.setText("경도비만");
			} else if (bmi >= 23) {
				resultLB.setText("과체중");
			} else if (bmi >= 18.5) {
				resultLB.setText("정상");
			} else {
				resultLB.setText("저체중");
			}
			
		}
	}
}






















