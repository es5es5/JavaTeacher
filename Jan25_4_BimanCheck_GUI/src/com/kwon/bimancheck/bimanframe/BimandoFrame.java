package com.kwon.bimancheck.bimanframe;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// ��� : ��� �� �����ް�, �߰�Ȯ��
public class BimandoFrame extends JFrame {
	private JLabel heightLB; 		// ���������ִ� ĭ
	private JTextField heightTF;  	// ���� ���� �ڽ�
	private JLabel weightLB;
	private JTextField weightTF;
	private JLabel resultLB;
	private JButton btn;
	
	public BimandoFrame() {
		// TODO Auto-generated constructor stub
	}

	public BimandoFrame(String title) throws HeadlessException {
		super(title);
		GridLayout gl = new GridLayout(3, 2); // 3�� 2�� ������ ��ġ
		this.setLayout(gl); // �� �����ӿ� ����
		
		heightLB = new JLabel("Ű : ");
		this.add(heightLB);
		
		heightTF = new JTextField();
		this.add(heightTF);
		
		weightLB = new JLabel("������ : ");
		add(weightLB);
		
		weightTF = new JTextField();
		add(weightTF);
		
		resultLB = new JLabel();
		add(resultLB);
		
		btn = new JButton("�������");
		add(btn);
		
		Doctor d = new Doctor();
		btn.addActionListener(d);
	}
	
	// ��� ���� Ŭ����(member inner class)
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
				resultLB.setText("����");
			} else if (bmi >= 30) {
				resultLB.setText("�ߵ��");
			} else if (bmi >= 25) {
				resultLB.setText("�浵��");
			} else if (bmi >= 23) {
				resultLB.setText("��ü��");
			} else if (bmi >= 18.5) {
				resultLB.setText("����");
			} else {
				resultLB.setText("��ü��");
			}
			
		}
	}
}






















